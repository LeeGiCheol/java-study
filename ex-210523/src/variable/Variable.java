package variable;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Variable {

	public static void main(String[] args) {
		boolean b = false;
		
		char c = '안';
		
		int i = Integer.MAX_VALUE;
		long l = Long.MAX_VALUE;
		
		double d = 0.14d;
		float f = 0.14f;

		BigInteger bigInteger = new BigInteger("1239845721398572189345792183589123489");
		BigDecimal bigDecimal = new BigDecimal("123123.123123123");
		
		System.out.println(b);
		System.out.println(c);
		System.out.println(i);
		System.out.println(l);
		System.out.println(d);
		System.out.println(f);
		
		System.out.println(bigInteger);
		System.out.println(bigDecimal);

		
		final int number = 100;
		
	}
	
}
