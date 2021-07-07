package example;

public class Ex6_21 {

	public static void main(String[] args) {
		int value = 5;
		System.out.println(value + "절대값 : " + abs(value));
		
		value = -10;
		System.out.println(value + "절대값 : " + abs(value));
	}

	private static int abs(int value) {
//		return Math.abs(value);
//		return value < 0 ? value * -1 : value;
		return value < 0 ? -value : value;
	}
}
