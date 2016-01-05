package com.ooa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MakeBooking extends Activity implements OnClickListener {

	Button btn_cancel, btn_login, btn_proceed, pickuploc, dropffloc, hours, minutes, ampm, returnhours, returnminutes,
			returnampm;
	Button route;
	EditText pickuplandmark, dropofflandmark;
	ListView routelist;
	CustomBaseAdapter bAdap;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.make_booking);
		getActionBar().hide();
		initial();

	}

	private void initial() {
		btn_cancel = (Button) findViewById(R.id.btn_cancel);
		btn_cancel.setOnClickListener(this);
		btn_login = (Button) findViewById(R.id.btn_login);
		btn_login.setOnClickListener(this);
		btn_proceed = (Button) findViewById(R.id.btn_proceed);
		btn_proceed.setOnClickListener(this);
		route = (Button) findViewById(R.id.route);
		route.setOnClickListener(this);
		pickuploc = (Button) findViewById(R.id.pickuploc);
		pickuploc.setOnClickListener(this);
		dropffloc = (Button) findViewById(R.id.dropffloc);
		dropffloc.setOnClickListener(this);
		hours = (Button) findViewById(R.id.hours);
		hours.setOnClickListener(this);
		minutes = (Button) findViewById(R.id.minutes);
		minutes.setOnClickListener(this);
		ampm = (Button) findViewById(R.id.ampm);
		ampm.setOnClickListener(this);
		returnhours = (Button) findViewById(R.id.returnhours);
		returnhours.setOnClickListener(this);
		returnminutes = (Button) findViewById(R.id.returnminutes);
		returnminutes.setOnClickListener(this);
		returnampm = (Button) findViewById(R.id.returnampm);
		returnampm.setOnClickListener(this);
		/* edit text */

		/* list */
		routelist = (ListView) findViewById(R.id.routelist);
		
		;

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn_cancel:
			finish();
			break;
		case R.id.btn_login:
			Intent mIntent = new Intent(MakeBooking.this, LoginActivity.class);
			startActivity(mIntent);
			break;
		case R.id.btn_proceed:
			//Toast.makeText(getApplicationContext(), "WELCOME", Toast.LENGTH_SHORT).show();
			Intent mintent = new Intent(MakeBooking.this, Cart.class);
			startActivity(mintent);
		case R.id.route:
//			routelist.setAdapter(bAdap);
		}

	}
}
