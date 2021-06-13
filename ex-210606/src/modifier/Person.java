package modifier;

public class Person {

	private int age;
	protected String name;
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return greeting(name);
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	private String greeting(String name) {
		return name + "님 안녕하세요!";
	}
}