package com.brainsocket.arabji.adapters;

import com.brainsocket.arabji.DummySectionFragment;
import com.brainsocket.arabji.EmojiFragment;
import com.brainsocket.arabji.R;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SectionsPagerAdapter extends FragmentPagerAdapter 
{
	private Activity activity;
	
	public SectionsPagerAdapter(FragmentManager fm,Activity activity) {
		super(fm);
		this.activity=activity;
	}

	@Override
	public Fragment getItem(int position) {
		// getItem is called to instantiate the fragment for the given page.
		// Return a DummySectionFragment (defined as a static inner class
		// below) with the page number as its lone argument.
		
		
		Fragment fragment=new EmojiFragment(this.activity);
		return fragment;
		
//		Fragment fragment = new DummySectionFragment();
//		Bundle args = new Bundle();
//		args.putInt(DummySectionFragment.ARG_SECTION_NUMBER, position + 1);
//		fragment.setArguments(args);
//		return fragment;
	}

	@Override
	public int getCount() {
		// Show 3 total pages.
		return 1;
	}

	@Override
	public CharSequence getPageTitle(int position) {
		switch (position) {
		case 0:
			//return getString(R.string.title_section1).toUpperCase();
			return "Section 1";
		case 1:
			//return getString(R.string.title_section2).toUpperCase();
			return "Section 2";
		case 2:
			//
			return "Section 3";//return getString(R.string.title_section3).toUpperCase();
		}
		return null;
	}
}
