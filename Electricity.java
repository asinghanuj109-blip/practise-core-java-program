package java1;
import java.util.*;
public class Electricity {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("input unit");
		int u= sc.nextInt();
		if (u<30) {
			double c=u*3.50;
			System.out.println("Cost is = "+c);
		}
		if(u>=30 && u<50) {
			double d=u*4.25;
			System.out.println("Cost is = "+d);
		}
		if(u>=50 && u<100) {
			double e=u*5.25;
			System.out.println("Cost is = "+e);
		}
		if(u>=100) { 
			double f=u*5.85;
			System.out.println("Cost is = "+f);
		}
		
}
	
	}