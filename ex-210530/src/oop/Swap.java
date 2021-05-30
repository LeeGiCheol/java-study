package oop;

import java.util.Arrays;

public class Swap {

	public static void main(String[] args) {
		int i = 0;
		int j = 10;
		
		int arr[] = { 0, 10 };
		
		System.out.println(Arrays.toString(arr));
		swap(arr);
		
		System.out.println(Arrays.toString(arr));
		
	}
	

	public static void swap(int[] arr) {
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
		
	}
	
	public static void swap(int i, int j) {
		int temp = i;
		i = j;
		j = temp;
		
		System.out.println(i);
		System.out.println(j);
	}
}
