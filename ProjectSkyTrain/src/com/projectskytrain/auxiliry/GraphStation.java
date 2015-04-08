

package com.projectskytrain.auxiliry;
import java.util.*;
public class GraphStation{
	static class Member
	{
		public int distance; 
		public int from;  
	 };
	 
	 LinkedList<Integer> path;
	
	 public GraphStation(){
		
	 }
	public int shortestPath(int [][] grafo, int n, int origin, int destiny){

		Member[] dis = new Member[n];
		int index = 0;
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		 initiateArray(dis,n);
		 dis[origin].distance=0;
		 dis[origin].from=origin;
		 list.add(origin);
		 list.add(-1);
		 
		while(list.get(index)!=-1){
		 		
		 	for(int i = 0; i < n; i++){
		 	
		 		if(grafo[list.get(index)][i]!= -1)
				{	
					
					int dist=dis[list.get(index)].distance+grafo[list.get(index)][i];
					if(dis[i].distance== -1 || dist < dis[i].distance)
					{
						dis[i].distance=dist;
						dis[i].from=list.get(index);
			
					}
					if(!list.contains(i))
					{
						list.add(list.size()-1,i);
							
					}
				}			
		 	
		 	}
		 	
		 	index++;
		 }
		 
		path = getPath(dis,origin,destiny);
		
		return dis[destiny].distance;
	}
	
	private static void initiateArray(Member[] arr, int n){
		for(int i = 0; i < n; i++){
			arr[i] = new Member();
			
			arr[i].distance = -1;
			arr[i].from = -1;		
		}

	}

	private  LinkedList<Integer> getPath(Member[] arr, int origin, int destiny){
	
		LinkedList<Integer> path = new LinkedList<Integer>();
		
		path.add(destiny);
		
		while(path.getFirst()!= origin){
			path.addFirst(arr[path.getFirst()].from);
		}
		
		return path;
		
	}
	
	public  LinkedList<Integer> getPath(){
		return path;
	}
	
} 
