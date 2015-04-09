package com.projectskytrain;

import java.util.ArrayList;

import com.example.projectskytrain.R;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.location.LocationServices;
import com.projectskytrain.auxiliry.Station;
import com.projectskytrain.auxiliry.StationArrayAdapter;
import com.projectskytrain.constants.StationEnum;

import android.app.Activity;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainScreen extends Activity implements ConnectionCallbacks, OnConnectionFailedListener {
	
	 private final static int PLAY_SERVICES_RESOLUTION_REQUEST = 1000;
	 private String[] stnNames = new String[56];
	 private TextView timetxt;
	 private TextView pricetxt;
	 private TextView fromStn;
	 private TextView toStn;
	 private TextView lableFromStn;
	 private TextView lableToStn;
	 private ListView listStation;
	 private CheckBox cbClosesteStn;
	 private GoogleApiClient mGoogleApiClient;
	 private double latitude;
	 private double longitude;
	 private AutoCompleteTextView fromStation;
	 private AutoCompleteTextView toStation;
	 private Button search;
	 private Button seeMap;
	@Override
	
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_screen);
		
		getStation(stnNames);
		//Build connection with Google Service API.
		if (checkPlayServices()) {             
	        // Building the GoogleApi client
	        	buildGoogleApiClient();        
	     }       
		
		//Adapter for the ListView
		ArrayAdapter<String> adapterFrom =new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,stnNames);
		ArrayAdapter<String> adapterTo =new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,stnNames);
		
		fromStation = (AutoCompleteTextView)findViewById(R.id.txtFrom);
		toStation = (AutoCompleteTextView)findViewById(R.id.txtTo);
		timetxt = (TextView)findViewById(R.id.txtTime);
		pricetxt = (TextView)findViewById(R.id.txtPrice);
		fromStn = (TextView)findViewById(R.id.txtFromStn);
		toStn = (TextView)findViewById(R.id.txtToStn);
		lableFromStn = (TextView)findViewById(R.id.lableFrom);
		lableToStn = (TextView)findViewById(R.id.lableTo);
		cbClosesteStn = (CheckBox)findViewById(R.id.cbClosest);
		listStation = (ListView)findViewById(R.id.listview);
		
		fromStation.setAdapter(adapterFrom);
        toStation.setAdapter(adapterTo);
		search = (Button)findViewById(R.id.btnSearch);
		seeMap = (Button)findViewById(R.id.btnMap);
		
		//Button Search onClick event
		 search.setOnClickListener(new OnClickListener() {
		
			@Override
			public void onClick(View v) {
				final String fromStn=fromStation.getEditableText().toString();
				final String toStn=toStation.getEditableText().toString();
				hideKeyboard(v);
				calculate(fromStn, toStn);
				
			}
		}) ;
		
		 //Button See Map onClick event
		seeMap.setOnClickListener( new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(MainScreen.this, SkytrainLine.class));
			}
		});
		 
		//Hides the soft keyboard when the user taps somewhere on the screen 
		 fromStation.setOnFocusChangeListener(new View.OnFocusChangeListener() {
			
			@Override
			public void onFocusChange(View v, boolean hasFocus) {
				// TODO Auto-generated method stub
				if(!hasFocus){
					hideKeyboard(v);
				}
			}
		});
		//Hides the soft keyboard when the user taps somewhere on the screen 
		 toStation.setOnFocusChangeListener(new View.OnFocusChangeListener() {
				
				@Override
				public void onFocusChange(View v, boolean hasFocus) {
					// TODO Auto-generated method stub
					if(!hasFocus){
						hideKeyboard(v);
					}
				}
			});
		 
		 //Show the List of Station when the user taps on the textview 
		 fromStation.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				fromStation.showDropDown();
			}
		});
		 
		 //Show the List of Station when the user taps on the textview 
		 toStation.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					toStation.showDropDown();
				}
			});
		 
		 //Disabled the from textview when the user checks the Closest station checkbox
		 cbClosesteStn.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub
				if(isChecked){
					fromStation.setText("");
					fromStation.setEnabled(false);
				}
				else
					fromStation.setEnabled(true);
			}
		});
		 
		 //Starts the MapActivity sending information about the station
		 listStation.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				TextView c = (TextView) view.findViewById(R.id.txtStation);
				StationEnum station = Station.getStationInfo(c.getText().toString());
				//Toast.makeText(getApplicationContext(), station.getName()+", "+station.getLatitude()+", "+station.getLongitude(), Toast.LENGTH_LONG).show();
				Intent intent = new Intent(getBaseContext(), MapActivity.class);
				intent.putExtra("station_name", station.getName());
				intent.putExtra("station_latitude", station.getLatitude());
				intent.putExtra("station_longitude", station.getLongitude());
				intent.putExtra("user_latitude", latitude);
				intent.putExtra("user_longitude", longitude);
				startActivity(intent);
				
			}
		});
	}
	//Calculates the best route
	private void calculate(String st1, String st2){
		int stCode1, stCode2;
		Station calcStn= new Station();
		//If the closest station checkbox is checked find it
		if(cbClosesteStn.isChecked()){
			if(mGoogleApiClient!=null){
				stCode1 = getClosestStation();
				if(stCode1==-1){
					return;
				}
			}else{
				Toast.makeText(this, "Google Location Services is Not Available", Toast.LENGTH_SHORT).show();
				return;
			}
			st1 = Station.getStationInfo(stCode1).getName();
		}else{
			stCode1 = Station.getStationId(st1);	
		}
		stCode2 = Station.getStationId(st2);
		
		if(stCode1!=-1 && stCode2!=-1){
			if(st1.contains(st2) || st2.contains(st1)){
				
				Toast.makeText(this, "Please select a DESTINATION that is different from your DEPARTURE Station", Toast.LENGTH_LONG).show();
				cleanInfo();
				return;
			}
			
			lableFromStn.setText("From: ");
			lableToStn.setText("To: ");
			fromStn.setText(st1);
			toStn.setText(st2);
			
			timetxt.setText(calcStn.getTimeAndPath(stCode1, stCode2)+" minutes");
			pricetxt.setText("$"+calcStn.getPrice(stCode1, stCode2));
			setListView(calcStn.getPath());
		}else{
			cleanInfo();
			Toast.makeText(this, "No valid station was given", Toast.LENGTH_SHORT).show();
		}
		
			
	}
	//Gets a array if station names
	private void getStation( String [] arr){
		
		int count=0;
		for (StationEnum var : StationEnum.values()) {
			arr[count++]=var.getName();
		}
	}
	
	//Sets the array adapter to the listView
	private void setListView(ArrayList<StationEnum> route){
	
		final StationArrayAdapter adapter= new StationArrayAdapter(this, route);
		listStation.setAdapter(adapter);
		
	}
	
	//Calculates the closest station
	private int getClosestStation(){
		int code = -1;
		double closeste = -1;
		if(setLocation()){
			for (StationEnum stn : StationEnum.values()) {
				double x = stn.getLatitude() - latitude;
				double y = stn.getLongitude() -  longitude;
				double a = Math.pow(x, 2.0);
				double b = Math.pow(y, 2.0);
				double dist = Math.pow((a+b), 0.5);
				
				if(closeste == -1){
					code = stn.getCode();
					closeste = dist;
				}else{
					if(dist < closeste){
						code = stn.getCode();
						closeste = dist;
					}
				}
				
			}
		}else
			Toast.makeText(this, "Failed to get device location", Toast.LENGTH_SHORT).show();
		return code; 
	}
	
	//Checks for google play services
	private boolean checkPlayServices() {        
    	int resultCode = GooglePlayServicesUtil                
    			.isGooglePlayServicesAvailable(this);        
    	if (resultCode != ConnectionResult.SUCCESS) {            
    		if (GooglePlayServicesUtil.isUserRecoverableError(resultCode)) {                
    			GooglePlayServicesUtil.getErrorDialog(resultCode, this,
    					PLAY_SERVICES_RESOLUTION_REQUEST).show();            
    			} else {                
    				Toast.makeText(getApplicationContext(),
    						"This device is not supported.", Toast.LENGTH_LONG)
    						.show();                
    				finish();            
    				}            
    		return false;        
    		}        
    	return true;    
    }
	
	//Gets user current location
	private boolean setLocation(){
		Location mLastLocation = LocationServices.FusedLocationApi                
    			.getLastLocation(mGoogleApiClient);         
    	if (mLastLocation != null) {           
    		latitude = mLastLocation.getLatitude();            
    		longitude = mLastLocation.getLongitude();  
    		return true;
    		        
		} else {             
			latitude = 0;            
    		longitude = 0; 
    		return false;
		}
	}
	
	//Build Google Client Api
	protected synchronized void buildGoogleApiClient() {        
    	mGoogleApiClient = new GoogleApiClient.Builder(this)                
    	.addConnectionCallbacks(this)                
    	.addOnConnectionFailedListener(this)                
    	.addApi(LocationServices.API).build();    
    }

	@Override
	public void onConnectionFailed(ConnectionResult arg0) {
		// TODO Auto-generated method stub
		Toast.makeText(this,"Connection failed:"+ arg0.getErrorCode(), Toast.LENGTH_LONG).show();
		
	}

	@Override
	public void onConnected(Bundle arg0) {
		// TODO Auto-generated method stub
		setLocation();
			
	}

	@Override
	public void onConnectionSuspended(int arg0) {
		// TODO Auto-generated method stub
		mGoogleApiClient.connect();
		
	}
	
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		if (mGoogleApiClient != null) {
			mGoogleApiClient.connect();        
		}
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		checkPlayServices();
	}
	
	//Hides soft keyBoard 
	private void hideKeyboard(View v){
		InputMethodManager inputManager = (InputMethodManager)getSystemService(Activity.INPUT_METHOD_SERVICE);
		inputManager.hideSoftInputFromWindow(v.getWindowToken(),0);
	}
	
	private void cleanInfo(){
		lableFromStn.setText("");
		lableToStn.setText("");
		fromStn.setText("");
		toStn.setText("");
		timetxt.setText("");
		pricetxt.setText("");
		
		listStation.setAdapter(null);
		
	}
	
	
	

}
