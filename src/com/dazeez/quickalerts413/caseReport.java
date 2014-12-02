package com.dazeez.quickalerts413;

import java.text.SimpleDateFormat;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class caseReport extends Activity {
	private static ReportController rc = new ReportController();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.casereport);
		getActionBar().setDisplayShowTitleEnabled(false);
		getActionBar().setDisplayShowHomeEnabled(false);
		populateReportFields();
		
	}

	@SuppressLint("SimpleDateFormat")
	private void populateReportFields() {
		Report report = rc.getReport();
		TextView idBox = (TextView) findViewById(R.id.idText);
		idBox.setText(report.getID());
		
		TextView dateBox = (TextView) findViewById(R.id.dateText);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String date_to_string = sdf.format(report.getDate());
		dateBox.setText(date_to_string);
		
		TextView locBox = (TextView) findViewById(R.id.locText);
		locBox.setText(report.getLocation());
		
		TextView ratingBox = (TextView) findViewById(R.id.ratingText);
		int rating = report.getRating();
		if (rating == 1) {
			ratingBox.setText("Very Confident");
		} else if (rating == 2) {
			ratingBox.setText("Confident");
		} else if (rating == 3) {
			ratingBox.setText("Not Confident");
		}
		
		TextView diseaseBox = (TextView) findViewById(R.id.diseaseText);
		diseaseBox.setText(report.getDisease());
		
		TextView updateBox = (TextView) findViewById(R.id.updateText);
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		String date_to_string2 = sdf2.format(report.getUpdated());
		updateBox.setText(date_to_string2);
	}
}
