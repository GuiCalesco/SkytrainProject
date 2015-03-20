package com.example.projectskytrain;

import android.provider.BaseColumns;

public final class VanSkyTrainDBContract {
	public static final String DB_NAME = "van_sky_db";
	
	public VanSkyTrainDBContract(){
		
	}
	
	public static abstract class StationDB implements BaseColumns{
		public static final String TABLE_NAME = "station";
		public static final String COLUMN_ID = "st_id";
		public static final String COLUMN_NAME = "st_name";
		public static final String COLUMN_LINE = "st_line";
		public static final String COLUMN_ZONE = "st_zone";
	}
	
	public static abstract class BusDB implements BaseColumns{
		public static final String TABLE_NAME = "bus";
		public static final String COLUMN_ID = "bus_id";
		public static final String COLUMN_NAME = "bus_name";
	}
	
	public static abstract class BusStationDB implements BaseColumns{
		public static final String TABLE_NAME = "bus_station";
		public static final String COLUMN_BUS_ID = "bus_id";
		public static final String COLUMN_STATION_ID = "st_id";
	}

}
