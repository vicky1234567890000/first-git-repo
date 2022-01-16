package com.array.demo;

public class SecondLargestElement {

	public static void main(String[] args) {

		int[] arr = {10,25,5,30,40};
		
		int max_value = Integer.MIN_VALUE;
		
		int second_max_value = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max_value) {
				second_max_value=max_value;
				max_value=arr[i];
			}
			
			else if(arr[i]>second_max_value) {
				second_max_value=arr[i];
			}
		}
		System.out.println(second_max_value);
	}

}
