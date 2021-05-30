package oop;

public class Main {

	public static void main(String[] args) {
		Person person = new Person();
		person.setAge(50);
		person.setName("GICHEOL");
		
		System.out.println(person.hashCode());
		System.out.println(person.getThis());
		System.out.println(person.toString() + "\n");
		
		Person gicheol = new Person(26, "LEEGICHEOL");
		System.out.println(gicheol.hashCode());
		System.out.println(gicheol.getThis());
		System.out.println(gicheol.toString());
		
		
		Person p = new Person(26);
	}
	
}
