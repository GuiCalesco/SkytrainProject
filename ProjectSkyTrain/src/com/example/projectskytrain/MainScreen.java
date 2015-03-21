package com.example.projectskytrain;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

public class MainScreen extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_screen);
		
		VanSkytrainDB vanSkyDB = new VanSkytrainDB(this);
		SQLiteDatabase db = vanSkyDB.getReadableDatabase();
	}

}
