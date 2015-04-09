package com.projectskytrain.constants;
/*Station Info: (code, name, line, zone, latitude, longitude)*/
public enum StationEnum{
	
	WATERFRONT(0, "Waterfront", Line.EXPO_AND_MILLENNIUM_LINE, Zone.ZONE_1,49.285687,-123.11177299999997),
	BURRARD(1, "Burrard", Line.EXPO_AND_MILLENNIUM_LINE, Zone.ZONE_1,49.285634,-123.11951499999998), 
	GRANVILLE(2, "Granville", Line.EXPO_AND_MILLENNIUM_LINE, Zone.ZONE_1,49.283136,-123.115744),
	STADION_CHINATOWN(3, "Stadion-Chinatown", Line.EXPO_AND_MILLENNIUM_LINE, Zone.ZONE_1, 49.279178,-123.10921300000001),
	MAIN_STREET_SCIENCE_WORLD(4, "Main Street-Science World", Line.EXPO_AND_MILLENNIUM_LINE, Zone.ZONE_1, 49.273156,-123.10045500000001),
	COMMERCIAL_BROADWAY_1(5, "Commercial - Broadway", Line.EXPO_AND_MILLENNIUM_LINE, Zone.ZONE_1, 49.262699,-123.069636),
	NANAIMO(6, "Nanaimo", Line.EXPO_AND_MILLENNIUM_LINE, Zone.ZONE_1, 49.248334,-123.05586800000003),
	TWENTY_NINETH_AVENUE(7, "29th Avenue", Line.EXPO_AND_MILLENNIUM_LINE, Zone.ZONE_1, 49.244236,-123.04613599999999),
	JOYCE_COLLINGWOOD(8, "Joyce-Collingwood", Line.EXPO_AND_MILLENNIUM_LINE, Zone.ZONE_1, 49.238353,-123.03182700000002),
	PATTERSON(9,"Patterson",Line.EXPO_AND_MILLENNIUM_LINE, Zone.ZONE_2, 49.229712,-123.012678),
	METROTOWN(10,"Metrotown",Line.EXPO_AND_MILLENNIUM_LINE, Zone.ZONE_2, 49.2276257,-123.0075756),
	ROYAL_OAK(11,"Royal Oak",Line.EXPO_AND_MILLENNIUM_LINE, Zone.ZONE_2, 49.22011,-122.98843999999997),
	EDMONDS(12,"Edmonds",Line.EXPO_AND_MILLENNIUM_LINE, Zone.ZONE_2, 49.212281,-122.95916699999998),
	TWENTY_SECOND_STREET(13,"22nd Street",Line.EXPO_AND_MILLENNIUM_LINE, Zone.ZONE_2, 49.20002,-122.948939),
	NEW_WESTMINSTER(14,"New Westminster",Line.EXPO_AND_MILLENNIUM_LINE, Zone.ZONE_2, 49.201459,-122.91262899999998),
	COLUMBIA(15,"Columbia",Line.EXPO_AND_MILLENNIUM_LINE, Zone.ZONE_2,49.204859,-122.90618599999999),
	SCOTT_ROAD(16,"Scott Road", Line.EXPO_LINE, Zone.ZONE_3, 49.204383,-122.87417099999999),
	GETEWAY(17,"Gateway", Line.EXPO_LINE, Zone.ZONE_3, 49.198946,-122.85067300000003),
	SURREY_CENTRAL(18,"Surrey Central", Line.EXPO_LINE, Zone.ZONE_3,49.189549,-122.847914),
	KING_GEORGE(19,"King George", Line.EXPO_LINE, Zone.ZONE_3, 49.182755,-122.84474399999999),
	SAPPERTON(20,"Sapperton", Line.MILLENNIUM_LINE, Zone.ZONE_2, 49.224687,-122.88936999999999),
	BRAID(21,"Braid", Line.MILLENNIUM_LINE, Zone.ZONE_2, 49.233235,-122.88271700000001),
	LOUGHEED_TOWN_CENTRE(22,"Lougheed Town Centre", Line.MILLENNIUM_LINE, Zone.ZONE_2, 49.248484,-122.896952),
	PRODUCTION_WAY_UNIVERSITY(23,"Production Way - University", Line.MILLENNIUM_LINE, Zone.ZONE_2, 49.253465,-122.91819099999998),
	LAKE_CITY_WAY(24,"Lake City Way", Line.MILLENNIUM_LINE, Zone.ZONE_2, 49.254609,-122.93918300000001),
	SPERLING_BURNABY_LAKE(25,"Sperling - Burnaby Lake", Line.MILLENNIUM_LINE, Zone.ZONE_2, 49.259154,-122.96399099999996),
	HOLDOM(26,"Holdom", Line.MILLENNIUM_LINE, Zone.ZONE_2, 49.264753,-122.98214899999999),
	BRENTWOOD_TOWN_CENTRE(27,"Brentwood Town Centre", Line.MILLENNIUM_LINE, Zone.ZONE_2, 49.266431,-123.00181299999997),
	GILMORE(28,"Gilmore", Line.MILLENNIUM_LINE, Zone.ZONE_2, 49.265002,-123.01357100000001),
	RUPERT(29,"Rupert", Line.MILLENNIUM_LINE, Zone.ZONE_1, 49.260815,-123.032869),
	RENFREW(30,"Renfrew", Line.MILLENNIUM_LINE, Zone.ZONE_1, 49.258877,-123.04534799999999),
	COMMERCIAL_BROADWAY_2(31,"Commercial - Broadway (Millennium Line)", Line.MILLENNIUM_LINE, Zone.ZONE_1, 49.262699,-123.069636),
	VCC_CLARK(32,"VCC - Clark", Line.MILLENNIUM_LINE, Zone.ZONE_1, 49.265873,-123.079049),
	WATERFRONT_CANADA_LINE(33,"Waterfront (Canada Line)", Line.CANADA_LINE, Zone.ZONE_1,49.285687,-123.11177299999997),
	VANCOUVER_CITY_CENTRE(34,"Vancouver City Centre", Line.CANADA_LINE, Zone.ZONE_1, 49.282411,-123.11832400000003),
	YALETOWN_ROUNDHOUSE(35,"Yaletown-Roundhouse", Line.CANADA_LINE, Zone.ZONE_1, 49.274356,-123.12184200000002),
	OLIMPIC_VILLAGE(36,"Olimpic Village", Line.CANADA_LINE, Zone.ZONE_1, 49.266592,-123.11549400000001),
	BROADWAY_CITY_HALL(37,"Broadway - City Hall", Line.CANADA_LINE, Zone.ZONE_1, 49.263139,-123.11469399999999),
	KING_EDWARD(38,"King Edward", Line.CANADA_LINE, Zone.ZONE_1, 49.249119,-123.11550499999998),
	OAKRIDGE_41ST_AVENUE(39,"Oakridge - 41st Avenue", Line.CANADA_LINE, Zone.ZONE_1, 49.233469,-123.11639000000002),
	LANGARA_49TH_AVENUE(40,"Langara - 49th Avenue", Line.CANADA_LINE, Zone.ZONE_1, 49.226087,-123.116333),
	MARINE_DIVE(41,"Marine Drive", Line.CANADA_LINE, Zone.ZONE_1, 49.20981,-123.11695700000001),
	BRIDGEPORT(42,"Bridgeport", Line.CANADA_LINE, Zone.ZONE_2, 49.195824,-123.125809),
	TEMPLETON(43,"Templeton", Line.CANADA_LINE, Zone.ZONE_2, 49.196654,-123.14630599999998),
	SEA_ISLAND_CENTRE(44,"Sea Island Centre", Line.CANADA_LINE, Zone.ZONE_2, 49.193078,-123.15897899999999),
	YVR_AIRPORT(45,"YVR Airport", Line.CANADA_LINE, Zone.ZONE_2, 49.194249,-123.17778900000002),
	ABERDEEN(46,"Aberdeen", Line.CANADA_LINE, Zone.ZONE_2, 49.184213,-123.13645300000002),
	LANSDOWNE(47,"Lansdowne", Line.CANADA_LINE, Zone.ZONE_2, 49.174519,-123.13637),
	RICHMOND_BRIGHOUSE(48,"Richmond - Brighouse", Line.CANADA_LINE, Zone.ZONE_2, 49.167558,-123.13638100000003),
	LOUGHEED_TOWN_CENTRE_EVERGREEN(49,"Lougheed Town Centre (Evergreen)", Line.EVERGREEN_LINE, Zone.ZONE_2, 49.248484,-122.896952),
	BURQUITLAM(50,"Burquitlam", Line.EVERGREEN_LINE, Zone.ZONE_3,49.261389, -122.889722),
	MOODY_CENTRE(51,"Moody Centre", Line.EVERGREEN_LINE, Zone.ZONE_3, 40.7127837, -74.00594130000002),
	INLET_CENTRE(52,"Inlet Centre", Line.EVERGREEN_LINE, Zone.ZONE_3, 49.277222, -122.827778),
	COQUITLAM_CENTRAL(53,"Coquitlam Central", Line.EVERGREEN_LINE, Zone.ZONE_3, 49.273889, -122.8),
	LINCOLN(54,"Lincoln", Line.EVERGREEN_LINE, Zone.ZONE_3, 49.2815819, -122.7535881),
	LAFARGE_LAKE_DOUGLAS(55,"Lafarge Lake - Douglas", Line.EVERGREEN_LINE, Zone.ZONE_3, 49.285556, -122.791667);
	
    private int code;
    private String name;
    private int line;
    private int zone;
    private double latitude;
    private double longitude;

    private StationEnum(int code, String name, int line, int zone, double latitude, double longitude) {
            this.code = code;
            this.name = name;
            this.line = line;
            this.zone = zone;
            this.latitude = latitude;
            this.longitude = longitude;
    }
    
    public int getCode(){
    	return this.code;
    }
    
    public String getName(){
    	return this.name;
    }
    
    public int getLine(){
    	return this.line;
    }
    
    public int getZone(){
    	return this.zone;
    }
    
    public double getLatitude(){
    	return latitude;
    }
    
    public double getLongitude(){
    	return longitude;
    }

}
