package year;
import java.util.Scanner;

public class MethodOverloadingDemo1 {
	
    void display(int num) {
        System.out.println("Integer value: " + num);
    }

   
    void display(char ch) {
        System.out.println("Character value: " + ch);
    }

    
    void display(String str) {
        System.out.println("String value: " + str);
    }
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MethodOverloadingDemo obj = new MethodOverloadingDemo();

        
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        obj.display(num);

        
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        obj.display(ch);

        
        sc.nextLine(); 
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        obj.display(str);

        sc.close();

	}

}
