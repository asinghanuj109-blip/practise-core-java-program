package year;

public class MultiplesOF3 {
	static void printMultiples(int arr[]) {
        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 3 == 0) {
                count++;
            }
        }

        System.out.println("Output = " + count);
    }
	public static void main(String[] args) {
		
	        int[] arr = {3, 8, 12, 14, 17};
	        printMultiples(arr);
	    }
	}
