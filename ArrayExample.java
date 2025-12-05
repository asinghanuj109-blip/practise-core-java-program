package com.acharya.classes;

public class ArrayExample {

	public static void main(String[] args) {
		int arr[];
		arr = new int[6];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i * 3;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
