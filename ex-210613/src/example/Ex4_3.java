package example;

/*
	i	sum		totalSum
	
	1	 1			1
	2	 3			4
	3	 6			10
	4	 10			20
	5	 15			35
	
	...  55			220
*/

public class Ex4_3 {
	
	public static void main(String[] args) {
		int sum = 0; // (1+2+3)
		int totalSum = 0; // 1 + (1+2) + (1+2+3)
		
		
		for (int i = 1; i <= 10; i++) {
			sum += i;	
			totalSum += sum;
		}
		
		System.out.println("sum : " + sum);
		System.out.println("totalSum : " + totalSum);
		
	}
	
}
