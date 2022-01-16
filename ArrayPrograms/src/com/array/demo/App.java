package com.array.demo;

import java.util.HashMap;

public class App {

	public static void main(String[] args) {

		HashMap<Student,String> map = new HashMap<>();
		Student student = new Student("abhilash");
		map.put(student, "india");
		System.out.println(map.get(student));
		System.out.println(map.get(student));
		System.out.println(map.get(student));
		System.out.println(map.get(student));
		System.out.println(map.get(student));
		
		System.out.println("***************");
		HashMap<String,String> map2 = new HashMap<>();
		map2.put("virat","US");
	    System.out.println(map2.get("virat"));
	    System.out.println(map2.get("virat"));
	    System.out.println(map2.get("virat"));
	    System.out.println(map2.get("virat"));
	    System.out.println(map2.get("virat"));
	}

}
