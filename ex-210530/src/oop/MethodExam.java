package oop;

public class MethodExam {

	
	
	public void something(int num, int num2) {
		System.out.println(num + num2);
	}
	
	public int sum(int num, int num2) {
		int result = num + num2;
		
		return result;
	}
	
	
	public static void main(String[] args) {
		MethodExam exam = new MethodExam();
		exam.something(10, 50);
		
		
		int result2 = exam.sum(100, 100);
		System.out.println(result2);
	}
	
}
