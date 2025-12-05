package com.acharya.classes;
import java.util.*;
public class Arraydivisible {

	public static void main(String srgs[]) {
		Scanner sc=new Scanner (System.in);
		System.out.print("enter range");
		int n=sc.nextInt();
		int temp=0;
		
		int arr[]=new int[n];
		System.out.print("Enter the array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		
		
		for(int i=0;i<n;i++) {
			
			if(arr[i]%3==0) {
				temp ++;
				
			}
			
		}
		
			System.out.print("number is  divisible by 3 : "+temp);
			}
		
	
		}
	

