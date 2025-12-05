package com.acharya.classes;
import java.util.*;

public class MethodDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = scan.nextInt();
		boolean value = MethodDemo.canvote(age);
		if(value)
			System.out.println("you can vote");
		else
			System.out.println("you can't vote");

	}
	public static boolean canvote(int age) {
		if(age >= 18) {
			return true;
		}
		else {
			return false;
		}
	}

}
