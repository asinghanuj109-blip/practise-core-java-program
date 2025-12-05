package java1;
import java.util.*;

public class Discount {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your bill");
		int a=sc.nextInt();
		
		if(a>=1000 && a<2000) {
			double b=a* 0.08;
			double c=a-b;
			System.out.println("Discounted price is ="+c);
		}
		
		else if(a>=2000) {
			double d=a * 0.15;
			double e=a-d;
			System.out.println("Discounted price is ="+e);
		 
		}else {
			System.out.println("initial price = "+a);
		}
		
	}

}
