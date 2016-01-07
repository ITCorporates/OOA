package com.ooa;

import android.app.Activity;
import android.app.AlertDialog;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MakeBooking extends Activity {
	AlertDialog dialogDetails = null;
	Button route;
	TextView Chd2Moh;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.make_booking);
		getActionBar().hide();

		route = (Button) findViewById(R.id.route);

		route.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				LayoutInflater inflater = LayoutInflater.from(v.getContext());
				View dialogview = inflater.inflate(R.layout.routelist, null);

				AlertDialog.Builder dialogbuilder = new AlertDialog.Builder(v.getContext());

				dialogbuilder.setView(dialogview);
				dialogDetails = dialogbuilder.create();
				dialogDetails.show();
				Chd2Moh = (TextView) dialogDetails.findViewById(R.id.Chd2Moh);
				Chd2Moh.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						// image1.setImageResource(R.drawable.cash);

						dialogDetails.dismiss();
						route.setText("\t" + "Chandigarh To Mohali");


					}
				});

			}
		});

	}
}
