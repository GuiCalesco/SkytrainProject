package com.projectskytrain.auxiliry;

import com.projectskytrain.constants.StationEnum;

public abstract class Station {

	private static int getStationId(String stationName){
		int id = -1;
		
		for (StationEnum var : StationEnum.values()) {
			if(var.getName().equalsIgnoreCase(stationName)){
				id = var.getCode();
				break;
			}
		}
		
		return id;
	}
	
	private static StationEnum getStationInfo( int id){
		StationEnum station = null;
		for (StationEnum var : StationEnum.values()) {
			if(var.getCode()==id){
				station = var;
				break;
			}
		}
		
		return station;
	}
	

}
