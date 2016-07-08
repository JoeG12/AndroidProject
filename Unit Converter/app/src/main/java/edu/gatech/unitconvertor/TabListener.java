package edu.gatech.unitconvertor;

import android.app.ActionBar.Tab;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Context;

class TabListener implements android.app.ActionBar.TabListener {

	public Fragment fragment;
	public Context context;

	public TabListener(Fragment fragment, Context context) {
		this.fragment = fragment;
		this.context = context;
	}

	public void onTabReselected(Tab tab, FragmentTransaction ft) {

	}

	public void onTabSelected(Tab tab, FragmentTransaction ft) {

		ft.setCustomAnimations(R.anim.slide_in_left, 0);
		ft.replace(R.id.container, fragment);
	}

	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		// ft.setCustomAnimations(0, 1);
		ft.remove(fragment);
	}

}