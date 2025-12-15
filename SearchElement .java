package year;

public class SearchElement {

	public static void main(String[] args) {
	        int[] arr = {4, 7, 2, 9, 12};
	        int key = 9;

	        boolean found = false;

	        for(int i = 0; i < arr.length; i++) {
	            if(arr[i] == key) {
	                found = true;
	                break;
	            }
	        }

	        if(found)
	            System.out.println(key + " is present in the array.");
	        else
	            System.out.println(key + " is NOT present in the array.");
	    }
	}

