package me.gicheol.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import me.gicheol.model.Users;

public class UsersDao {
	
	private PreparedStatement pstmt = null;
	private Connection c = null;
	private ResultSet rs = null;
	
	public void signUp(Users user) {
		try {
		
			c = getConnection();
			
			String sql = "INSERT INTO USERS "
					   + "VALUES(?, ?, ?)";
			
			pstmt = c.prepareStatement(sql);
			pstmt.setString(1, user.getId());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getPhoneNo());
			
			pstmt.executeUpdate();
			
			System.out.println("회원가입이 완료되었습니다.");
		
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			finallyClose();
		}
	}

	
	public Users signIn(String id, String password) {
		Users user = new Users();
		// try - with - resource
		try (Connection c = getConnection()) {
			String sql = "SELECT * FROM users "
					   + "WHERE id = ? "
					   + "AND password = ?";
			
			pstmt = c.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			
			rs = pstmt.executeQuery();
			rs.next();
			
			user.setId(rs.getString("id"));
			user.setPassword(rs.getString("password"));
			user.setPhoneNo(rs.getString("phoneNo"));
			
			System.out.println("로그인 성공");
			
		} catch (Exception e) {
			System.out.println("로그인 실패");
			e.printStackTrace();
		}
		
		return user;
	}
	
	

	private Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/jdbc_exam?serverTimezone=Asia/Seoul",
				"root",
				"root");
	}
	

	private void finallyClose() {
		try {
			c.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	

}
