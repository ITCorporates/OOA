package com.ooa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity 
{
	Button btn_login,btn_booking;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		getActionBar().hide();
		
		initial();
	
	}

	private void initial() {
		// TODO Auto-generated method stub
		btn_login=(Button)findViewById(R.id.btn_login); 
		btn_booking=(Button)findViewById(R.id.btn_booking);
	
		btn_login.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent mIntent=new Intent(MainActivity.this,LoginActivity.class);
				startActivity(mIntent);
			}
		});
	}
}
