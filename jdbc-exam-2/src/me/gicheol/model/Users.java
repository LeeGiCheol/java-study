package me.gicheol.model;

public class Users {

	private String id;
	private String password;
	private String phoneNo;
	

	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	@Override
	public String toString() {
		return "Users [id=" + id + ", password=" + password + ", phoneNo=" + phoneNo + "]";
	}
	
	
}
