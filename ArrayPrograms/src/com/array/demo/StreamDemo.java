package com.array.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		Optional<Integer> sum = list.stream().reduce((a,b) -> a+b);
		
		Integer sum1 = list.stream().reduce(0,(a,b) -> a+b);
		if(sum.get() !=null) {
			System.out.println(sum.get());
		}
	
		System.out.println(sum1);

		String s = "My name is Abhisek";
		
		Optional<String> name = Optional.of("My name is Abhisek");
		
		Optional<String[]> strarr = name.map(str -> str.split(" "));
		
	    for(String s1 : strarr.get()) {
	    	System.out.print(s1+" ");
	    }
	    
	    
	   // String[] arr1 = strarr.get();
	    
	    List<String> strList = List.of("A","AB","CD","ABC"); 
	    
	   // strList.stream().sorted(str -> this.length()-str.length()).collect(Collectors.toList());
	    
	    
		
	}

}
