package array2d;

import java.util.Arrays;

public class Array2D {

	public static void main(String[] args) {

	    int[][] arr = {
	        { 1, 2, 3 },
	        { 4, 5, 6 }
	    };
	    
	    System.out.println("arr.length = " + arr.length);
	    
	    for (int i = 0; i < arr.length; i++) {
	    	System.out.println("arr[i].length = "+ arr[i].length + "\n");
	    	
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
	    
	    System.out.println();
	    
	    for (int[] i : arr) {
	    	for (int element : i) {
				System.out.println(element);
			}
		}
	    
	    System.out.println();
	    
	    System.out.println(Arrays.deepToString(arr));
	    
	}


}
