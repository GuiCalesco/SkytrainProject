package com.projectskytrain.auxiliry;
import java.util.Scanner;
import java.io.File;

public class ReadData{
    public static int[][] getData() {
       int [][] grafoStations = new int[56][56];
       initiateMatrix(grafoStations,56);
       try{
       		
       		Scanner s = new Scanner(new File("info.txt"));

        	int n = s.nextInt();
        	
        	for(int i = 0; i < n; i++){
        		int origin = s.nextInt();
        		int destiny = s.nextInt();
        		int time = s.nextInt();
        		
        		//System.out.println("From "+origin+" To "+destiny+"  Takes "+time);
        		grafoStations[origin][destiny] = time;
        		grafoStations[destiny][origin] = time;
        	}
        	//printMatrix(grafoStations, 56);
        	
       }catch(Exception ex){
    	   System.out.println("Error: "+ex.getMessage());
       }
       	
       return grafoStations;
       
    }
    
    public static void initiateMatrix(int [][] matrix, int n){
    	for(int i = 0; i < n; i++){
    		for(int j = 0; j < n; j++){
    			matrix[i][j] = -1;
    		}
    	}
    }
    
     public static void printMatrix(int [][] matrix, int n){
    	for(int i = 0; i < n; i++){
    		for(int j = 0; j < n; j++){
    			System.out.print(matrix[i][j]+" | ");
    		}
    		System.out.print("\n");
    	}
    }
    
    
}
