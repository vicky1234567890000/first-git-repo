package com.array.demo;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class EmpDemo {

	public static void main(String[] args) {

		Emp[] arr = new Emp[5];
		arr[0]=new Emp("Abhisek",1,5000);
		arr[1]=new Emp("Virat",5,7000);
		arr[2]=new Emp("Rohit",4,4000);
		arr[3]=new Emp("Rishav",3,3000);
		arr[4]=new Emp("Kartik",2,10000);
		
		
		TreeSet<Emp> set = new TreeSet<Emp>(
				
				(e1,e2) -> {return e2.getSal()-e1.getSal();}
				
				
				);
		set.add(new Emp("Abhisek",1,5000));
		set.add(new Emp("Virat",5,7000));
		set.add(new Emp("Rohit",4,4000));
		
		System.out.println(set);
		
		//List<Emp> empList = Arrays.asList(arr);
		
		//empList.stream().forEach(e -> System.out.println(e));
	}

}
