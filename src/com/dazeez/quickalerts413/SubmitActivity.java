package com.dazeez.quickalerts413;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class SubmitActivity extends Activity {
	private int rating = -1;
	private boolean start = false;
	private static ReportController rc = new ReportController();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.submit);
		getActionBar().setDisplayShowTitleEnabled(false);
		getActionBar().setDisplayShowHomeEnabled(true);
		getActionBar().setHomeButtonEnabled(true);
		EditText locationBox = (EditText) findViewById(R.id.editText1);
		locationBox.setEnabled(false);
		Button btn = (Button) findViewById(R.id.Button01);
		btn.setEnabled(false);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			runOnUiThread(doFinish);
			break;
		}
		
		return (super.onOptionsItemSelected(item));
	}
	
	private Runnable doFinish = new Runnable() {
		public void run() {
			finish();
		}
	};

	public void caseReport(View view) {
		EditText locationBox = (EditText) findViewById(R.id.editText1);
		String loc = locationBox.getText().toString();

		EditText diseaseBox = (EditText) findViewById(R.id.editText2);
		String disease = diseaseBox.getText().toString();

		if (loc.equals("") || loc == null) {
			Toast.makeText(this, "Please give a location.", Toast.LENGTH_SHORT)
					.show();
		} else if (this.rating == 0) {
			Toast.makeText(this, "Please enter your certainty.",
					Toast.LENGTH_SHORT).show();
		} else if (disease.equals("") || loc == null) {
			Toast.makeText(this, "Please enter disease.", Toast.LENGTH_SHORT)
					.show();
		} else {
			submitCase();
		}

		rc.createReport(loc, this.rating, disease);
	}

	private void submitCase() {
		Intent i = new Intent(this, caseReport.class);
		startActivity(i);
	}

	public void onRadioButtonClicked(View view) {
		boolean checked = ((RadioButton) view).isChecked();

		switch (view.getId()) {
		case R.id.radioButton1:
			if (checked)
				// Toast.makeText(this, "1", Toast.LENGTH_SHORT).show();
				this.rating = 1;
			break;
		case R.id.radioButton2:
			if (checked)
				// Toast.makeText(this, "2", Toast.LENGTH_SHORT).show();
				this.rating = 2;
			break;
		case R.id.radioButton3:
			if (checked)
				// Toast.makeText(this, "3", Toast.LENGTH_SHORT).show();
				this.rating = 3;
			break;

		}
	}

	public void onRadioButtonClicked2(View view) {
		boolean checked = ((RadioButton) view).isChecked();
		EditText box = (EditText) findViewById(R.id.editText1);
		
		switch (view.getId()) {
		case R.id.GPS:
			if (checked)
				box.setText("Edmonton");
			break;
		case R.id.Network:
			if (checked)
				box.setText("Edmonton");
			break;
		case R.id.Manual:
			if (checked)
				box.setEnabled(true);
			break;

		}
	}
	
	public void viewData(View view){
		Intent i = new Intent(this, viewDataActivity.class);
		startActivity(i);
	}
}
