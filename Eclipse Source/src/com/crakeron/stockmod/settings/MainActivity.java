package com.crakeron.stockmod.settings;

import android.os.Bundle;
import android.os.PowerManager;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {
	
	
	
	PowerManager pm;
	
	
	

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
	
	public void reboot_recovery(View button){		
		PowerManager pm = (PowerManager) getSystemService(Context.POWER_SERVICE);
		pm.reboot("recovery");
		return;
	}

}
