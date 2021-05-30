package array;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		int[] arr = new int[10];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 50;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i * 2;
		}
		
		System.out.println();
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println();
		
		for (int i : arr) {
			System.out.println(i);
		}
		
		int[] arr2 = { 1, 3, 5, 10 };
		
		System.out.println(Arrays.toString(arr2));
		
	}
	
}
