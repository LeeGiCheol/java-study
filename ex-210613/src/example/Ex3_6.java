package example;

public class Ex3_6 {

	public static void main(String[] args) {
		int fahrenheit = 100;
		float celcius = (int) (5/9f * (fahrenheit - 32) * 100 + 0.5) / 100f;
		
//		System.out.println("Fahrenheit : " + fahrenheit);
//		System.out.println("Celcius : " + celcius);
		
		float temp = 5/9f * (fahrenheit - 32);
		
		System.out.println(temp);
		
		System.out.println(temp * 100);
		System.out.println(temp * 100 + 0.5);
		System.out.println((int) (temp * 100 + 0.5));
		System.out.println((int) (temp * 100 + 0.5) / 100f);
		
	}
	
	
}
