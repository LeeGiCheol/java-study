package super_constructor;

public class Main {

	public static void main(String[] args) {
		Users users = new Users();
		users.setId("user");
		users.setPassword("12345");
		
		
		Admin admin = new Admin();
		admin.setId("admin");
		admin.setPassword("asdfg");
		
		
		
		Users users2 = new Users("users2", "09876");
		
		Admin admin2 = new Admin("admin2", "poiuy");
		
		
		System.out.println(users.toString());
		System.out.println(admin.toString());
		System.out.println(users2.toString());
		System.out.println(admin2.toString());
		
	}
	
}
