package com.array.demo;

public class Emp implements Comparable<Emp>{
	
	private String name;
	private int id;
	private int sal;
	
	public Emp() {
		
	}
	
	
	public Emp(String name, int id, int sal) {
		this.name = name;
		this.id = id;
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public int compareTo(Emp e) {
		
		return id-e.id;
	}


	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", sal=" + sal + "]";
	}
	
	

}
