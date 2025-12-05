package java1;
import java.util.*;

public class Numbers {
	public static void main(String args[]) {
		Scanner sc= new Scanner (System.in);
		System.out.print("enter n");
		int n=sc.nextInt();
		int[]k=new int[n];
		for (int  a: k) {
			System.out.print(a++);
		}
	}

}
