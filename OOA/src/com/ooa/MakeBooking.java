package com.ooa;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MakeBooking extends Activity {
	AlertDialog dialogDetails = null;
	Button route, pickuploc, dropffloc, btn_cancel, btn_login;
	TextView ChdnMoh, Moh2Moh, Chd2Chd;
	TextView sec50, sec51, sec52, sec53, sec54, sec55, sec56, sec37, sec12, sec49, sec15, sec16, sec17, sec18, sec19,
			sec20, sec21, sec22, sec23, sec14, sec11, sec3, sec4, sec5, sec6, sec7, sec8, sec9, sec24, sec25, sec26,
			sec39, sec36, sec40, sec42, sec43, sec44, sec45, sec46, sec47, sec38, sec27, sec28, sec29, sec30, sec31,
			sec32, sec68, sec67, sec66, sec65, sec64, sec63, sec62, sec61, sec60, sec33, sec34, sec35, sec59, sec58,
			sec69, sec70, sec57, sec79, sec82, sec81, sec80, sec78, sec77, sec76, sec75, sec73, sec72, sec71, phs4,
			phs3, phs2, phs1, phs8, phs5, phs7, phs9;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.make_booking);
		getActionBar().hide();
		btn_cancel = (Button) findViewById(R.id.btn_cancel);
		btn_login = (Button) findViewById(R.id.btn_login);
		route = (Button) findViewById(R.id.route);
		pickuploc = (Button) findViewById(R.id.pickuploc);
		dropffloc = (Button) findViewById(R.id.dropffloc);
		// initial();
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
				ChdnMoh = (TextView) dialogDetails.findViewById(R.id.ChdnMoh);
				Moh2Moh = (TextView) dialogDetails.findViewById(R.id.Moh2Moh);
				Chd2Chd = (TextView) dialogDetails.findViewById(R.id.Chd2Chd);
				ChdnMoh.setOnClickListener(new OnClickListener() {

					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						// image1.setImageResource(R.drawable.cash);

						dialogDetails.dismiss();
						route.setText("\t" + "Chandigarh And Mohali");

					}
				});

				Moh2Moh.setOnClickListener(new View.OnClickListener() {

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						dialogDetails.dismiss();

						route.setText("\t" + "Mohali To Mohali");
					}
				});
				Chd2Chd.setOnClickListener(new View.OnClickListener() {

					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						dialogDetails.dismiss();
						route.setText("\t" + "Chandigarh To Chandigarh");
					}
				});
			}
		});
		pickuploc.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				if (route.getText().toString().trim().equalsIgnoreCase("Chandigarh And Mohali")) {

					LayoutInflater inflater = LayoutInflater.from(v.getContext());
					View dialogview = inflater.inflate(R.layout.listchdmoh, null);

					AlertDialog.Builder dialogbuilder = new AlertDialog.Builder(v.getContext());

					dialogbuilder.setView(dialogview);
					dialogDetails = dialogbuilder.create();
					dialogDetails.show();
					sec50 = (TextView) dialogDetails.findViewById(R.id.sec50);
					sec51 = (TextView) dialogDetails.findViewById(R.id.sec51);
					sec52 = (TextView) dialogDetails.findViewById(R.id.sec52);
					sec53 = (TextView) dialogDetails.findViewById(R.id.sec53);
					sec54 = (TextView) dialogDetails.findViewById(R.id.sec54);
					sec55 = (TextView) dialogDetails.findViewById(R.id.sec55);
					sec56 = (TextView) dialogDetails.findViewById(R.id.sec56);
					sec37 = (TextView) dialogDetails.findViewById(R.id.sec37);
					sec12 = (TextView) dialogDetails.findViewById(R.id.sec12);
					sec49 = (TextView) dialogDetails.findViewById(R.id.sec49);
					sec15 = (TextView) dialogDetails.findViewById(R.id.sec15);
					sec16 = (TextView) dialogDetails.findViewById(R.id.sec16);
					sec17 = (TextView) dialogDetails.findViewById(R.id.sec17);
					sec18 = (TextView) dialogDetails.findViewById(R.id.sec18);
					sec19 = (TextView) dialogDetails.findViewById(R.id.sec19);
					sec20 = (TextView) dialogDetails.findViewById(R.id.sec20);
					sec21 = (TextView) dialogDetails.findViewById(R.id.sec21);
					sec22 = (TextView) dialogDetails.findViewById(R.id.sec22);
					sec23 = (TextView) dialogDetails.findViewById(R.id.sec23);
					sec14 = (TextView) dialogDetails.findViewById(R.id.sec14);
					sec11 = (TextView) dialogDetails.findViewById(R.id.sec11);
					sec3 = (TextView) dialogDetails.findViewById(R.id.sec3);
					sec4 = (TextView) dialogDetails.findViewById(R.id.sec4);
					sec5 = (TextView) dialogDetails.findViewById(R.id.sec5);
					sec6 = (TextView) dialogDetails.findViewById(R.id.sec6);
					sec7 = (TextView) dialogDetails.findViewById(R.id.sec7);
					sec8 = (TextView) dialogDetails.findViewById(R.id.sec8);
					sec9 = (TextView) dialogDetails.findViewById(R.id.sec9);
					sec24 = (TextView) dialogDetails.findViewById(R.id.sec24);
					sec25 = (TextView) dialogDetails.findViewById(R.id.sec25);
					sec26 = (TextView) dialogDetails.findViewById(R.id.sec26);
					sec39 = (TextView) dialogDetails.findViewById(R.id.sec39);
					sec40 = (TextView) dialogDetails.findViewById(R.id.sec40);
					sec42 = (TextView) dialogDetails.findViewById(R.id.sec42);
					sec43 = (TextView) dialogDetails.findViewById(R.id.sec43);
					sec44 = (TextView) dialogDetails.findViewById(R.id.sec44);
					sec45 = (TextView) dialogDetails.findViewById(R.id.sec45);
					sec46 = (TextView) dialogDetails.findViewById(R.id.sec46);
					sec47 = (TextView) dialogDetails.findViewById(R.id.sec47);
					sec38 = (TextView) dialogDetails.findViewById(R.id.sec38);
					sec27 = (TextView) dialogDetails.findViewById(R.id.sec27);
					sec28 = (TextView) dialogDetails.findViewById(R.id.sec28);
					sec29 = (TextView) dialogDetails.findViewById(R.id.sec29);
					sec36 = (TextView) dialogDetails.findViewById(R.id.sec36);
					sec30 = (TextView) dialogDetails.findViewById(R.id.sec30);
					sec31 = (TextView) dialogDetails.findViewById(R.id.sec31);
					sec32 = (TextView) dialogDetails.findViewById(R.id.sec32);
					sec33 = (TextView) dialogDetails.findViewById(R.id.sec33);
					sec34 = (TextView) dialogDetails.findViewById(R.id.sec34);
					sec35 = (TextView) dialogDetails.findViewById(R.id.sec35);

					sec68 = (TextView) dialogDetails.findViewById(R.id.sec68);
					sec67 = (TextView) dialogDetails.findViewById(R.id.sec67);
					sec66 = (TextView) dialogDetails.findViewById(R.id.sec66);
					sec65 = (TextView) dialogDetails.findViewById(R.id.sec65);
					sec64 = (TextView) dialogDetails.findViewById(R.id.sec64);
					sec63 = (TextView) dialogDetails.findViewById(R.id.sec63);
					sec62 = (TextView) dialogDetails.findViewById(R.id.sec62);
					sec61 = (TextView) dialogDetails.findViewById(R.id.sec61);
					sec60 = (TextView) dialogDetails.findViewById(R.id.sec60);

					sec59 = (TextView) dialogDetails.findViewById(R.id.sec59);
					sec58 = (TextView) dialogDetails.findViewById(R.id.sec58);
					sec69 = (TextView) dialogDetails.findViewById(R.id.sec69);
					sec70 = (TextView) dialogDetails.findViewById(R.id.sec70);
					sec57 = (TextView) dialogDetails.findViewById(R.id.sec57);
					sec79 = (TextView) dialogDetails.findViewById(R.id.sec79);
					sec82 = (TextView) dialogDetails.findViewById(R.id.sec82);
					sec81 = (TextView) dialogDetails.findViewById(R.id.sec81);
					sec80 = (TextView) dialogDetails.findViewById(R.id.sec80);
					sec78 = (TextView) dialogDetails.findViewById(R.id.sec78);
					sec77 = (TextView) dialogDetails.findViewById(R.id.sec77);
					sec76 = (TextView) dialogDetails.findViewById(R.id.sec76);
					sec75 = (TextView) dialogDetails.findViewById(R.id.sec75);
					sec73 = (TextView) dialogDetails.findViewById(R.id.sec73);
					sec72 = (TextView) dialogDetails.findViewById(R.id.sec72);
					sec71 = (TextView) dialogDetails.findViewById(R.id.sec71);
					phs4 = (TextView) dialogDetails.findViewById(R.id.phs4);
					phs3 = (TextView) dialogDetails.findViewById(R.id.phs3);
					phs2 = (TextView) dialogDetails.findViewById(R.id.phs2);
					phs1 = (TextView) dialogDetails.findViewById(R.id.phs1);
					phs8 = (TextView) dialogDetails.findViewById(R.id.phs8);
					phs5 = (TextView) dialogDetails.findViewById(R.id.phs5);
					phs7 = (TextView) dialogDetails.findViewById(R.id.phs7);
					phs9 = (TextView) dialogDetails.findViewById(R.id.phs9);

					sec50.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 50 Chandigarh");
						}
					});
					sec51.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 51 Chandigarh");
						}
					});
					sec52.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 52 Chandigarh");
						}
					});
					sec53.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 53 Chandigarh");
						}
					});
					sec54.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 54 Chandigarh");
						}
					});
					sec55.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 55 Chandigarh");
						}
					});
					sec56.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 56 Chandigarh");
						}
					});
					sec37.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 37 Chandigarh");
						}
					});
					sec12.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 12 Chandigarh");
						}
					});
					sec49.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 49 Chandigarh");
						}
					});
					sec15.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 15 Chandigarh");
						}
					});
					sec16.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 16 Chandigarh");
						}
					});
					sec17.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 17 Chandigarh");
						}
					});
					sec18.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 18 Chandigarh");
						}
					});
					sec19.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 19 Chandigarh");
						}
					});
					sec20.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 20 Chandigarh");
						}
					});
					sec21.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 21 Chandigarh");
						}
					});
					sec22.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 22 Chandigarh");
						}
					});
					sec23.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 23 Chandigarh");
						}
					});
					sec14.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 14 Chandigarh");
						}
					});
					sec11.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 11 Chandigarh");
						}
					});
					sec3.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 3 Chandigarh");
						}
					});
					sec4.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 4 Chandigarh");
						}
					});
					sec5.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 5 Chandigarh");
						}
					});
					sec6.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 6 Chandigarh");
						}
					});

					sec7.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 7 Chandigarh");
						}
					});
					sec8.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 8 Chandigarh");
						}
					});
					sec9.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 9 Chandigarh");
						}
					});
					sec24.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 24 Chandigarh");
						}
					});
					sec25.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 25 Chandigarh");
						}
					});
					sec26.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 26 Chandigarh");
						}
					});
					sec39.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 39 Chandigarh");
						}
					});
					sec40.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 40 Chandigarh");
						}
					});
					sec42.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 42 Chandigarh");
						}
					});
					sec43.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 43 Chandigarh");
						}
					});
					sec44.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 44 Chandigarh");
						}
					});
					sec45.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 45 Chandigarh");
						}
					});
					sec46.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 46 Chandigarh");
						}
					});
					sec47.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 47 Chandigarh");
						}
					});
					sec38.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 38 Chandigarh");
						}
					});
					sec36.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 36 Chandigarh");
						}
					});
					sec27.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 27 Chandigarh");
						}
					});
					sec28.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 28 Chandigarh");
						}
					});
					sec29.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 29 Chandigarh");
						}
					});
					sec30.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 30 Chandigarh");
						}
					});
					sec31.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 31 Chandigarh");
						}
					});
					sec32.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 32 Chandigarh");
						}
					});
					sec33.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 33 Chandigarh");
						}
					});
					sec34.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 34 Chandigarh");
						}
					});
					sec35.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 35 Chandigarh");
						}
					});
					sec57.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 57 Mohali");
						}
					});
					sec68.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 68 Mohali");
						}
					});
					sec67.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 67 Mohali");
						}
					});
					sec66.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 66 Mohali");
						}
					});
					sec65.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 65 Mohali");
						}
					});
					sec64.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 64 Mohali");
						}
					});
					sec63.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 63 Mohali");
						}
					});
					sec62.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 62 Mohali");
						}
					});
					sec61.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 61 Mohali");
						}
					});
					sec60.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 60 Mohali");
						}
					});
					sec59.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 59 Mohali");
						}
					});
					sec58.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 58 Mohali");
						}
					});
					sec69.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 69 Mohali");
						}
					});
					sec70.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 70 Mohali");
						}
					});
					sec79.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 79 Mohali");
						}
					});
					sec82.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 82 Mohali");
						}
					});
					sec81.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 81 Mohali");
						}
					});
					sec80.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 80 Mohali");
						}
					});
					sec78.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 78 Mohali");
						}
					});
					sec77.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 77 Mohali");
						}
					});
					sec76.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 76 Mohali");
						}
					});
					sec75.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 75 Mohali");
						}
					});
					sec73.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 73 Mohali");
						}
					});
					sec72.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 72 Mohali");
						}
					});
					sec71.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 71 Mohali");
						}
					});
					phs4.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Phase 4  Mohali");
						}
					});
					phs3.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Phase 3  Mohali");
						}
					});
					phs2.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Phase 2  Mohali");
						}
					});
					phs1.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Phase 1  Mohali");
						}
					});
					phs8.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Phase 8  Mohali");
						}
					});
					phs5.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Phase 5  Mohali");
						}
					});
					phs7.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Phase 7  Mohali");
						}
					});
					phs9.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Phase 9  Mohali");
						}
					});
				}

				else if (route.getText().toString().trim().equalsIgnoreCase("Mohali To Mohali")) {
					LayoutInflater inflater = LayoutInflater.from(v.getContext());
					View dialogview = inflater.inflate(R.layout.listmohali, null);

					AlertDialog.Builder dialogbuilder = new AlertDialog.Builder(v.getContext());

					dialogbuilder.setView(dialogview);
					dialogDetails = dialogbuilder.create();
					dialogDetails.show();
					sec68 = (TextView) dialogDetails.findViewById(R.id.sec68);
					sec67 = (TextView) dialogDetails.findViewById(R.id.sec67);
					sec66 = (TextView) dialogDetails.findViewById(R.id.sec66);
					sec65 = (TextView) dialogDetails.findViewById(R.id.sec65);
					sec64 = (TextView) dialogDetails.findViewById(R.id.sec64);
					sec63 = (TextView) dialogDetails.findViewById(R.id.sec63);
					sec62 = (TextView) dialogDetails.findViewById(R.id.sec62);
					sec61 = (TextView) dialogDetails.findViewById(R.id.sec61);
					sec60 = (TextView) dialogDetails.findViewById(R.id.sec60);

					sec59 = (TextView) dialogDetails.findViewById(R.id.sec59);
					sec58 = (TextView) dialogDetails.findViewById(R.id.sec58);
					sec69 = (TextView) dialogDetails.findViewById(R.id.sec69);
					sec70 = (TextView) dialogDetails.findViewById(R.id.sec70);
					sec57 = (TextView) dialogDetails.findViewById(R.id.sec57);
					sec79 = (TextView) dialogDetails.findViewById(R.id.sec79);
					sec82 = (TextView) dialogDetails.findViewById(R.id.sec82);
					sec81 = (TextView) dialogDetails.findViewById(R.id.sec81);
					sec80 = (TextView) dialogDetails.findViewById(R.id.sec80);
					sec78 = (TextView) dialogDetails.findViewById(R.id.sec78);
					sec77 = (TextView) dialogDetails.findViewById(R.id.sec77);
					sec76 = (TextView) dialogDetails.findViewById(R.id.sec76);
					sec75 = (TextView) dialogDetails.findViewById(R.id.sec75);
					sec73 = (TextView) dialogDetails.findViewById(R.id.sec73);
					sec72 = (TextView) dialogDetails.findViewById(R.id.sec72);
					sec71 = (TextView) dialogDetails.findViewById(R.id.sec71);
					phs4 = (TextView) dialogDetails.findViewById(R.id.phs4);
					phs3 = (TextView) dialogDetails.findViewById(R.id.phs3);
					phs2 = (TextView) dialogDetails.findViewById(R.id.phs2);
					phs1 = (TextView) dialogDetails.findViewById(R.id.phs1);
					phs8 = (TextView) dialogDetails.findViewById(R.id.phs8);
					phs5 = (TextView) dialogDetails.findViewById(R.id.phs5);
					phs7 = (TextView) dialogDetails.findViewById(R.id.phs7);
					phs9 = (TextView) dialogDetails.findViewById(R.id.phs9);

					sec57.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 57 Mohali");
						}
					});
					sec68.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 68 Mohali");
						}
					});
					sec67.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 67 Mohali");
						}
					});
					sec66.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 66 Mohali");
						}
					});
					sec65.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 65 Mohali");
						}
					});
					sec64.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 64 Mohali");
						}
					});
					sec63.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 63 Mohali");
						}
					});
					sec62.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 62 Mohali");
						}
					});
					sec61.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 61 Mohali");
						}
					});
					sec60.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 60 Mohali");
						}
					});
					sec59.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 59 Mohali");
						}
					});
					sec58.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 58 Mohali");
						}
					});
					sec69.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 69 Mohali");
						}
					});
					sec70.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 70 Mohali");
						}
					});
					sec79.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 79 Mohali");
						}
					});
					sec82.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 82 Mohali");
						}
					});
					sec81.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 81 Mohali");
						}
					});
					sec80.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 80 Mohali");
						}
					});
					sec78.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 78 Mohali");
						}
					});
					sec77.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 77 Mohali");
						}
					});
					sec76.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 76 Mohali");
						}
					});
					sec75.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 75 Mohali");
						}
					});
					sec73.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 73 Mohali");
						}
					});
					sec72.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 72 Mohali");
						}
					});
					sec71.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 71 Mohali");
						}
					});
					phs4.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Phase 4  Mohali");
						}
					});
					phs3.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Phase 3  Mohali");
						}
					});
					phs2.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Phase 2  Mohali");
						}
					});
					phs1.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Phase 1  Mohali");
						}
					});
					phs8.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Phase 8  Mohali");
						}
					});
					phs5.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Phase 5  Mohali");
						}
					});
					phs7.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Phase 7  Mohali");
						}
					});
					phs9.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Phase 9  Mohali");
						}
					});

				} else if (route.getText().toString().trim().equalsIgnoreCase("Chandigarh To Chandigarh")) {
					LayoutInflater inflater = LayoutInflater.from(v.getContext());
					View dialogview = inflater.inflate(R.layout.listchandigarh, null);

					AlertDialog.Builder dialogbuilder = new AlertDialog.Builder(v.getContext());

					dialogbuilder.setView(dialogview);
					dialogDetails = dialogbuilder.create();
					dialogDetails.show();

					sec50 = (TextView) dialogDetails.findViewById(R.id.sec50);
					sec51 = (TextView) dialogDetails.findViewById(R.id.sec51);
					sec52 = (TextView) dialogDetails.findViewById(R.id.sec52);
					sec53 = (TextView) dialogDetails.findViewById(R.id.sec53);
					sec54 = (TextView) dialogDetails.findViewById(R.id.sec54);
					sec55 = (TextView) dialogDetails.findViewById(R.id.sec55);
					sec56 = (TextView) dialogDetails.findViewById(R.id.sec56);
					sec37 = (TextView) dialogDetails.findViewById(R.id.sec37);
					sec12 = (TextView) dialogDetails.findViewById(R.id.sec12);
					sec49 = (TextView) dialogDetails.findViewById(R.id.sec49);
					sec15 = (TextView) dialogDetails.findViewById(R.id.sec15);
					sec16 = (TextView) dialogDetails.findViewById(R.id.sec16);
					sec17 = (TextView) dialogDetails.findViewById(R.id.sec17);
					sec18 = (TextView) dialogDetails.findViewById(R.id.sec18);
					sec19 = (TextView) dialogDetails.findViewById(R.id.sec19);
					sec20 = (TextView) dialogDetails.findViewById(R.id.sec20);
					sec21 = (TextView) dialogDetails.findViewById(R.id.sec21);
					sec22 = (TextView) dialogDetails.findViewById(R.id.sec22);
					sec23 = (TextView) dialogDetails.findViewById(R.id.sec23);
					sec14 = (TextView) dialogDetails.findViewById(R.id.sec14);
					sec11 = (TextView) dialogDetails.findViewById(R.id.sec11);
					sec3 = (TextView) dialogDetails.findViewById(R.id.sec3);
					sec4 = (TextView) dialogDetails.findViewById(R.id.sec4);
					sec5 = (TextView) dialogDetails.findViewById(R.id.sec5);
					sec6 = (TextView) dialogDetails.findViewById(R.id.sec6);
					sec7 = (TextView) dialogDetails.findViewById(R.id.sec7);
					sec8 = (TextView) dialogDetails.findViewById(R.id.sec8);
					sec9 = (TextView) dialogDetails.findViewById(R.id.sec9);
					sec24 = (TextView) dialogDetails.findViewById(R.id.sec24);
					sec25 = (TextView) dialogDetails.findViewById(R.id.sec25);
					sec26 = (TextView) dialogDetails.findViewById(R.id.sec26);
					sec39 = (TextView) dialogDetails.findViewById(R.id.sec39);
					sec40 = (TextView) dialogDetails.findViewById(R.id.sec40);
					sec42 = (TextView) dialogDetails.findViewById(R.id.sec42);
					sec43 = (TextView) dialogDetails.findViewById(R.id.sec43);
					sec44 = (TextView) dialogDetails.findViewById(R.id.sec44);
					sec45 = (TextView) dialogDetails.findViewById(R.id.sec45);
					sec46 = (TextView) dialogDetails.findViewById(R.id.sec46);
					sec47 = (TextView) dialogDetails.findViewById(R.id.sec47);
					sec38 = (TextView) dialogDetails.findViewById(R.id.sec38);
					sec27 = (TextView) dialogDetails.findViewById(R.id.sec27);
					sec28 = (TextView) dialogDetails.findViewById(R.id.sec28);
					sec29 = (TextView) dialogDetails.findViewById(R.id.sec29);
					sec36 = (TextView) dialogDetails.findViewById(R.id.sec36);
					sec30 = (TextView) dialogDetails.findViewById(R.id.sec30);
					sec31 = (TextView) dialogDetails.findViewById(R.id.sec31);
					sec32 = (TextView) dialogDetails.findViewById(R.id.sec32);
					sec33 = (TextView) dialogDetails.findViewById(R.id.sec33);
					sec34 = (TextView) dialogDetails.findViewById(R.id.sec34);
					sec35 = (TextView) dialogDetails.findViewById(R.id.sec35);
					sec50.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 50 Chandigarh");
						}
					});
					sec51.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 51 Chandigarh");
						}
					});
					sec52.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 52 Chandigarh");
						}
					});
					sec53.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 53 Chandigarh");
						}
					});
					sec54.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 54 Chandigarh");
						}
					});
					sec55.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 55 Chandigarh");
						}
					});
					sec56.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 56 Chandigarh");
						}
					});
					sec37.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 37 Chandigarh");
						}
					});
					sec12.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 12 Chandigarh");
						}
					});
					sec49.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 49 Chandigarh");
						}
					});
					sec15.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 15 Chandigarh");
						}
					});
					sec16.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 16 Chandigarh");
						}
					});
					sec17.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 17 Chandigarh");
						}
					});
					sec18.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 18 Chandigarh");
						}
					});
					sec19.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 19 Chandigarh");
						}
					});
					sec20.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 20 Chandigarh");
						}
					});
					sec21.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 21 Chandigarh");
						}
					});
					sec22.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 22 Chandigarh");
						}
					});
					sec23.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 23 Chandigarh");
						}
					});
					sec14.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 14 Chandigarh");
						}
					});
					sec11.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 11 Chandigarh");
						}
					});
					sec3.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 3 Chandigarh");
						}
					});
					sec4.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 4 Chandigarh");
						}
					});
					sec5.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 5 Chandigarh");
						}
					});
					sec6.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 6 Chandigarh");
						}
					});

					sec7.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 7 Chandigarh");
						}
					});
					sec8.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 8 Chandigarh");
						}
					});
					sec9.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 9 Chandigarh");
						}
					});
					sec24.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 24 Chandigarh");
						}
					});
					sec25.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 25 Chandigarh");
						}
					});
					sec26.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 26 Chandigarh");
						}
					});
					sec39.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 39 Chandigarh");
						}
					});
					sec40.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 40 Chandigarh");
						}
					});
					sec42.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 42 Chandigarh");
						}
					});
					sec43.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 43 Chandigarh");
						}
					});
					sec44.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 44 Chandigarh");
						}
					});
					sec45.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 45 Chandigarh");
						}
					});
					sec46.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 46 Chandigarh");
						}
					});
					sec47.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 47 Chandigarh");
						}
					});
					sec38.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 38 Chandigarh");
						}
					});
					sec36.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 36 Chandigarh");
						}
					});
					sec27.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 27 Chandigarh");
						}
					});
					sec28.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 28 Chandigarh");
						}
					});
					sec29.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 29 Chandigarh");
						}
					});
					sec30.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 30 Chandigarh");
						}
					});
					sec31.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 31 Chandigarh");
						}
					});
					sec32.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 32 Chandigarh");
						}
					});
					sec33.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 33 Chandigarh");
						}
					});
					sec34.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 34 Chandigarh");
						}
					});
					sec35.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							pickuploc.setText("Sector 35 Chandigarh");
						}
					});

				}

			}
		});
		dropffloc.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				if (route.getText().toString().trim().equalsIgnoreCase("Chandigarh And Mohali")) {

					LayoutInflater inflater = LayoutInflater.from(v.getContext());
					View dialogview = inflater.inflate(R.layout.listchdmoh, null);

					AlertDialog.Builder dialogbuilder = new AlertDialog.Builder(v.getContext());

					dialogbuilder.setView(dialogview);
					dialogDetails = dialogbuilder.create();
					dialogDetails.show();
					sec50 = (TextView) dialogDetails.findViewById(R.id.sec50);
					sec51 = (TextView) dialogDetails.findViewById(R.id.sec51);
					sec52 = (TextView) dialogDetails.findViewById(R.id.sec52);
					sec53 = (TextView) dialogDetails.findViewById(R.id.sec53);
					sec54 = (TextView) dialogDetails.findViewById(R.id.sec54);
					sec55 = (TextView) dialogDetails.findViewById(R.id.sec55);
					sec56 = (TextView) dialogDetails.findViewById(R.id.sec56);
					sec37 = (TextView) dialogDetails.findViewById(R.id.sec37);
					sec12 = (TextView) dialogDetails.findViewById(R.id.sec12);
					sec49 = (TextView) dialogDetails.findViewById(R.id.sec49);
					sec15 = (TextView) dialogDetails.findViewById(R.id.sec15);
					sec16 = (TextView) dialogDetails.findViewById(R.id.sec16);
					sec17 = (TextView) dialogDetails.findViewById(R.id.sec17);
					sec18 = (TextView) dialogDetails.findViewById(R.id.sec18);
					sec19 = (TextView) dialogDetails.findViewById(R.id.sec19);
					sec20 = (TextView) dialogDetails.findViewById(R.id.sec20);
					sec21 = (TextView) dialogDetails.findViewById(R.id.sec21);
					sec22 = (TextView) dialogDetails.findViewById(R.id.sec22);
					sec23 = (TextView) dialogDetails.findViewById(R.id.sec23);
					sec14 = (TextView) dialogDetails.findViewById(R.id.sec14);
					sec11 = (TextView) dialogDetails.findViewById(R.id.sec11);
					sec3 = (TextView) dialogDetails.findViewById(R.id.sec3);
					sec4 = (TextView) dialogDetails.findViewById(R.id.sec4);
					sec5 = (TextView) dialogDetails.findViewById(R.id.sec5);
					sec6 = (TextView) dialogDetails.findViewById(R.id.sec6);
					sec7 = (TextView) dialogDetails.findViewById(R.id.sec7);
					sec8 = (TextView) dialogDetails.findViewById(R.id.sec8);
					sec9 = (TextView) dialogDetails.findViewById(R.id.sec9);
					sec24 = (TextView) dialogDetails.findViewById(R.id.sec24);
					sec25 = (TextView) dialogDetails.findViewById(R.id.sec25);
					sec26 = (TextView) dialogDetails.findViewById(R.id.sec26);
					sec39 = (TextView) dialogDetails.findViewById(R.id.sec39);
					sec40 = (TextView) dialogDetails.findViewById(R.id.sec40);
					sec42 = (TextView) dialogDetails.findViewById(R.id.sec42);
					sec43 = (TextView) dialogDetails.findViewById(R.id.sec43);
					sec44 = (TextView) dialogDetails.findViewById(R.id.sec44);
					sec45 = (TextView) dialogDetails.findViewById(R.id.sec45);
					sec46 = (TextView) dialogDetails.findViewById(R.id.sec46);
					sec47 = (TextView) dialogDetails.findViewById(R.id.sec47);
					sec38 = (TextView) dialogDetails.findViewById(R.id.sec38);
					sec27 = (TextView) dialogDetails.findViewById(R.id.sec27);
					sec28 = (TextView) dialogDetails.findViewById(R.id.sec28);
					sec29 = (TextView) dialogDetails.findViewById(R.id.sec29);
					sec36 = (TextView) dialogDetails.findViewById(R.id.sec36);
					sec30 = (TextView) dialogDetails.findViewById(R.id.sec30);
					sec31 = (TextView) dialogDetails.findViewById(R.id.sec31);
					sec32 = (TextView) dialogDetails.findViewById(R.id.sec32);
					sec33 = (TextView) dialogDetails.findViewById(R.id.sec33);
					sec34 = (TextView) dialogDetails.findViewById(R.id.sec34);
					sec35 = (TextView) dialogDetails.findViewById(R.id.sec35);

					sec68 = (TextView) dialogDetails.findViewById(R.id.sec68);
					sec67 = (TextView) dialogDetails.findViewById(R.id.sec67);
					sec66 = (TextView) dialogDetails.findViewById(R.id.sec66);
					sec65 = (TextView) dialogDetails.findViewById(R.id.sec65);
					sec64 = (TextView) dialogDetails.findViewById(R.id.sec64);
					sec63 = (TextView) dialogDetails.findViewById(R.id.sec63);
					sec62 = (TextView) dialogDetails.findViewById(R.id.sec62);
					sec61 = (TextView) dialogDetails.findViewById(R.id.sec61);
					sec60 = (TextView) dialogDetails.findViewById(R.id.sec60);

					sec59 = (TextView) dialogDetails.findViewById(R.id.sec59);
					sec58 = (TextView) dialogDetails.findViewById(R.id.sec58);
					sec69 = (TextView) dialogDetails.findViewById(R.id.sec69);
					sec70 = (TextView) dialogDetails.findViewById(R.id.sec70);
					sec57 = (TextView) dialogDetails.findViewById(R.id.sec57);
					sec79 = (TextView) dialogDetails.findViewById(R.id.sec79);
					sec82 = (TextView) dialogDetails.findViewById(R.id.sec82);
					sec81 = (TextView) dialogDetails.findViewById(R.id.sec81);
					sec80 = (TextView) dialogDetails.findViewById(R.id.sec80);
					sec78 = (TextView) dialogDetails.findViewById(R.id.sec78);
					sec77 = (TextView) dialogDetails.findViewById(R.id.sec77);
					sec76 = (TextView) dialogDetails.findViewById(R.id.sec76);
					sec75 = (TextView) dialogDetails.findViewById(R.id.sec75);
					sec73 = (TextView) dialogDetails.findViewById(R.id.sec73);
					sec72 = (TextView) dialogDetails.findViewById(R.id.sec72);
					sec71 = (TextView) dialogDetails.findViewById(R.id.sec71);
					phs4 = (TextView) dialogDetails.findViewById(R.id.phs4);
					phs3 = (TextView) dialogDetails.findViewById(R.id.phs3);
					phs2 = (TextView) dialogDetails.findViewById(R.id.phs2);
					phs1 = (TextView) dialogDetails.findViewById(R.id.phs1);
					phs8 = (TextView) dialogDetails.findViewById(R.id.phs8);
					phs5 = (TextView) dialogDetails.findViewById(R.id.phs5);
					phs7 = (TextView) dialogDetails.findViewById(R.id.phs7);
					phs9 = (TextView) dialogDetails.findViewById(R.id.phs9);

					sec50.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 50 Chandigarh");
						}
					});
					sec51.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 51 Chandigarh");
						}
					});
					sec52.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 52 Chandigarh");
						}
					});
					sec53.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 53 Chandigarh");
						}
					});
					sec54.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 54 Chandigarh");
						}
					});
					sec55.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 55 Chandigarh");
						}
					});
					sec56.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 56 Chandigarh");
						}
					});
					sec37.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 37 Chandigarh");
						}
					});
					sec12.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 12 Chandigarh");
						}
					});
					sec49.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 49 Chandigarh");
						}
					});
					sec15.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 15 Chandigarh");
						}
					});
					sec16.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 16 Chandigarh");
						}
					});
					sec17.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 17 Chandigarh");
						}
					});
					sec18.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 18 Chandigarh");
						}
					});
					sec19.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 19 Chandigarh");
						}
					});
					sec20.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 20 Chandigarh");
						}
					});
					sec21.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 21 Chandigarh");
						}
					});
					sec22.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 22 Chandigarh");
						}
					});
					sec23.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 23 Chandigarh");
						}
					});
					sec14.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 14 Chandigarh");
						}
					});
					sec11.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 11 Chandigarh");
						}
					});
					sec3.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 3 Chandigarh");
						}
					});
					sec4.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 4 Chandigarh");
						}
					});
					sec5.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 5 Chandigarh");
						}
					});
					sec6.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 6 Chandigarh");
						}
					});

					sec7.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 7 Chandigarh");
						}
					});
					sec8.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 8 Chandigarh");
						}
					});
					sec9.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 9 Chandigarh");
						}
					});
					sec24.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 24 Chandigarh");
						}
					});
					sec25.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 25 Chandigarh");
						}
					});
					sec26.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 26 Chandigarh");
						}
					});
					sec39.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 39 Chandigarh");
						}
					});
					sec40.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 40 Chandigarh");
						}
					});
					sec42.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 42 Chandigarh");
						}
					});
					sec43.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 43 Chandigarh");
						}
					});
					sec44.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 44 Chandigarh");
						}
					});
					sec45.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 45 Chandigarh");
						}
					});
					sec46.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 46 Chandigarh");
						}
					});
					sec47.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 47 Chandigarh");
						}
					});
					sec38.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 38 Chandigarh");
						}
					});
					sec36.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 36 Chandigarh");
						}
					});
					sec27.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 27 Chandigarh");
						}
					});
					sec28.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 28 Chandigarh");
						}
					});
					sec29.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 29 Chandigarh");
						}
					});
					sec30.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 30 Chandigarh");
						}
					});
					sec31.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 31 Chandigarh");
						}
					});
					sec32.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 32 Chandigarh");
						}
					});
					sec33.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 33 Chandigarh");
						}
					});
					sec34.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 34 Chandigarh");
						}
					});
					sec35.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 35 Chandigarh");
						}
					});
					sec57.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 57 Mohali");
						}
					});
					sec68.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 68 Mohali");
						}
					});
					sec67.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 67 Mohali");
						}
					});
					sec66.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 66 Mohali");
						}
					});
					sec65.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 65 Mohali");
						}
					});
					sec64.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 64 Mohali");
						}
					});
					sec63.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 63 Mohali");
						}
					});
					sec62.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 62 Mohali");
						}
					});
					sec61.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 61 Mohali");
						}
					});
					sec60.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 60 Mohali");
						}
					});
					sec59.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 59 Mohali");
						}
					});
					sec58.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 58 Mohali");
						}
					});
					sec69.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 69 Mohali");
						}
					});
					sec70.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 70 Mohali");
						}
					});
					sec79.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 79 Mohali");
						}
					});
					sec82.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 82 Mohali");
						}
					});
					sec81.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 81 Mohali");
						}
					});
					sec80.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 80 Mohali");
						}
					});
					sec78.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 78 Mohali");
						}
					});
					sec77.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 77 Mohali");
						}
					});
					sec76.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 76 Mohali");
						}
					});
					sec75.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 75 Mohali");
						}
					});
					sec73.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 73 Mohali");
						}
					});
					sec72.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 72 Mohali");
						}
					});
					sec71.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 71 Mohali");
						}
					});
					phs4.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Phase 4  Mohali");
						}
					});
					phs3.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Phase 3  Mohali");
						}
					});
					phs2.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Phase 2  Mohali");
						}
					});
					phs1.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Phase 1  Mohali");
						}
					});
					phs8.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Phase 8  Mohali");
						}
					});
					phs5.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Phase 5  Mohali");
						}
					});
					phs7.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Phase 7  Mohali");
						}
					});
					phs9.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Phase 9  Mohali");
						}
					});

				} else if (route.getText().toString().trim().equalsIgnoreCase("Mohali To Mohali")) {
					LayoutInflater inflater = LayoutInflater.from(v.getContext());
					View dialogview = inflater.inflate(R.layout.listmohali, null);

					AlertDialog.Builder dialogbuilder = new AlertDialog.Builder(v.getContext());

					dialogbuilder.setView(dialogview);
					dialogDetails = dialogbuilder.create();
					dialogDetails.show();
					sec68 = (TextView) dialogDetails.findViewById(R.id.sec68);
					sec67 = (TextView) dialogDetails.findViewById(R.id.sec67);
					sec66 = (TextView) dialogDetails.findViewById(R.id.sec66);
					sec65 = (TextView) dialogDetails.findViewById(R.id.sec65);
					sec64 = (TextView) dialogDetails.findViewById(R.id.sec64);
					sec63 = (TextView) dialogDetails.findViewById(R.id.sec63);
					sec62 = (TextView) dialogDetails.findViewById(R.id.sec62);
					sec61 = (TextView) dialogDetails.findViewById(R.id.sec61);
					sec60 = (TextView) dialogDetails.findViewById(R.id.sec60);

					sec59 = (TextView) dialogDetails.findViewById(R.id.sec59);
					sec58 = (TextView) dialogDetails.findViewById(R.id.sec58);
					sec69 = (TextView) dialogDetails.findViewById(R.id.sec69);
					sec70 = (TextView) dialogDetails.findViewById(R.id.sec70);
					sec57 = (TextView) dialogDetails.findViewById(R.id.sec57);
					sec79 = (TextView) dialogDetails.findViewById(R.id.sec79);
					sec82 = (TextView) dialogDetails.findViewById(R.id.sec82);
					sec81 = (TextView) dialogDetails.findViewById(R.id.sec81);
					sec80 = (TextView) dialogDetails.findViewById(R.id.sec80);
					sec78 = (TextView) dialogDetails.findViewById(R.id.sec78);
					sec77 = (TextView) dialogDetails.findViewById(R.id.sec77);
					sec76 = (TextView) dialogDetails.findViewById(R.id.sec76);
					sec75 = (TextView) dialogDetails.findViewById(R.id.sec75);
					sec73 = (TextView) dialogDetails.findViewById(R.id.sec73);
					sec72 = (TextView) dialogDetails.findViewById(R.id.sec72);
					sec71 = (TextView) dialogDetails.findViewById(R.id.sec71);
					phs4 = (TextView) dialogDetails.findViewById(R.id.phs4);
					phs3 = (TextView) dialogDetails.findViewById(R.id.phs3);
					phs2 = (TextView) dialogDetails.findViewById(R.id.phs2);
					phs1 = (TextView) dialogDetails.findViewById(R.id.phs1);
					phs8 = (TextView) dialogDetails.findViewById(R.id.phs8);
					phs5 = (TextView) dialogDetails.findViewById(R.id.phs5);
					phs7 = (TextView) dialogDetails.findViewById(R.id.phs7);
					phs9 = (TextView) dialogDetails.findViewById(R.id.phs9);
					sec57.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 57 Mohali");
						}
					});
					sec68.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 68 Mohali");
						}
					});
					sec67.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 67 Mohali");
						}
					});
					sec66.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 66 Mohali");
						}
					});
					sec65.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 65 Mohali");
						}
					});
					sec64.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 64 Mohali");
						}
					});
					sec63.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 63 Mohali");
						}
					});
					sec62.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 62 Mohali");
						}
					});
					sec61.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 61 Mohali");
						}
					});
					sec60.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 60 Mohali");
						}
					});
					sec59.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 59 Mohali");
						}
					});
					sec58.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 58 Mohali");
						}
					});
					sec69.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 69 Mohali");
						}
					});
					sec70.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 70 Mohali");
						}
					});
					sec79.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 79 Mohali");
						}
					});
					sec82.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 82 Mohali");
						}
					});
					sec81.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 81 Mohali");
						}
					});
					sec80.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 80 Mohali");
						}
					});
					sec78.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 78 Mohali");
						}
					});
					sec77.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 77 Mohali");
						}
					});
					sec76.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 76 Mohali");
						}
					});
					sec75.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 75 Mohali");
						}
					});
					sec73.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 73 Mohali");
						}
					});
					sec72.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 72 Mohali");
						}
					});
					sec71.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 71 Mohali");
						}
					});
					phs4.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Phase 4  Mohali");
						}
					});
					phs3.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Phase 3  Mohali");
						}
					});
					phs2.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Phase 2  Mohali");
						}
					});
					phs1.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Phase 1  Mohali");
						}
					});
					phs8.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Phase 8  Mohali");
						}
					});
					phs5.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Phase 5  Mohali");
						}
					});
					phs7.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Phase 7  Mohali");
						}
					});
					phs9.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Phase 9  Mohali");
						}
					});
				} else if (route.getText().toString().trim().equalsIgnoreCase("Chandigarh To Chandigarh")) {
					LayoutInflater inflater = LayoutInflater.from(v.getContext());
					View dialogview = inflater.inflate(R.layout.listchandigarh, null);

					AlertDialog.Builder dialogbuilder = new AlertDialog.Builder(v.getContext());

					dialogbuilder.setView(dialogview);
					dialogDetails = dialogbuilder.create();
					dialogDetails.show();

					sec50 = (TextView) dialogDetails.findViewById(R.id.sec50);
					sec51 = (TextView) dialogDetails.findViewById(R.id.sec51);
					sec52 = (TextView) dialogDetails.findViewById(R.id.sec52);
					sec53 = (TextView) dialogDetails.findViewById(R.id.sec53);
					sec54 = (TextView) dialogDetails.findViewById(R.id.sec54);
					sec55 = (TextView) dialogDetails.findViewById(R.id.sec55);
					sec56 = (TextView) dialogDetails.findViewById(R.id.sec56);
					sec37 = (TextView) dialogDetails.findViewById(R.id.sec37);
					sec12 = (TextView) dialogDetails.findViewById(R.id.sec12);
					sec49 = (TextView) dialogDetails.findViewById(R.id.sec49);
					sec15 = (TextView) dialogDetails.findViewById(R.id.sec15);
					sec16 = (TextView) dialogDetails.findViewById(R.id.sec16);
					sec17 = (TextView) dialogDetails.findViewById(R.id.sec17);
					sec18 = (TextView) dialogDetails.findViewById(R.id.sec18);
					sec19 = (TextView) dialogDetails.findViewById(R.id.sec19);
					sec20 = (TextView) dialogDetails.findViewById(R.id.sec20);
					sec21 = (TextView) dialogDetails.findViewById(R.id.sec21);
					sec22 = (TextView) dialogDetails.findViewById(R.id.sec22);
					sec23 = (TextView) dialogDetails.findViewById(R.id.sec23);
					sec14 = (TextView) dialogDetails.findViewById(R.id.sec14);
					sec11 = (TextView) dialogDetails.findViewById(R.id.sec11);
					sec3 = (TextView) dialogDetails.findViewById(R.id.sec3);
					sec4 = (TextView) dialogDetails.findViewById(R.id.sec4);
					sec5 = (TextView) dialogDetails.findViewById(R.id.sec5);
					sec6 = (TextView) dialogDetails.findViewById(R.id.sec6);
					sec7 = (TextView) dialogDetails.findViewById(R.id.sec7);
					sec8 = (TextView) dialogDetails.findViewById(R.id.sec8);
					sec9 = (TextView) dialogDetails.findViewById(R.id.sec9);
					sec24 = (TextView) dialogDetails.findViewById(R.id.sec24);
					sec25 = (TextView) dialogDetails.findViewById(R.id.sec25);
					sec26 = (TextView) dialogDetails.findViewById(R.id.sec26);
					sec39 = (TextView) dialogDetails.findViewById(R.id.sec39);
					sec40 = (TextView) dialogDetails.findViewById(R.id.sec40);
					sec42 = (TextView) dialogDetails.findViewById(R.id.sec42);
					sec43 = (TextView) dialogDetails.findViewById(R.id.sec43);
					sec44 = (TextView) dialogDetails.findViewById(R.id.sec44);
					sec45 = (TextView) dialogDetails.findViewById(R.id.sec45);
					sec46 = (TextView) dialogDetails.findViewById(R.id.sec46);
					sec47 = (TextView) dialogDetails.findViewById(R.id.sec47);
					sec38 = (TextView) dialogDetails.findViewById(R.id.sec38);
					sec27 = (TextView) dialogDetails.findViewById(R.id.sec27);
					sec28 = (TextView) dialogDetails.findViewById(R.id.sec28);
					sec29 = (TextView) dialogDetails.findViewById(R.id.sec29);
					sec36 = (TextView) dialogDetails.findViewById(R.id.sec36);
					sec30 = (TextView) dialogDetails.findViewById(R.id.sec30);
					sec31 = (TextView) dialogDetails.findViewById(R.id.sec31);
					sec32 = (TextView) dialogDetails.findViewById(R.id.sec32);
					sec33 = (TextView) dialogDetails.findViewById(R.id.sec33);
					sec34 = (TextView) dialogDetails.findViewById(R.id.sec34);
					sec35 = (TextView) dialogDetails.findViewById(R.id.sec35);
					sec50.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 50 Chandigarh");
						}
					});
					sec51.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 51 Chandigarh");
						}
					});
					sec52.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 52 Chandigarh");
						}
					});
					sec53.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 53 Chandigarh");
						}
					});
					sec54.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 54 Chandigarh");
						}
					});
					sec55.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 55 Chandigarh");
						}
					});
					sec56.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 56 Chandigarh");
						}
					});
					sec37.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 37 Chandigarh");
						}
					});
					sec12.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 12 Chandigarh");
						}
					});
					sec49.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 49 Chandigarh");
						}
					});
					sec15.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 15 Chandigarh");
						}
					});
					sec16.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 16 Chandigarh");
						}
					});
					sec17.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 17 Chandigarh");
						}
					});
					sec18.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 18 Chandigarh");
						}
					});
					sec19.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 19 Chandigarh");
						}
					});
					sec20.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 20 Chandigarh");
						}
					});
					sec21.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 21 Chandigarh");
						}
					});
					sec22.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 22 Chandigarh");
						}
					});
					sec23.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 23 Chandigarh");
						}
					});
					sec14.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 14 Chandigarh");
						}
					});
					sec11.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 11 Chandigarh");
						}
					});
					sec3.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 3 Chandigarh");
						}
					});
					sec4.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 4 Chandigarh");
						}
					});
					sec5.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 5 Chandigarh");
						}
					});
					sec6.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 6 Chandigarh");
						}
					});

					sec7.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 7 Chandigarh");
						}
					});
					sec8.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 8 Chandigarh");
						}
					});
					sec9.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 9 Chandigarh");
						}
					});
					sec24.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 24 Chandigarh");
						}
					});
					sec25.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 25 Chandigarh");
						}
					});
					sec26.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 26 Chandigarh");
						}
					});
					sec39.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 39 Chandigarh");
						}
					});
					sec40.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 40 Chandigarh");
						}
					});
					sec42.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 42 Chandigarh");
						}
					});
					sec43.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 43 Chandigarh");
						}
					});
					sec44.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 44 Chandigarh");
						}
					});
					sec45.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 45 Chandigarh");
						}
					});
					sec46.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 46 Chandigarh");
						}
					});
					sec47.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 47 Chandigarh");
						}
					});
					sec38.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 38 Chandigarh");
						}
					});
					sec36.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 36 Chandigarh");
						}
					});
					sec27.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 27 Chandigarh");
						}
					});
					sec28.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 28 Chandigarh");
						}
					});
					sec29.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 29 Chandigarh");
						}
					});
					sec30.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 30 Chandigarh");
						}
					});
					sec31.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 31 Chandigarh");
						}
					});
					sec32.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 32 Chandigarh");
						}
					});
					sec33.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 33 Chandigarh");
						}
					});
					sec34.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 34 Chandigarh");
						}
					});
					sec35.setOnClickListener(new View.OnClickListener() {

						@Override
						public void onClick(View v) {
							// TODO Auto-generated method stub
							dialogDetails.dismiss();
							dropffloc.setText("Sector 35 Chandigarh");
						}
					});
				}

			}
		});
		btn_cancel.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
		});
		btn_login.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent mIntent = new Intent(MakeBooking.this, LoginActivity.class);
				startActivity(mIntent);
			}
		});
	}

	// private void initial() {}
}
