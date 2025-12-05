package java1;
import java.util.*;
public class Prime {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the Number: ");
		int n = s.nextInt() ;
		int i;
		boolean isPrime = true;
		if(n <= 1)
		{
		isPrime = false;
		}else {
		for ( i = 2; i * i <= n; i++) {
			
		}
		if(n % i == 0) {
		isPrime = false;
		}
		}

    if(isPrime) {  
System.out.println(n + "is a Prime Number.");
}else {

System.out.println(n +" "+ "is not a Prime Number: ");
}
		}
	
}

    
 
    