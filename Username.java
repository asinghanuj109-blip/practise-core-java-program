package java1;
import java.util.*;
public class Username {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int i=0;
		int pwd=0;
		do {
			
			if(pwd==0)
				System.out.print("enter your password : ");
			else 
				System.out.print("Incorrect password Try again : ");
			pwd = sc.nextInt();
			if(pwd==1234)
				System.out.print("Correct password");
				
				
			i++;
			if(i==4)
				break;
		}while(pwd!=1234);
		System.out.println("Try Again later");
		
	}
}
