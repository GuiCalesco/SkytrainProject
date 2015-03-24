package com.projectskytrain;

import com.example.projectskytrain.R;
import com.projectskytrain.constants.StationEnum;
import com.projectskytrain.database.VanSkytrainDB;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;

public class MainScreen extends Activity {
	String[] stnNames = new String[56];

	
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
		 //final TextView test = (TextView)findViewById(R.id.textView1);
		 
		 fromStation.setAdapter(adapter);
         toStation.setAdapter(adapter);
        


	}

	public void getStation( String [] arr){
		
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

}
