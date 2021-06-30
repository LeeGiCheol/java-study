package me.gicheol.controller;

import java.util.Scanner;

import me.gicheol.dao.UsersDao;
import me.gicheol.model.Users;

public class Main {

	public static void main(String[] args) {
		signUp();
		signIn();
	}


	private static void signIn() {
		Scanner sc = new Scanner(System.in);
		UsersDao usersDao = new UsersDao();
		
		System.out.println("=================");
		System.out.println("로그인 페이지입니다.");
		System.out.println("=================");

		
		System.out.print("id : ");
		String id = sc.nextLine();
		
		System.out.print("password : ");
		String password = sc.nextLine();
		
		
		Users user = usersDao.signIn(id, password);
		System.out.println(user.getId() + "님 안녕하세요.");
	}

	
	private static void signUp() {
		Scanner sc = new Scanner(System.in);
		Users user = new Users();
		UsersDao usersDao = new UsersDao();
		
		System.out.println("=================");
		System.out.println("회원가입 페이지입니다.");
		System.out.println("=================");

		
		System.out.print("id : ");
		String id = sc.nextLine();
		
		System.out.print("password : ");
		String password = sc.nextLine();
		
		System.out.print("phoneNo : ");
		String phoneNo = sc.nextLine();
		
		user.setId(id);
		user.setPassword(password);
		user.setPhoneNo(phoneNo);
		
		usersDao.signUp(user);
	}

}
