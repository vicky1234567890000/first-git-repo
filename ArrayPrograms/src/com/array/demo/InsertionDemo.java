package com.array.demo;

public class InsertionDemo {

	public static void main(String[] args) {

		int[] arr = { 8, 3, 7, 12, 15, 6, 9, 10 };
		insertion(arr, 0, 100);

	}

	public static void insertion(int[] arr, int index, int value) {

		if (arr.length == 0 || index >= arr.length || index < 0) {

			System.out.println("insertion not possible");
		} else {
			for (int i = arr.length - 1; i > index; i--) {

				arr[i] = arr[i - 1];
			}
			arr[index] = value;

			for (int i : arr) {
				System.out.print(i + " ");
			}
		}
	}

}
