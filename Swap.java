package java1;
import java.util.*;
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("enter two numbers:");
	int a = sc.nextInt();
	int b=sc.nextInt();
	System.out.println("before swap a = "+a);
	System.out.println("before swap b = "+b);
	int temp = a;
	a = b;
	b=temp;
	System.out.println("after swap a = "+a);
	System.out.println("after swap b = "+b);
	

	}

}
