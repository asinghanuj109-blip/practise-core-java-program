package year;
import java.util.Scanner;
public class Smallbiggest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter three numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int smallest, middle, biggest;

            if (a <= b && a <= c) {
                smallest = a;
                if (b <= c) {
                    middle = b;
                    biggest = c;
                } else {
                    middle = c;
                    biggest = b;
                }
            } else if (b <= a && b <= c) {
                smallest = b;
                if (a <= c) {
                    middle = a;
                    biggest = c;
                } else {
                    middle = c;
                    biggest = a;
                }
            } else {
                smallest = c;
                if (a <= b) {
                    middle = a;
                    biggest = b;
                } else {
                    middle = b;
                    biggest = a;
                }
            }

            System.out.println("Smallest = " + smallest);
            System.out.println("Middle   = " + middle);
            System.out.println("Biggest  = " + biggest);

            System.out.print("Do you want to try again? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');
    }
}
