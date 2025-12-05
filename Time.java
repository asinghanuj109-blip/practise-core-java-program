package com.acharya.classes;
import java.util.*;
public class Time {

	public static 	void  main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the time:");
		int time = scan.nextInt();
		String value = Time.printTime(time);
		if(value.equals("AM")) {
			System.out.println("it's Morning");
		}
		else if(value.equals("PM")) {
			System.out.println("it's Evening");
		}
		else {
			System.out.println("invalid input");
		}

	}
	public static String printTime(int time) {
		if(time <= 1 && time <12) {
			return "AM";
		}
		else if(time >= 12 && time <24 ) {
			return "PM";
		}
		else {
			return "invalid";
		}

	}

}
