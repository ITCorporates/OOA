package com.ooa;

import org.json.JSONObject;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity implements RestApiCallListener {
	EditText email, password;
	private String response;
	private String emailInput;
	Button btn_login;

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login_screen);
		getActionBar().hide();
		initial();
	}

	private void initial() {
		// TODO Auto-generated method stub
		email = (EditText) findViewById(R.id.email);
		password = (EditText) findViewById(R.id.password);
		btn_login = (Button) findViewById(R.id.btn_login);
		btn_login.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// Toast.makeText(LoginActivity.this, "Invalid email address",
				// Toast.LENGTH_SHORT).show();
				emailInput = email.getText().toString().trim();

				if (emailInput.matches(Constants.EmailPattern)) {
					Toast.makeText(LoginActivity.this, "valid email address", Toast.LENGTH_SHORT).show();

				} else {
					Toast.makeText(LoginActivity.this, "Invalid email address", Toast.LENGTH_SHORT).show();
					// email.setBackgroundResource(R.drawable.edit_red_line);
				}
				login();
			}

			private void login() {
				// TODO Auto-generated method stub

				// Set the User name and password in preferences when toggle is
				// on

				try {
					JSONObject JsonObject = new JSONObject();
					JsonObject.put("username", email.getText().toString());
					JsonObject.put("password", password.getText().toString());

					RestApiCallPost apiCallPost = new RestApiCallPost(Constants.LOGIN, LoginActivity.this, JsonObject,
							1);
					apiCallPost.start();

				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		});

	}

	@Override
	public void onResponse(String response, int pageId) {
		// TODO Auto-generated method stub
		this.response = response;

		switch (pageId) {
		case 1:
			Log.e("Response of Passenger Login", response);
			handler.sendEmptyMessage(pageId);

			break;
		}

	}

	@Override
	public void onError(String error) {
		// TODO Auto-generated method stub

	}

	Handler handler = new Handler() {

		public void handleMessage(android.os.Message msg) {

			switch (msg.what) {

			case 1:
				// "appVersionrequired"
				try {
					JSONObject jsonObject = new JSONObject(response);

					if (jsonObject.getString("status").equals("ok")) {
						Log.e("Success", "Welcome ");

					} else if (jsonObject.getString("status").equals("error")) {
						Log.e("ERROR", "NO Response");
					}

					/*
					 * else if(jsonObject.getString("message").equals(
					 * "Invalid credentials supplied or activation is pending"))
					 * { Utils.getAlertDialog(PassengerMainActivity.this,
					 * "Invalid credentials supplied or activation is pending",
					 * new Handler()).show(); }
					 */

					else if (jsonObject.getString("status").equals("alreadyloggedin")) {
					}

					else if (jsonObject.getString("message").equals(
							"Please use your registered device or call your system administrator for support.")) {
					}

				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		}

	};

}
