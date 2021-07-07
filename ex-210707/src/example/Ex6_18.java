package example;

public class Ex6_18 {

	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		
		
		str = "123o";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
	}

	
	private static boolean isNumber(String str) {
		boolean flag = true;
		
		for (int i = 0; i < str.length(); i++) {
			if (!String.valueOf(str.charAt(i)).matches("^[0-9]$")) {
				flag = false;
				break;
			} 
		}
		
		return flag;
	}
}
