package java1;
import java.util.*;

public class Arrayu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("enter array length");
	int n=sc.nextInt();
	int[] k=new int[n];
	System.out.print("enter elements of array");
	for(int i=0;i<n;i++) {
		k[i]=sc.nextInt();
		
	}
	System.out.println("elements are =");
	for(int i=0;i<n;i++) {
		System.out.println(k[i]);
	}
	System.out.println();

	}

}
