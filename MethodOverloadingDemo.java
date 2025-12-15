package year;

public class MethodOverloadingDemo {
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
		MethodOverloadingDemo obj = new MethodOverloadingDemo();

        
        obj.display(25);
        obj.display('A');
        obj.display("Hello Java");

	}

}
