package com.crakeron.stockmod.settings;

import android.os.Bundle;
import android.os.PowerManager;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {
	PowerManager pm;
	
	public void reboot_recovery(){		
		pm.reboot("recovery");
		return;
	}
	
	
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
