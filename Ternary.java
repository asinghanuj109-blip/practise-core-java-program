package java1;

public class Ternary {
	public static void main(String args[]) {
		int a=10;
		int b=100;
		int c=300;
		int d=450;
		int e=690;
		
		String largest = ((a>b) && (a>c) && (a>d) && (a>e) ?  "a is greater" : (b>c) && (b>d) && (b>e) ? "b is greater " : (c>d) && (c>e) ? "c is greater" : (d>e) ? "d is greater"  : " e is greater" );
	System.out.println(largest);
	}

}
