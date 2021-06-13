package example;

import java.util.Random;

public class Ex4_8 {

	public static void main(String[] args) {
		
		int value = (int) (Math.random() * 6) + 1;
		System.out.println("value : " + value);
	
		
		Random random = new Random();
		int j = random.nextInt(6) + 1;
		System.out.println(j);
	}
	
}
