package com.dazeez.quickalerts413;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class viewDataActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.viewdata);
		getActionBar().setDisplayShowTitleEnabled(false);
		getActionBar().setDisplayShowHomeEnabled(false);
	}
	public void goModel(View view){
		Intent i = new Intent(this, viewmodelActivity.class);
		startActivity(i);
	}
	
	public void submit(View view){
		Intent i = new Intent(this, SubmitActivity.class);
		startActivity(i);
	}
}
