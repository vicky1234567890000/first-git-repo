package com.array.demo;

public class CheckIfArraySorted {
	
	public static void main(String[] args) {
		
		int[] arr = {10,20,25,30};
		
		if(isSorted(arr))
			System.out.println("array is sorted");
		else
			System.out.println("array is not sorted");
	}

	public static boolean isSorted(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) return false;
		}
		
		return true;
	}

}
