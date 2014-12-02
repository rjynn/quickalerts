package com.dazeez.quickalerts413;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class viewmodelActivity extends Activity {
	private int type = -1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.viewmodel);
		getActionBar().setDisplayShowTitleEnabled(false);
		getActionBar().setDisplayShowHomeEnabled(false);
	}

	public void zoom(View vew) {
		ImageView image = (ImageView) findViewById(R.id.imageView1);
		
		if (this.type == -1) {
			Toast.makeText(this, "Please select how the map will visualize data", Toast.LENGTH_SHORT).show();
		} else if (this.type == 1) {
			image.setImageDrawable(getResources().getDrawable(R.drawable.point));
		} else if (this.type == 2) {
			image.setImageDrawable(getResources().getDrawable(R.drawable.circle));
		} else if (this.type == 3) {
			image.setImageDrawable(getResources().getDrawable(R.drawable.heat));
		}

	}

	public void onRadioButtonClicked(View view) {
		boolean checked = ((RadioButton) view).isChecked();

		switch (view.getId()) {
		case R.id.point:
			if (checked)
				this.type = 1;
			break;
		case R.id.circle:
			if (checked)
				this.type = 2;
			break;
		case R.id.heat:
			if (checked)
				this.type = 3;
			break;

		}
	}
}
