package com.example.projectskytrain;

public enum Stations{
	
	WATERFRONT(0),
	BURRARD(1), 
	GRANVILLE(2),
	STADION_CHINATOWN(3);
	
    public int code;

    private Stations(int code) {
            this.code = code;
    }

}
