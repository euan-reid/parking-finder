package com.reide96.parkingfinder;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;

public class MainActivity extends FragmentActivity {

	private GoogleMap map;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		SupportMapFragment fragment = new SupportMapFragment();
		getSupportFragmentManager().beginTransaction().add(android.R.id.content, fragment).commit();

		setContentView(R.layout.activity_main);

		//		GooglePlayServicesUtil.isGooglePlayServicesAvailable(getApplicationContext());
		//
		//		GoogleMap map = ((SupportMapFragment)
		//				getSupportFragmentManager().findFragmentById(R.id.map)).getMap();
	}
}

