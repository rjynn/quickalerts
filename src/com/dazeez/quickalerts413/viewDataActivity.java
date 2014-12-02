package com.dazeez.quickalerts413;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class viewDataActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.viewdata);
		getActionBar().setDisplayShowTitleEnabled(false);
		getActionBar().setDisplayShowHomeEnabled(true);
		getActionBar().setHomeButtonEnabled(true);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			Intent intent = new Intent(this, HomeActivity.class);
			intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			startActivity(intent);
			break;
		}
		
		return (super.onOptionsItemSelected(item));
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
