package com.projectskytrain.auxiliry;

import java.util.LinkedList;

import com.projectskytrain.constants.StationEnum;

public class Station {
	
	int [][] grafoStations;
	LinkedList<Integer> path;
	final int numberOfStation = 56;
	
	public Station(){
		grafoStations = ReadData.getData();
		
	}
	
	public static int getStationId(String stationName){
		int id = -1;
		
		for (StationEnum var : StationEnum.values()) {
			if(var.getName().equals(stationName)){
				id = var.getCode();
				break;
			}
		}
		
		return id;
	}
	
	public static StationEnum getStationInfo( int id){
		StationEnum station = null;
		for (StationEnum var : StationEnum.values()) {
			if(var.getCode()==id){
				station = var;
				break;
			}
		}
		
		return station;
	}
	
	public int getTimeAndPath(int stnCode1, int stnCode2){
		return GrafoStation.shortestPath(grafoStations, numberOfStation, stnCode1, stnCode2, path);
	}
	
	
	

}
