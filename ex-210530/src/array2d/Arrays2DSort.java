package array2d;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays2DSort {

	public static void main(String[] args) {
		int[][] arr = {
	            { 100, 20, 32 },
	            { 40, 54 }
	        };
		
		System.out.println("before : " + Arrays.deepToString(arr));

		Arrays.sort(arr, Comparator.comparingInt(e -> e[0]));
		
		System.out.println("after : " + Arrays.deepToString(arr));
	}
}
