package com.array.demo;

public class AppendArrayDemo {
	
	private int[] a = new int[3];
	private int p = 0;
	
	public static void main(String[] args) {
		
		AppendArrayDemo demo = new AppendArrayDemo();

		demo.add(10);
		demo.add(15);
		demo.add(0,2);
		
		System.out.println(demo);
		
		//demo.remove(0);
		//System.out.println(demo);
		
		System.out.println(demo.get(2));
	}


	public void add(int index, int x) {

		if(p>=a.length)
			increase();
		
		for(int i=a.length-1;i>index;i--) {
			a[i]=a[i-1];
		}
		a[index]=x;
		p++;
	}

	public int size() {

		return p;
	}

	@Override
	public String toString() {
		
		for(int i=0;i<this.size();i++) {
			 System.out.println(a[i]+" ");
		}
		return "";
	}
	
	public void add(int x) {
		if(p>=a.length) increase();
		
		a[p++]=x;
	}

	public void increase() {

		int[] b = new int[a.length+3];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		a=b;
	}

	public void remove(int index) {
		
		for(int i=index;i<a.length-1;i++) {
			a[i]=a[i+1];
		}
		
		a[a.length-1]=0;
		p--;
		
	}
	
	
	public int get(int index) {
		
		return a[index];
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
