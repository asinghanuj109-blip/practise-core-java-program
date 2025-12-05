package java1;
import java.util.*;
public class Scannerarray {
public static void main(String args[]) {
	Scanner sc= new Scanner(System.in);
	System.out.print("enter m : ");
	int m=sc.nextInt();
	System.out.print("enter n : ");
	int n=sc.nextInt();
	
	int k[][]=new int[m][n];
	System.out.print("enter elements :");
	for(int i=0;i<m;i++) {
		for(int j=0;j<n;j++) {
			k[i][j]=sc.nextInt();
		}
	}
	System.out.print("elements are : ");
	for(int i=0;i<m;i++) {
		for(int j=0;j<n;j++) {
			System.out.print(k[i][j]+" ");
		}
	}
	
}
}
