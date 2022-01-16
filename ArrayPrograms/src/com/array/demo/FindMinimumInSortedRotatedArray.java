package com.array.demo;

public class FindMinimumInSortedRotatedArray {

	public static void main(String[] args) {

		Integer[] arr = {12,15,18,11,5,4,6};
		int min = findMinimum(arr);
		
		System.out.println(min);
	}

	private static int findMinimum(Integer[] arr) {
		
		int low = 0;
		int high = arr.length-1;
		
		int n = arr.length;
		
		while(low<=high) {
			
			if(arr[low] <= arr[high]) return low;
			
			int mid = (low+high)/2;
			
			int next = (mid+1)%n;
			
			int prev = (mid+n-1)%n;
			
			if(arr[mid]<=arr[next] && arr[mid]<=arr[prev]) return arr[mid];
			
			else if(arr[mid]<=arr[high]) high=mid-1;
			
			else if(arr[mid]>=arr[high]) low = mid+1;
		}
		
		return -1;
	}

}
