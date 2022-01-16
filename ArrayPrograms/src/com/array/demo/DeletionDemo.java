package com.array.demo;

public class DeletionDemo {

	public static void main(String[] args) {

		int[] arr= {100 ,8 ,3 ,7 ,12 ,15 ,6 ,9};
		deletionDemo(arr,2);
		
		stringTest("Abhisek");
	}

	public static void stringTest(String str) {

		String s1 = new String(str);
		String s2 = new String(str);
		
		String s3 = "Abhisek";
		String s4 = "Abhisek";
		
		System.out.println(s1==s2);
		System.out.println(s3==s4);
	}

	public static void deletionDemo(int[] arr, int index) {

		int i=0;
		for(i=index;i<arr.length-1;i++) {
			
			arr[i]=arr[i+1];
		}
		arr[i]=0;
		for(int x : arr) {
			System.out.print(x+" ");
		}
		System.out.println();
	}

}
