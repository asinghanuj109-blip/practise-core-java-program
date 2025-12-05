package java1;
import java.util.*;

public class Break {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter length");
		int n=sc.nextInt();
		for (int i=1;i<n;i++) {
			System.out.print(i+" ");
			if(i==10)
				break;
			
		}
		System.out.println("this iS AFTER LOOP");
	
				
			
		}
	}


