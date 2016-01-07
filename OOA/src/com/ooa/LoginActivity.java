package com.ooa;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {
	EditText email, password;
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

				String emailPattern = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

				if (emailInput.matches(emailPattern)) {
					Toast.makeText(LoginActivity.this, "valid email address", Toast.LENGTH_SHORT).show();

				} else {
					Toast.makeText(LoginActivity.this, "Invalid email address", Toast.LENGTH_SHORT).show();
					// email.setBackgroundResource(R.drawable.edit_red_line);
				}

			}
		});

	}

}
