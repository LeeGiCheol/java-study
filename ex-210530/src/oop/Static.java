package oop;

public class Static {

	static int age = 10;
	static String name = "LEEGICHEOL";
	
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public void test() {
		System.out.println(getNumber());
	}
	
	
}
