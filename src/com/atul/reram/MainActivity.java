/*
* Aim  : Image Dictionary
* Date : Friday, Monday, October 19 2012 08:53 AM
* By   : Atul R. Raut
* File : MainActivity.java contents UI.
*
***/
package com.atul.reram;

import android.app.ActivityGroup;
import android.app.LocalActivityManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;

public class MainActivity extends ActivityGroup {

	private LinearLayout searchBar;
	
	private void initLayout()
	{
		searchBar = (LinearLayout)findViewById(R.id.searchBar);

		// Get search view, then add it to search bar
		final LocalActivityManager manager = getLocalActivityManager();
		final Intent i = new Intent(MainActivity.this, SearchActivity.class);
		final Window w = manager.startActivity("SearchActivity", i);
		final View v = w != null ? w.getDecorView() : null;

		searchBar.addView(v);
	}
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        initLayout();
    }
    
    /** Called when the activity is first created. */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
