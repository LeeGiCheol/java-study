package example;

public class Ex4_7 {

	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;
		
		for (int i = 0; i < str.length(); i++) {
			sum += str.charAt(i) - '0';
			// '1' '2' '3' '4' '5'
		}
		
		System.out.println("sum = " + sum);
		
	}
	
}
