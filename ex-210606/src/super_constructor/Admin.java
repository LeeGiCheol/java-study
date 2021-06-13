package super_constructor;

public class Admin extends Users {

	public Admin() {
		super();
	}
	
	public Admin(String id, String password) {
		super(id, password);
	}
	
}
