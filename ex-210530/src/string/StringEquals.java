package string;

public class StringEquals {

	public static void main(String[] args) {

	    String a = "true가 나올까?";
	    String b = "true가 나올까?";
	    String c = a;
	    
	    System.out.println("a == b ? " + a == b);
	    System.out.println("a == c ? " + a == c);
	    System.out.println("b == c ? " + b == c);

	    System.out.println("a.equals(b) ? " + a.equals(b));
	    System.out.println("a.equals(c) ? " + a.equals(c));
	    System.out.println("b.equals(c) ? " + b.equals(c));
	    
	}
	
}
