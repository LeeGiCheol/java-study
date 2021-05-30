package array;

import java.util.Arrays;

public class ArraysSort {

	public static void main(String[] args) {
		int[] arr = { 100, 3, 40, 2, 69, 167, 3433};
		
		System.out.println("before : " + Arrays.toString(arr));
		
		Arrays.sort(arr);
		
		System.out.println("after : " + Arrays.toString(arr));
	}
	
}
