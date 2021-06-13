package example;

public class Ex4_4 {

	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
		int sign = 1;
		
		
		for (int i = 1; ; i++, sign=-sign) {
			num = sign * i;
			sum += num;

			if (sum >= 100) {
				break;
			}
		}
		
		System.out.println(num);
	}
	
}
