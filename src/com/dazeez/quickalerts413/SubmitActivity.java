package com.dazeez.quickalerts413;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SubmitActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.submit);
		getActionBar().setDisplayShowTitleEnabled(false);
		getActionBar().setDisplayShowHomeEnabled(false);
	}
	
	public void caseReport(View view){
		Intent i = new Intent(SubmitActivity.this, caseReport.class);
		startActivity(i);
	}
}
