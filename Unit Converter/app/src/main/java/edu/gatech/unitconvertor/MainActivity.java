package edu.gatech.unitconvertor;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_activity);

		createTabs();
	}

	public void createTabs() {

		// Create new action bar for activity
		ActionBar actionbar = getActionBar();

		actionbar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		actionbar.addTab(actionbar
				.newTab()
				.setText(getString(R.string.title_activity_temperature))
				.setTabListener(
						new TabListener(new TemperatureActivity(),
								getApplicationContext())));

		actionbar.addTab(actionbar
				.newTab()
				.setText(getString(R.string.title_activity_distance))
				.setTabListener(
						new TabListener(new DistanceActivity(),
								getApplicationContext())));

		actionbar.addTab(actionbar
				.newTab()
				.setText(getString(R.string.title_activity_weight))
				.setTabListener(
						new TabListener(new WeightActivity(),
								getApplicationContext())));
	}
}
