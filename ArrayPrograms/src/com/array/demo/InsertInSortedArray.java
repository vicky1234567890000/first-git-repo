package com.array.demo;

public class InsertInSortedArray {
	
	private int[] a = new int[3];
	private int p;

	public static void main(String[] args) {
		
		InsertInSortedArray sortedArray = new InsertInSortedArray();
		sortedArray.add(10);
		sortedArray.add(20);
		sortedArray.add(30);
		sortedArray.add(5);
		sortedArray.add(-2);
		sortedArray.add(0);
		sortedArray.add(-1);
		sortedArray.add(15);
		sortedArray.add(20);
		sortedArray.add(0);
		sortedArray.add(10);
		System.out.println(sortedArray);
	}
	
	public int size() {
		return p;
	}
	
	@Override
	public String toString() {

		for(int i=0;i<p;i++) {
			System.out.print(a[i]+" ");
		}
	
		return "";
	}

	public void add(int ele) {
		
		//int[] arr = {10,20,30,40,50};
		
		for(int i=0;i<p;i++) {
			if(a[i]==ele)
				return;
		}
		
		int i=a.length-1;
		
		if(p>=a.length) increase();
		
		if(p==0 || ele > a[p-1]) {
			a[p++]=ele;
		}
		else {
			
			i=p-1;
			while(i>=0 && a[i]>ele) {
				a[i+1]=a[i];
				i--;
			}
			a[i+1]=ele;
			p++;
		}
       
	}

	public void increase() {

		int[] b = new int[a.length+3];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		a=b;
	}
}
