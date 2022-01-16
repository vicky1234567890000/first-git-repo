package com.array.demo;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesInArray {

	public static void main(String[] args) {

		Integer[] arr = {10,10,10,2,3,2,5,4,5,5,5,5,4,6,7,6,8,10,1};
		
		Integer[] arr1 = {1,1,1,1,2,2,3,4,4,5,5,5,5};
		
		removeDuplicates(arr);
		
		removeDuplicatesAlternative(arr1);
	}

	private static void removeDuplicatesAlternative(Integer[] arr) {

		int j =0;
		
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i] !=arr[i+1]) {
				arr[j]=arr[i];
				j++;
			}
		}
			arr[j]=arr[arr.length-1];
		Integer[] temp = new Integer[j+1];
		int k=0;
		for(int i=0;i<=j;i++) {
			temp[k]=arr[i];
			k++;
		}
		System.out.println(Arrays.toString(temp));
		
	}

	private static void removeDuplicates(Integer[] arr) {

		HashSet<Integer> hs = new HashSet<>();
		int size =0;
		int k =0;
		for(int i=0;i<arr.length;i++) {
			
		     if(hs.add(arr[i])) size=size+1;
		}
		Integer[] temp = new Integer[size];
		
		for(int x : hs) {
			temp[k]=x;
			k++;
		}
		
		System.out.println(Arrays.toString(temp));
	}

}
