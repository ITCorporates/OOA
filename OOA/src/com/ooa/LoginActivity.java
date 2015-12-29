package com.ooa;

import android.app.Activity;
import android.os.Bundle;

public class LoginActivity extends Activity {
 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login_screen);
		getActionBar().hide();
		initial();
	}

	private void initial() {
		// TODO Auto-generated method stub
		
	}
}
