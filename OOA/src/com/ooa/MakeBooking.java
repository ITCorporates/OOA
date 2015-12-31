package com.ooa;

import android.app.Activity;
import android.os.Bundle;

public class MakeBooking extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.make_booking);
		getActionBar().hide();
	}
}
