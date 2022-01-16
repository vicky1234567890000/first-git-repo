package com.array.demo;

public class SortedSetImpl {
	
	private int[] a = new int[3];
	private int p=0;

	public static void main(String[] args) {

		SortedSetImpl set = new SortedSetImpl();
		set.insert(10);
		set.insert(5);
		set.insert(20);
		set.insert(12);
		set.insert(8);
		set.insert(5);
		set.insert(12);
		
		System.out.println(set);
		
		//System.out.println(set.p);
		try {
		set.remove(4);
		}catch(IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(set);
		
		try {
			set.removeElement(16);
		}catch(ElementNotFoundException e) {
			
			System.out.println(e.getMessage());
			
		}
		
		System.out.println(set);
		
	}
	
	@Override
	public String toString() {
		for(int i=0;i<p;i++) {
			System.out.print(a[i]+" ");
		}
		return "";
	}
	
	public void insert(int x) {
		
		for(int i=0;i<p;i++) {
			if(a[i]==x) return;
		}
		
		if(p>=a.length-1) increase();
		
		if(p==0 || x>a[p-1])
			a[p++]=x;
		else {
			int i=p-1;
			while(i>=0 && a[i]>x) {
				a[i+1]=a[i];
				i--;
			}
			a[i+1]=x;
			p++;
		}
		
	}
	
	public void removeElement(int ele) {
		int i =0;
		for(;i<p;i++) {
			if(a[i]==ele) {
				remove(i);
				return;
			}
		}
		if(i==p) {
			throw new ElementNotFoundException("Element "+ele+" not found in the array");
		}
	}
	
	public void remove(int index) throws IndexOutOfBoundsException{
		
		if(index >= p) {
			throw new IndexOutOfBoundsException("index "+index+" is not present");
		}
		
		int i = index;
		for(;i<p-1;i++) {
			a[i]=a[i+1];
		}
		a[i]=0;
		p--;
	}

	private void increase() {

		int[] b = new int[a.length+3];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		a=b;
	}
	
	private class ElementNotFoundException extends RuntimeException{
		
		private static final long serialVersionUID = 1L;
		
		ElementNotFoundException(String s){
			super(s);
		}
		
		
	}

}
