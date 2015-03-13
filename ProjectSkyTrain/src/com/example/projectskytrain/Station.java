package com.example.projectskytrain;

public enum Station{
	
	WATERFRONT(0,"Waterfront"),
	BURRARD(1,"Burrard"), 
	GRANVILLE(2,"Granville"),
	STADION_CHINATOWN(3,"Stadion-Chinatown"),
	COMMERCIAL_BROADWAY_1(4,"Commercial Broadway 1"),
	NANAIMO(5,"Nanaimo"),
	TWENTY_NINETH_AVENUE(6,"29th Avenue"),
	JOYCE_COLLINGWOOD(7,"Joyce-Collingwood"),
	PATTERSON(9,"Patterson"),
	METROTOWN(10,"Metrotown"),
	;
	
    private  int code;
    private	String name;

    private Station(int code, String name) {
            this.code = code;
            this.name = name;
    }
    
    public int getCode(){
    	return code;
    }
    
    public String getName(){
    	return name;
    }
  
    

}
