package com.array.demo;

import java.util.ArrayList;

public class MinDistanceInArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,2};

		int dis = minDist(arr,1,2);
	}

	public static int minDist(int[] arr, int x, int y) {
		
		ArrayList<Integer> list = new ArrayList<>();
        for(int i : arr){
            list.add(i);
        }
        
        int distance = Integer.MAX_VALUE;
        
        if(list.contains(x) && list.contains(y)) {
        	
        	for(int i=0;i<list.size();i++) {
        		
        	}
        }
		
		return -1;
	}

}
