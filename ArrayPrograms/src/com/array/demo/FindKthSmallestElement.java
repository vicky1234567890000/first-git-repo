package com.array.demo;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindKthSmallestElement {

	public static void main(String[] args) {
		
		int[] a = {20,10,30,60,50,40};
 
		int result = kthSmallestElement(a,3);
		
		System.out.println(result);
	}

	private static int kthSmallestElement(int[] a,int k) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i=0;i<k;i++) {
			pq.add(a[i]);
		}
		
		for(int i=k;i<a.length;i++) {
			if(pq.peek()>a[i]) {
				pq.poll();
				pq.add(a[i]);
			}
		}
		return pq.peek();
	}

}
