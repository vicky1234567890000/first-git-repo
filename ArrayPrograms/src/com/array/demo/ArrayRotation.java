package com.array.demo;

import static java.lang.Double.valueOf;

public class ArrayRotation {

	public static void main(String[] args) {

		// right rotation

		int[] arr1 = { 20, 19, 9, 8, 4, 3, 1 };

		int[] arr2 = { 20, 19, 9, 8, 4, 3, 1 };

		rightRotation(arr1, 2);

		leftRotation(arr2, 2);

		for (int i : arr1) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		for(int i : arr2) {
			System.out.print(i+" ");
		}
	}

	public static void leftRotation(int[] arr, int shiftCount) {

		int temp;

		while (shiftCount > 0) {

			temp = arr[0];

			for (int i = 0; i < arr.length - 1; i++) {

				arr[i] = arr[i + 1];
			}
			arr[arr.length - 1] = temp;

			shiftCount--;
		}
	}

	public static void rightRotation(int[] arr, int shiftCount) {

		int temp;

		while (shiftCount > 0) {

			temp = arr[arr.length - 1];

			for (int i = arr.length - 1; i >= 1; i--) {

				arr[i] = arr[i - 1];
			}

			arr[0] = temp;

			shiftCount--;

		}
	}
	
	class A {
		
		private void m1() {}
	}
	
	class B extends A {
		public void m1() {}
	}

}
