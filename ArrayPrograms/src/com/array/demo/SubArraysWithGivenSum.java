package com.array.demo;

import java.util.HashMap;
import java.util.Map;

public class SubArraysWithGivenSum {

	public static void main(String[] args) {

		int[] arr = {10,15,-5,15,-10,5};
		int sum = 5;
		
		subArraysWithSpecifiedSum(arr,sum);
	}

	public static void subArraysWithSpecifiedSum(int[] a,int sum) {
 
		int curr_sum=0;
		int start =0;
		int end = -1;
		
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i=0;i<a.length;i++) {
			
			curr_sum+=a[i];
			
			if(map.containsKey(curr_sum-sum)) {
				
				start = map.get(curr_sum-sum)+1;
				end = i ;
				for(int j=start;j<=end;j++) {
					System.out.print(a[start]+" ");
				}
				System.out.println();
			}
			
			map.put(curr_sum,i);
		}
		
	}

}
