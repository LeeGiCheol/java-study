package variable;

public class Casting {

	public static void main(String[] args) {
		// Type Promotion 자동 형변환
		byte b = 10;
		int i = b;
		
		System.out.println(i);
		
		// Casting 강제 형변환
		int i2 = 10;
		byte b2 = (byte) i2;
		
		System.out.println(b2);
		
		// Casting 주의사항
		int i3 = 128;
		byte b3 = (byte) i3;
		
		System.out.println(b3);
		
	}
	
}
