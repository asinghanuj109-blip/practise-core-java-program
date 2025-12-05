package java1;
import java.util.*;
public class Even {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter length");
		int a=s.nextInt();
		int k[]=new int[a];
		System.out.println("enter elements");
		for(int i=0;i<a;i++) {
			k[i]=s.nextInt();
		}
		for(int i=0;i<a;i++) {
			System.out.print(k[i]);
		
		if(k[i]%2==0) {
			System.out.println(" = Even number");
			
		}else {
			System.out.println(" = Odd number");
		}
		}
		
	}

}
