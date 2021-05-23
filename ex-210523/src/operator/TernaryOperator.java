package operator;

public class TernaryOperator {

	public static void main(String[] args) {
		int num = 10;
        int num2 = 100;
        int num3 = 1000;

        System.out.println(num > num2 ? (num > num3 ? num : num3) : (num2 > num3 ? num2 : num3));
	}
	
}
