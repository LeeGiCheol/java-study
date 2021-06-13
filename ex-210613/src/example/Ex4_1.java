package example;

public class Ex4_1 {

	public static void main(String[] args) {
		int x = 15;
		char ch = '0';
		int year = 300;
		boolean powerOn = false;
		String str = "yes";

		System.out.println(10 < x && x < 20);
		System.out.println(ch != ' ' || ch != '\t');
		System.out.println(ch == 'x' || ch == 'X');
		System.out.println('0' <= ch && ch <= '9');
		System.out.println('A' <= ch && ch <= 'z');
		System.out.println(year % 400 == 0 || year % 4 == 0 && year % 100 != 0);
		System.out.println(!powerOn);
		System.out.println(str.equals("yes"));
	}
	
}
