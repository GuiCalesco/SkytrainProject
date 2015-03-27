package com.projectskytrain;

import java.util.ArrayList;

import com.example.projectskytrain.R;
import com.projectskytrain.auxiliry.Station;
import com.projectskytrain.auxiliry.StationArrayAdapter;
import com.projectskytrain.constants.StationEnum;
import com.projectskytrain.database.VanSkytrainDB;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;
import android.widget.Toast;

public class MainScreen extends Activity {
	String[] stnNames = new String[56];
	 TextView timetxt;
	 TextView pricetxt;
	 

	
	@Override
	
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		getStation(stnNames);
		super.onCreate(savedInstanceState);
		createDataBase();
		setContentView(R.layout.main_screen);
	
		ArrayAdapter<String> adapter =new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,stnNames);
		final AutoCompleteTextView fromStation = (AutoCompleteTextView)findViewById(R.id.txtFrom);
		final AutoCompleteTextView toStation = (AutoCompleteTextView)findViewById(R.id.txtTo);
		timetxt = (TextView)findViewById(R.id.txtTime);
		pricetxt = (TextView)findViewById(R.id.txtPrice);
		
		fromStation.setAdapter(adapter);
        toStation.setAdapter(adapter);
		Button search = (Button)findViewById(R.id.btnSearch);
		
		timetxt.setText("Time:");
		pricetxt.setText("Price:");
		 
		 search.setOnClickListener(new OnClickListener() {
		
			@Override
			public void onClick(View v) {
				int time;
				final String fromStn=fromStation.getEditableText().toString();
				final String toStn=toStation.getEditableText().toString();
				calculate(fromStn, toStn);
				
					
				
				
			}
		}) ;
		        

	}
	
	private void calculate(String st1, String st2){
		int stCode1, stCode2;
		Station calcStn= new Station();
		stCode1 = Station.getStationId(st1);
		stCode2 = Station.getStationId(st2);
		if(stCode1!=-1 && stCode2!=-1){
			timetxt.setText("Time: "+calcStn.getTimeAndPath(stCode1, stCode2)+" minutes");
			pricetxt.setText("Price: $"+calcStn.getPrice());
			setListView(calcStn.getPath());
		}else{
			
		}
		
			
	}

	private void getStation( String [] arr){
		
		int count=0;
		for (StationEnum var : StationEnum.values()) {
			arr[count++]=var.getName();
		}
	}
	
	private void createDataBase(){
		
		new Thread(new Runnable() {
	        public void run() {
	        	VanSkytrainDB vanSkyDB = new VanSkytrainDB(getApplicationContext());
	    		SQLiteDatabase db = vanSkyDB.getReadableDatabase();
	                }
	            }).start();
	}
	private void setListView(ArrayList<StationEnum> route){
		final ListView listStation = (ListView)findViewById(R.id.listview);
		
		final StationArrayAdapter adapter= new StationArrayAdapter(this, route);
		listStation.setAdapter(adapter);
		
	}
	

}
