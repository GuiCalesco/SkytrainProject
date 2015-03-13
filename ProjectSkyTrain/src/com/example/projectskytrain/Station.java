package com.example.projectskytrain;

public enum Station{
	
	WATERFRONT(0,"Waterfront"),
	BURRARD(1,"Burrard"), 
	GRANVILLE(2,"Granville"),
	STADION_CHINATOWN(3,"Station-Chinatown"),
	MAIN_STREET_SCIENCE_WORLD(4,"Main Street-Science World"),
	COMMERCIAL_BROADWAY_1(5,"Comercial-Broadway"),
	NANAIMO(6,"Nanaimo"),
	TWENTY_NINETH_AVENUE(7,"29th Avenue"),
	JOYCE_COLLINGWOOD(8,"Joyce-Collingwood"),
	PATTERSON(9,"Patterson"),
	METROTOWN(10,"Metrotown"),
	ROYAL_OAK(11,"Royal Oak"),
	EDMONDS(12,"Edmonds"),
	TWENTY_SECOND_STREET(13,"22nd Street"),
	NEW_WESTMINSTER(14,"New Westminster"),
	COLUMBIA(15,"Columbia"),
	SCOTT_ROAD(16,"Scott Road"),
	GETEWAY(17,"Gateway"),
	SURREY_CENTRAL(18,"Surrey Central"),
	KING_GEORGE(19,"King George"),
	SAPPERTON(20,"Sapperton"),
	BRAID(21,"Braid"),
	LOUGHEED_TOWN_CENTRE(22,"Lougheed Town Centre"),
	PRODUCTION_WAY_UNIVERSITY(23,"Production Way - University"),
	LAKE_CITY_WAY(24,"Lake City Way"),
	SPERLING_BURNABY_LAKE(25,"Sperling - Burnaby Lake"),
	HOLDOM(26,"Holdom"),
	BRENTWOOD_TOWN_CENTRE(25,"Brentwood Town Centre"),
	GILMORE(26,"Gilmore"),
	RUPERT(27,"Rupert"),
	RENFREW(28,"Renfrew"),
	COMERCIAL_BROADWAY_2(29,"Comercial - Broadway 2"),
	VCC_CLARK(30,"VCC - Clark"),
	WATERFRONT_CANADA_LINE(31,"Waterfront Canada Line"),
	VANCOUVER_CITY_CENTRE(32,"Vancouver City Centre"),
	YALETOWN_ROUNDHOUSE(33,"Yaletown-Roundhouse"),
	OLIMPIC_VILLAGE(34,"Olimpic Village"),
	BROADWAY_CITY_HALL(35,"Broadway - City Hall"),
	KING_EDWARD(36,"King Edward"),
	OAKRIDGE_41ST_AVENUE(37,"Oakridge - 41st Avenue"),
	LANGARA_49TH_AVENUE(38,"Langara - 49th Avenue"),
	MARINE_DIVE(39,"Marine Drive"),
	BRIDGEPORT(40,"Bridgeport"),
	TEMPLETON(41,"Templeton"),
	SEA_ISLAND_CENTRE(42,"Sea Island Centre"),
	YVR_AIRPORT(43,"YVR Airport"),
	ABERDEEN(44,"Aberdeen"),
	LANSDOWNE(45,"Lansdowne"),
	RICHMOND_BRIGHOUSE(46,"Richmond - Brighouse"),
	LOUGHEED_TOWN_CENTRE_EVERGREEN(47,"Lougheed Town Center - Evergreen"),
	BURQUITLAM(48,"Burquitlam"),
	MOODY_CENTRE(49,"Moody Centre"),
	INTEL_CENTRE(50,"Intel Centre"),
	COQUITLAM_CENTRAL(51,"Coquitlam Central"),
	LINCOLN(52,"Lincoln"),
	LAFARGE_LAKE_DOUGLAS(53,"Lafarge Lake - Douglas");
	
    private int code;
    private String name;

    private Station(int code, String name) {
            this.code = code;
            this.name = name;
    }
    
    public int getCode(){
    	return this.code;
    }
    
    public String getName(){
    	return this.name;
    }

}
