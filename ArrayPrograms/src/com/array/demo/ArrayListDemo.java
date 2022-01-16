package com.array.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		System.out.println(al.add(10));
		System.out.println(al.add(20));
		System.out.println(al.add(30));
		System.out.println(al.add(10));
		System.out.println(al.add(10));
		
		al.add(5,100);
		
		System.out.println(al);
		try {
		al.remove(100);
		}catch(IndexOutOfBoundsException e) {
			System.out.println("can not be removed");
		}
		
		Iterator<Integer> itr = al.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
