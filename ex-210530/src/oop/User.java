package oop;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class User {
    public User() {}

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;
    private static Map<String, String> map = new HashMap<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age; 
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void save(String key, User person) {
        map.put(key, person.toString());
    }

    public void printUser() {
        Set<String> key = map.keySet();

        for (String s : key) {
            System.out.println("회원 목록 : " + map.get(s));
        }
    }

    public String toString() {
        return "User{" +
				"신규회원 이름 = " + name +
				", 신규회원 나이 = '" + age + '\'' +
				'}';
    }
    
}