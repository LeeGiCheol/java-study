package example;

import java.util.Arrays;

public class Ex6_17 {

	public static void main(String[] args) {
		int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		
		System.out.println(Arrays.toString(original));
			
		int[] result = shuffle(original);
			
		System.out.println(Arrays.toString(result));
			
	}

	private static int[] shuffle(int[] original) {
		for (int i = 0; i < original.length; i++) {
			int d = (int) (Math.random() * original.length);
			
			int temp = original[i];
			original[i] = original[d];
			original[d] = temp;
		}
		
		
		return original;
	}
	
}
