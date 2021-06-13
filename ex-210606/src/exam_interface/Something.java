package exam_interface;

public interface Something {

	int a = 0;
	
	public static final int b = 10;
	
	public abstract void c();
	
	default void d() {
		System.out.println("Hello ");
	}
	
	
}
