package com.acharya.classes;

import java.util.Scanner;

public class SumOfNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st Number");
		int num1 = sc.nextInt();
		System.out.println("Enter the 2nd Number");
		int num2 = sc.nextInt();
		System.out.println("Enter the 3rd Number");
		int num3 = sc.nextInt();
		System.out.println("Enter the 4th Number");
		int num4 = sc.nextInt();

		int sum1 = num1 + num2;
		int sum2 = sum1 + num3;
		int sum3 = sum2 + num4;
		System.out.println("Sum of the 1st and 2nd number : " + sum1);
		System.out.println("Sum of the 3rd and sum1 : " + sum2);
		System.out.println("Sum of the 4th and sum2 : " + sum3);
	}

}