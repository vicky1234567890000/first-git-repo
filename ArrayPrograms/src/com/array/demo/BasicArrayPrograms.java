package com.array.demo;

public class BasicArrayPrograms {
	
	public static void main(String[] args) {

	
		int[] arr = new int[] {10,15,-2,-5,25,-1,0};
		
		for(int k : arr) {
			System.out.print(k+" ");
		}
		
		shuffle(arr);
		System.out.println();
		
		for(int k : arr) {
			System.out.print(k+" ");
		}
		
	}

	public static void shuffle(int[] arr) {
		
		int i =0;
		int j = arr.length-1;
		int temp=0;
		
		while(i<j) {
			while(arr[i]<0) i++;
			while(arr[j]>0) j--;
			
			if(i<j) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	
	public static void sort(int[] arr) {
		
		
	}

}
