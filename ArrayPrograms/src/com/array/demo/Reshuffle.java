package com.array.demo;

public class Reshuffle {

	public static void main(String[] args) {

		int[] arr = {-1,2,0,4,-4,5,-10};
		
		reshuff(arr);
	}

	public static void reshuff(int[] arr) {

		int i=0;
		int j = arr.length-1;
		
		while(i<j) {
			while(arr[i]<0) i++;
			while(arr[j]>=0) j--;
			
			if(i<j) {
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		for(int k : arr) {
			System.out.print(k+" ");
		}
	}

}
