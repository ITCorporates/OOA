package com.ooa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.GZIPInputStream;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;

import android.os.Looper;
import android.util.Log;
import android.view.View.OnClickListener;

public class RestApiCallPost extends Thread {

	String url;
	RestApiCallListener listener;
	JSONObject jsonObject;
	int pageId;

	public RestApiCallPost(String url, RestApiCallListener listener,
			JSONObject jsonObject, int pageId) {
		this.url = url;
		this.listener = listener;
		this.jsonObject = jsonObject;
		this.pageId = pageId;
	}


	@Override
	public void run() {
		Looper.prepare();

		HttpClient client = new DefaultHttpClient();

		try {

			HttpPost post = new HttpPost(url);
			List<NameValuePair> nVP = new ArrayList<NameValuePair>();
			nVP.add(new BasicNameValuePair("JsonObject", jsonObject.toString()));
			post.setEntity(new UrlEncodedFormEntity(nVP));
			post.setHeader("Accept-Encoding", "gzip");
			Log.v("REQUEST" + " " + "of" + url, "TestPOST - nVP = " + nVP.toString());
			HttpResponse response = client.execute(post);
			HttpEntity entity1 = response.getEntity();

			if (entity1 != null) {

				InputStream instream = entity1.getContent();
				org.apache.http.Header contentEncoding = response.getFirstHeader("Content-Encoding");
				if (contentEncoding != null && ((NameValuePair) contentEncoding).getValue().equalsIgnoreCase("gzip")) {
					instream = new GZIPInputStream(instream);
				}
				String response_string = convertToString(instream);
				instream.close();
				sendResponse(response_string, pageId);
			}

			else {
				sendError("No Data Found");
			}

		} catch (ClientProtocolException e) {
			sendError("No Data Found");
			// e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			Looper.loop();
			sendError("No Data Found");
		}

		catch (Exception e) {
			e.printStackTrace();
			Looper.loop();
			sendError("Time out Excption.");
		}
	}

	private void sendResponse(String response, int pageId) {
		if (listener != null) {
			listener.onResponse(response, pageId);
		}
	}

	private void sendError(String error) {
		if (listener != null) {
			listener.onError(error);
		}
	}

	private String convertToString(InputStream content) throws Exception {

		InputStreamReader inputStreamReader = new InputStreamReader(content);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String s = "";
		StringBuffer buffer = new StringBuffer();
		while ((s = bufferedReader.readLine()) != null) {
			buffer.append(s);
		}

		return buffer.toString();
	}
}