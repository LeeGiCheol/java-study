package me.gicheol.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import me.gicheol.model.Users;

public class UsersDao {
	
	public int createUser(Users user) throws ClassNotFoundException, SQLException {
		Connection conn = getConnection();
		
		String sql = "INSERT INTO USERS "
				   + "(id, password, phoneNo) "
				   + "VALUES(?, ?, ?)";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, user.getId());
		pstmt.setString(2, user.getPassword());
		pstmt.setString(3, user.getPhoneNo());
		
		return pstmt.executeUpdate();
	}


	
	public Users login(Users user) throws Exception {
		Connection conn = getConnection();
		
		String sql = "SELECT * FROM users "
				   + "WHERE id = ?";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, user.getId());
		
		ResultSet rs = pstmt.executeQuery();
		rs.next();
		
		if (user.getId().equals(rs.getString("id"))) {
			if (user.getPassword().equals(rs.getString("password"))) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패");
			}
		} else {
			System.out.println("로그인 실패");
			throw new Exception();
		}
		
		
		user.setPhoneNo(rs.getString("phoneNo"));
		
		
		
		return user;
	}
	
	

	private Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		
		return DriverManager.getConnection(
				"jdbc:mysql://localhost/jdbc_exam?serverTimezone=Asia/Seoul",
				"root", "root");
	}
	
	

}
