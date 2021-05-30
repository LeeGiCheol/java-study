package oop;

public class StaticRunner {

	public static void main(String[] args) {
		StaticRunner runner = new StaticRunner();
		runner.test();
	}		
	
	public int test() {
		staticTest();
		return 1;
	}

	public static void staticTest() {
		
	}
}	
