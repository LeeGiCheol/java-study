package oop;

public class Person {

	private int age;
	private String name;
	
	public Person() {}
	
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public Person(int age) {
		this(age, "GICHEOL");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Person getThis() {
        return this;
    }
	

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	
	
	
}
