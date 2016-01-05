package com.ooa;

import java.util.ArrayList;
import java.util.HashMap;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomBaseAdapter extends BaseAdapter {
	LayoutInflater inflater;
	Context context;
	ArrayList<HashMap<String, String>> data;

	public CustomBaseAdapter(Context context, ArrayList<HashMap<String, String>> data) {

		this.context = context;
		this.data = data;
	}

	@Override
	public int getCount() {
		return data.size();
	}

	@Override
	public Object getItem(int position) {
		return data.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@SuppressWarnings("null")
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder;
		if (convertView == null) {
			// We must create a View:
			holder = new ViewHolder();
			convertView = inflater.inflate(R.layout.route_list, parent, false);
			holder.routetext = (TextView) convertView.findViewById(R.id.routetext);
			convertView.setTag(holder);
		} 
		else 
		{
			holder = (ViewHolder) convertView.getTag();
		}

		holder.routetext.setText("Mohali");
		// Here we can do changes to the convertView, such as set a text on a
		// TextView
		// or an image on an ImageView.
		return convertView;
	}

	class ViewHolder {
		TextView routetext;

	}

}
