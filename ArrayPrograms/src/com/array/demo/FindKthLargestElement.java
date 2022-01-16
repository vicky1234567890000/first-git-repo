package com.array.demo;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindKthLargestElement {

	public static void main(String[] args) {
		
		int[] arr = {20,10,60,30,50,40};

		int kth = kthLargest(arr,3);
		
		//System.out.println(kth);
		
		int kthSmallest = kthSmallest(arr, 3);
		
		System.out.println(kthSmallest);
	}

	private static int kthLargest(int[] arr, int k) {

		PriorityQueue<Integer> p = new PriorityQueue<>();
		
		for(int i=0;i<k;i++) {
			p.add(arr[i]);
		}
		
		for(int i=k;i<arr.length;i++) {
			if(arr[i]>p.peek()) {
				
				p.poll();
				p.add(arr[i]);
			}
		}
		return p.peek();
	}
	
	public static int kthSmallest(int[] arr,int k) {
		
		
		PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i=0;i<k;i++) {
			p.add(arr[i]);
		}
		
		for(int i=k;i<arr.length;i++) {
			if(arr[i]>p.peek()) {
				p.poll();
				p.add(arr[i]);
			}
		}
		
		return p.peek();
	}

}
