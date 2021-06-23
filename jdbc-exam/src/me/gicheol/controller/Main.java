package me.gicheol.controller;

import java.sql.SQLException;
import java.util.Scanner;

import me.gicheol.dao.UsersDao;
import me.gicheol.model.Users;

public class Main {

	public static void main(String[] args) throws Exception {
		UsersDao usersDao = new UsersDao();
		
		Users user = new Users();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ID : ");
		user.setId(sc.nextLine());
		
		System.out.print("PW : ");
		user.setPassword(sc.nextLine());
		
		usersDao.createUser(user);
		
		System.out.println(user);
		
		
		
		
		
		Users loginUser = new Users();
		
		System.out.println("·Î±×ÀÎ");
		
		System.out.print("ID : ");
		loginUser.setId(sc.nextLine());
		
		System.out.print("PW : ");
		loginUser.setPassword(sc.nextLine());
		
		usersDao.login(loginUser);
		
	}
	
}
