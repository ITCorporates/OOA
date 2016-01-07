package com.ooa;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {
	EditText emailEditText, passEditText;
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
		emailEditText = (EditText) findViewById(R.id.email);
		passEditText = (EditText) findViewById(R.id.password);
		btn_login = (Button) findViewById(R.id.btn_login);
		btn_login.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v)
			{
				final String email = emailEditText.getText().toString();
				if (!isValidEmail(email)) 
				{
					emailEditText.setError("Invalid Email");
				}

				final String pass = passEditText.getText().toString();
				if (!isValidPassword(pass)) 
				{
					passEditText.setError("Invalid Password");
				}

			}
		});

	}
	
	private boolean isValidEmail(String email) {
		String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
				+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

		Pattern pattern = Pattern.compile(EMAIL_PATTERN);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

	// validating password with retype password
	private boolean isValidPassword(String pass) {
		if (pass != null && pass.length() > 6) {
			return true;
		}
		return false;
	}

}
