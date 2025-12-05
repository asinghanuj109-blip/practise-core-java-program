package com.acharya.classes;

import java.util.*;

public class Numbersearch {

	public static void main(String[] args) {

		int a[] = new int[5];

		Scanner sc = new Scanner(System.in);
		System.out.print("enter the elements");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.print("enter your number to search");
		boolean found = false;
		int search = sc.nextInt();

		for (int i = 0; i < a.length; i++) {

			if (search == a[i]) {
				found = true;
				break;
			}

		}
		if (found = true) {
			System.out.print(" Number found in this array");
		} else {
			System.out.print(" Number not found in this array ");
		}

	}

}
