package super_keyword;

public class Child extends Parent {

	int age = 10;
	
	
	public void print() {
		System.out.println("age : " + age);
		System.out.println("this.age : " + this.age);
		System.out.println("super.age : " + super.age);
	}
	
	
}
