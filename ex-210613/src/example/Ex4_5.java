package example;

public class Ex4_5 {

	public static void main(String[] args) {
		System.out.println("=======FOR=======");
		
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("=======WHILE=======");
		
		int i = 0;

		while (i <= 5) {
			int j = 0;
			
			while (j <= i) {
				System.out.print("*");
				j++;
			}
			
			System.out.println();
			i++;
		}
		
	}
	
}
