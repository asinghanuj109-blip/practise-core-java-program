package java1;
import java.util.Scanner;
public class Sod {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number with more than 2 digit");
		int a= sc.nextInt();
		int sum=0;
		while(a!=0) {
			int digit=a%10;
			 sum = sum +digit;
			a=a/10;
			
		}
		System.out.println(sum);
	}

}
