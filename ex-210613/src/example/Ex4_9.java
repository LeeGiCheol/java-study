package example;

public class Ex4_9 {

	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		
		while (num > 0) {
			System.out.println("num % 10 : " + num % 10);
			sum += num % 10;
			System.out.println("num / 10 : " + num / 10);
			num /= 10;
		}
		
		System.out.println("sum : " + sum);
	}
	
}
