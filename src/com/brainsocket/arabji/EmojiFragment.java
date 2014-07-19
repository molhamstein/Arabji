package com.brainsocket.arabji;

import com.brainsocket.arabji.adapters.ImageAdapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Toast;

public class EmojiFragment extends Fragment 
{
	private Activity activity;
	
	public EmojiFragment(Activity activity)
	{
		this.activity=activity;
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.grid_layout, container, false);
		
		GridView gridView = (GridView) rootView.findViewById(R.id.grid_view);
		
		// Instance of ImageAdapter Class
		gridView.setAdapter(new ImageAdapter(activity));

		/**
		 * On Click event for Single Gridview Item
		 * */
		gridView.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View v,
					int position, long id) {
				
				Toast.makeText(activity.getApplicationContext(), "click", Toast.LENGTH_SHORT).show();
				/*// Sending image id to FullScreenActivity
				Intent i = new Intent(activity.getApplicationContext(), FullImageActivity.class);
				// passing array index
				i.putExtra("id", position);
				startActivity(i);*/
			}
		});
		return rootView;
		
//		View rootView = inflater.inflate(R.layout.fragment_cars, container, false);
//		return rootView;
	}
}
