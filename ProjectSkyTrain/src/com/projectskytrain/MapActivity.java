package com.projectskytrain;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class MapActivity extends Activity {
	
	  
	   private GoogleMap googleMap;
	   private String station_name;
	   private String user_location = "You're here";
	   private double station_latitude;
	   private double station_longitude;
	   private double user_latitude;
	   private double user_longitude;
	   
	   @Override
	   protected void onCreate(Bundle savedInstanceState) {
	      super.onCreate(savedInstanceState);
	      setContentView(com.example.projectskytrain.R.layout.map_layout);
	      /*Gets information about the station that was sent from the MainScreen Activity*/
	      Bundle extras = getIntent().getExtras();
	      if (extras != null) {
	          station_name = extras.getString("station_name");
	          station_latitude = extras.getDouble("station_latitude");
	          station_longitude = extras.getDouble("station_longitude");
	          user_latitude = extras.getDouble("user_latitude");
	          user_longitude = extras.getDouble("user_longitude");
	          final LatLng stationLocation = new LatLng(station_latitude , station_longitude);
	          final LatLng userLocation;
	          
	          try { 
	        	  if(googleMap == null) {
	        		  googleMap = ((MapFragment) getFragmentManager().
		              findFragmentById(com.example.projectskytrain.R.id.map)).getMap();
		           }
	        	  
			       googleMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
			       Marker TP = googleMap.addMarker(new MarkerOptions().
			       position(stationLocation).title(station_name));
			       
			       if(user_latitude!=0 && user_longitude!=0){
			    	   userLocation = new LatLng(user_latitude, user_longitude);
			    	   Marker TU = googleMap.addMarker(new MarkerOptions().
						       position(userLocation).title(user_location)
						       .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
			       }
			       googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(stationLocation, 15));

		      } catch (Exception e) {
		         e.printStackTrace();
		      }
	      }
	     

	   }
}
