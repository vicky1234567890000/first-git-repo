package com.array.demo;

import java.util.PriorityQueue;
import java.util.Scanner;

public class SortNearlySortedArray {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the rotation");
		int k = s.nextInt();
		
		System.out.println("Enter the size of the array");
		int n = s.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		/*
		for(int x : arr) {
			System.out.print(x+" ");
		}
		*/
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for(int i=0;i<=k;i++) {
			pq.add(arr[i]);
		}
		
		for(int i=k+1;i<arr.length;i++) {
			System.out.println(pq.remove());
			pq.add(arr[i]);
		}
		
		
		  while(pq.size() >0)  System.out.println(pq.remove()); 
		 
	}

}
