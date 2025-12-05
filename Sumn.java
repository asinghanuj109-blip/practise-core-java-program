package java1;
import java.util.*;
public class Sumn {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
    int n=sc.nextInt();
    int sum=0;
    for(int i=0;i<n+1;i++)
    {
    sum =sum + i;
    }
    System.out.println(sum);
	}

}
