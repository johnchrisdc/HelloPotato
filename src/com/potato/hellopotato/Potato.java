package com.potato.hellopotato;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Toast;

public class Potato extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tomato);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		Toast.makeText(getApplicationContext(), "FUCK IMA POTATO!!!!!!!", Toast.LENGTH_LONG).show();
		return true;
	}

}
