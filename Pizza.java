package java1;
import java.util.*;

public class Pizza {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);

	System.out.println("press 1 for small");
    System.out.println("press 2 for  medium");
    System.out.println("press 3 for large");
    System.out.println("press 4 for very large\n");
    int n =sc.nextInt();
	int pizza=n;
	switch(pizza) {
	case 1:
		System.out.println("Small size = $125 ");
		break;
	case 2:
		System.out.println("Medium size = $250 ");
	    break;
	case 3:
		System.out.println("large size = $300 ");
		break;
	case 4:
		System.out.println("Very large size = $350 ");
		break;
	default:
		System.out.print("invalid");
	}
}
}
