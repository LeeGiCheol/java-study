package operator;

public class LogicalOperator {

	public static void main(String[] args) {
		int num = 10;
		int num2 = 100;
		
		System.out.println(num > 5 && num2 > 1000);
		
		System.out.println(num > 5 || num2 > 1000);
		
		System.out.println(num > 1000 || num2 > 1000);
	}
	
}
