package com.projectskytrain.constants;

public enum Station{
	
	WATERFRONT(0, "Waterfront", Line.EXPO_AND_MILLENNIUM_LINE, Zone.ZONE_1),
	BURRARD(1, "Burrard", Line.EXPO_AND_MILLENNIUM_LINE, Zone.ZONE_1), 
	GRANVILLE(2, "Granville", Line.EXPO_AND_MILLENNIUM_LINE, Zone.ZONE_1),
	STADION_CHINATOWN(3, "Station-Chinatown", Line.EXPO_AND_MILLENNIUM_LINE, Zone.ZONE_1),
	MAIN_STREET_SCIENCE_WORLD(4, "Main Street-Science World", Line.EXPO_AND_MILLENNIUM_LINE, Zone.ZONE_1),
	COMMERCIAL_BROADWAY_1(5, "Comercial-Broadway", Line.EXPO_AND_MILLENNIUM_LINE, Zone.ZONE_1),
	NANAIMO(6, "Nanaimo", Line.EXPO_AND_MILLENNIUM_LINE, Zone.ZONE_1),
	TWENTY_NINETH_AVENUE(7, "29th Avenue", Line.EXPO_AND_MILLENNIUM_LINE, Zone.ZONE_1),
	JOYCE_COLLINGWOOD(8, "Joyce-Collingwood", Line.EXPO_AND_MILLENNIUM_LINE, Zone.ZONE_1),
	PATTERSON(9,"Patterson",Line.EXPO_AND_MILLENNIUM_LINE, Zone.ZONE_2),
	METROTOWN(10,"Metrotown",Line.EXPO_AND_MILLENNIUM_LINE, Zone.ZONE_2),
	ROYAL_OAK(11,"Royal Oak",Line.EXPO_AND_MILLENNIUM_LINE, Zone.ZONE_2),
	EDMONDS(12,"Edmonds",Line.EXPO_AND_MILLENNIUM_LINE, Zone.ZONE_2),
	TWENTY_SECOND_STREET(13,"22nd Street",Line.EXPO_AND_MILLENNIUM_LINE, Zone.ZONE_2),
	NEW_WESTMINSTER(14,"New Westminster",Line.EXPO_AND_MILLENNIUM_LINE, Zone.ZONE_2),
	COLUMBIA(15,"Columbia",Line.EXPO_AND_MILLENNIUM_LINE, Zone.ZONE_2),
	SCOTT_ROAD(16,"Scott Road", Line.EXPO_LINE, Zone.ZONE_3),
	GETEWAY(17,"Gateway", Line.EXPO_LINE, Zone.ZONE_3),
	SURREY_CENTRAL(18,"Surrey Central", Line.EXPO_LINE, Zone.ZONE_3),
	KING_GEORGE(19,"King George", Line.EXPO_LINE, Zone.ZONE_3),
	SAPPERTON(20,"Sapperton", Line.MILLENNIUM_LINE, Zone.ZONE_2),
	BRAID(21,"Braid", Line.MILLENNIUM_LINE, Zone.ZONE_2),
	LOUGHEED_TOWN_CENTRE(22,"Lougheed Town Centre", Line.MILLENNIUM_LINE, Zone.ZONE_2),
	PRODUCTION_WAY_UNIVERSITY(23,"Production Way - University", Line.MILLENNIUM_LINE, Zone.ZONE_2),
	LAKE_CITY_WAY(24,"Lake City Way", Line.MILLENNIUM_LINE, Zone.ZONE_2),
	SPERLING_BURNABY_LAKE(25,"Sperling - Burnaby Lake", Line.MILLENNIUM_LINE, Zone.ZONE_2),
	HOLDOM(26,"Holdom", Line.MILLENNIUM_LINE, Zone.ZONE_2),
	BRENTWOOD_TOWN_CENTRE(27,"Brentwood Town Centre", Line.MILLENNIUM_LINE, Zone.ZONE_2),
	GILMORE(28,"Gilmore", Line.MILLENNIUM_LINE, Zone.ZONE_2),
	RUPERT(29,"Rupert", Line.MILLENNIUM_LINE, Zone.ZONE_1),
	RENFREW(30,"Renfrew", Line.MILLENNIUM_LINE, Zone.ZONE_1),
	COMERCIAL_BROADWAY_2(31,"Comercial - Broadway 2", Line.MILLENNIUM_LINE, Zone.ZONE_1),
	VCC_CLARK(32,"VCC - Clark", Line.MILLENNIUM_LINE, Zone.ZONE_1),
	WATERFRONT_CANADA_LINE(33,"Waterfront Canada Line", Line.CANADA_LINE, Zone.ZONE_1),
	VANCOUVER_CITY_CENTRE(34,"Vancouver City Centre", Line.CANADA_LINE, Zone.ZONE_1),
	YALETOWN_ROUNDHOUSE(35,"Yaletown-Roundhouse", Line.CANADA_LINE, Zone.ZONE_1),
	OLIMPIC_VILLAGE(36,"Olimpic Village", Line.CANADA_LINE, Zone.ZONE_1),
	BROADWAY_CITY_HALL(37,"Broadway - City Hall", Line.CANADA_LINE, Zone.ZONE_1),
	KING_EDWARD(38,"King Edward", Line.CANADA_LINE, Zone.ZONE_1),
	OAKRIDGE_41ST_AVENUE(39,"Oakridge - 41st Avenue", Line.CANADA_LINE, Zone.ZONE_1),
	LANGARA_49TH_AVENUE(40,"Langara - 49th Avenue", Line.CANADA_LINE, Zone.ZONE_1),
	MARINE_DIVE(41,"Marine Drive", Line.CANADA_LINE, Zone.ZONE_1),
	BRIDGEPORT(42,"Bridgeport", Line.CANADA_LINE, Zone.ZONE_2),
	TEMPLETON(43,"Templeton", Line.CANADA_LINE, Zone.ZONE_2),
	SEA_ISLAND_CENTRE(44,"Sea Island Centre", Line.CANADA_LINE, Zone.ZONE_2),
	YVR_AIRPORT(45,"YVR Airport", Line.CANADA_LINE, Zone.ZONE_2),
	ABERDEEN(46,"Aberdeen", Line.CANADA_LINE, Zone.ZONE_2),
	LANSDOWNE(47,"Lansdowne", Line.CANADA_LINE, Zone.ZONE_2),
	RICHMOND_BRIGHOUSE(48,"Richmond - Brighouse", Line.CANADA_LINE, Zone.ZONE_2),
	LOUGHEED_TOWN_CENTRE_EVERGREEN(49,"Lougheed Town Center - Evergreen", Line.EVERGREEN_LINE, Zone.ZONE_2),
	BURQUITLAM(50,"Burquitlam", Line.EVERGREEN_LINE, Zone.ZONE_3),
	MOODY_CENTRE(51,"Moody Centre", Line.EVERGREEN_LINE, Zone.ZONE_3),
	INTEL_CENTRE(52,"Intel Centre", Line.EVERGREEN_LINE, Zone.ZONE_3),
	COQUITLAM_CENTRAL(53,"Coquitlam Central", Line.EVERGREEN_LINE, Zone.ZONE_3),
	LINCOLN(54,"Lincoln", Line.EVERGREEN_LINE, Zone.ZONE_3),
	LAFARGE_LAKE_DOUGLAS(55,"Lafarge Lake - Douglas", Line.EVERGREEN_LINE, Zone.ZONE_3);
	
    private int code;
    private String name;
    private int line;
    private int zone;

    private Station(int code, String name, int line, int zone) {
            this.code = code;
            this.name = name;
            this.line = line;
            this.zone = zone;
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

}
