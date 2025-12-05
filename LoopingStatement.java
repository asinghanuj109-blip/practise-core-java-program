package com.acharya.classes;

import java.util.Scanner;

public class LoopingStatement {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Score of TEAM A : ");
		int battingscore1 = sc.nextInt();
		System.out.println("Enter the Score of TEAM B : ");
		int battingscore2 = sc.nextInt();
		if (battingscore1 > battingscore2) {
			System.out.println("TEAM A WON THE MATCH");
		} else if (battingscore2 > battingscore1) {
			System.out.println("TEAM B WON THE MATCH");
		} else if (battingscore1 == battingscore1) {
			System.out.println("MATCH IS TIED UP");
		} else{
			System.out.println("invalid");
		}
	}
}
