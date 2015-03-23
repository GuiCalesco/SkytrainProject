package com.projectskytrain;

import com.example.projectskytrain.R;
import com.projectskytrain.constants.Station;
import com.projectskytrain.database.VanSkytrainDB;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

public class MainScreen extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		createDataBase();
		setContentView(R.layout.main_screen);
		
		
		
		
		}
	
	private void createDataBase(){
		
		new Thread(new Runnable() {
	        public void run() {
	        	VanSkytrainDB vanSkyDB = new VanSkytrainDB(getApplicationContext());
	    		SQLiteDatabase db = vanSkyDB.getReadableDatabase();
	                }
	            }).start();
	}
	
	private int getStationId(String stationName){
		int id = -1;
		
		for (Station var : Station.values()) {
			if(var.getName().equalsIgnoreCase(stationName)){
				id = var.getCode();
				break;
			}
		}
		
		return id;
	}
	

}
