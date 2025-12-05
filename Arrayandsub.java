package com.acharya.classes;

import java.util.*;

public class Arrayandsub {

	public static void main(String[] args) {
		int arr[] = { 12, 13, 10, 19, 29 };
		Scanner sc = new Scanner(System.in);
		System.out.print("enter start index");
		int start = sc.nextInt();
		System.out.print("enter end index");
		int end = sc.nextInt();
		int a = Arrayandsub.subArray(arr, start, end);

	}

	public static int subArray(int myarr[], int sindex, int eindex) {

		for (int i = sindex; i < eindex; i++) {
			System.out.print(myarr[i] + " , ");
		}
		return 0;
	}

}
