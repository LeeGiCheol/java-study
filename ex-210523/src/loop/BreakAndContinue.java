package loop;

public class BreakAndContinue {

	public static void main(String[] args) {
		// break
		int number = 0;
		
		while (true) {
			if (number >= 5) {
				break;
			}
			
			System.out.println(number++);
		}
		
		// continue
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				continue;
			}
			
			System.out.println(i);
		}
		
	}
	
}
