package com.dazeez.quickalerts413;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		getActionBar().setDisplayShowTitleEnabled(false);
		getActionBar().setDisplayShowHomeEnabled(true);
	}
	
	public void submit(View view){
		Intent i = new Intent(HomeActivity.this, SubmitActivity.class);
		startActivity(i);
	}
	
	public void viewData(View view){
		Intent i = new Intent(this, viewDataActivity.class);
		startActivity(i);
	}

}
