package year;

public class MultiplesOf5 {
	static void printMultiples(int arr[]) {
        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 5 == 0) {
                count++;
            }
        }

        System.out.println("Output = " + count);
    }
	public static void main(String[] args) {
		 int[] arr = {5, 11, 20, 22, 26, 31};
	        printMultiples(arr);

	}

}
