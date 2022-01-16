 package com.array.demo;

public class ArrayListImpl {
	
	private int[] a = new int[3];
	private int p=0;

	public static void main(String[] args) {

		ArrayListImpl al=new ArrayListImpl();
		al.add(-10);
		al.add(-15);
		al.add(8);
		al.add(5);
		al.add(10);
		al.add(-2);
		
		System.out.println(al);
		
		//al.remove(6);
		
		//System.out.println(al);
		
		//al.add(2,16);
		
		//System.out.println(al);
		
		ArrayListImpl shuffleAl = al.shuffle();
		
		System.out.println("***************");
		
		System.out.println(shuffleAl);
		
		System.out.println(al);
	}
	
	@Override
	public String toString() {
		
		for(int i=0;i<p;i++) {
			System.out.print(a[i]+" ");
		}
		
		return "";
	}
	
	public void add(int x) {
		
		if(p>=a.length) increase();
		
		a[p++]=x;
	}
	
	public void add(int index,int ele) {
		
		int i = a.length-1;
		for(;i>index;i--) {
			a[i]=a[i-1];
		}
		a[i]=ele;
		p++;
	}
	
	public void remove(int index) {
		
		int i=index;
		for(;i<p-1;i++) {
			a[i]=a[i+1];
		}
		a[p-1]=0;
		p--;
		
	}

	private void increase() {

		int[] b = new int[a.length+3];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		a=b;
	}
	
	
	public ArrayListImpl shuffle() {
		
		int[] c = a;
		
		int i = 0;
		int j = p-1;
		int temp;
		
		while(i<j) {
			
			while(c[i]>0) i++;
			while(c[j]<0) j--;
			
			if(i<j) {
				temp=c[i];
				c[i]=c[j];
				c[j]=temp;
				
			}
		}
		
		ArrayListImpl al = new ArrayListImpl();
		for(int k=0;k<p;i++) {
			al.add(c[k]);
		}
		
		return al;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
