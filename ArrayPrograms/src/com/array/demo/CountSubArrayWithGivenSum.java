package com.array.demo;

import java.util.HashMap;
import java.util.Map;

public class CountSubArrayWithGivenSum {

	public static void main(String[] args) {

		int[] arr = {10,15,-5,15,-10,5};
		
		int sum = 5;
		
		int c = count(arr,sum);
		
		System.out.println(c);
	}

	public static int count(int[] arr, int sum) {
		
		int count =0;
		int curr_sum=0;
		Map<Integer,Integer> map = new HashMap<>();
		map.put(0, 1);
		for(int i=0;i<arr.length;i++) {
			
			curr_sum+=arr[i];
			
			if(map.containsKey(curr_sum-sum)) {
				count+=map.get(curr_sum-sum);
			}
			map.put(curr_sum, map.getOrDefault(curr_sum, 0));
		}
		return count;
	}

}
