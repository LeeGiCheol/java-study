package conditional;

public class IfConditional {

	public static void main(String[] args) {
	    int score = 70;

	    if (score > 60) {
	    	if (score > 65) {
	    		System.out.println("A+");
	    	}

	    	System.out.println("합격입니다.");
	    } else if (score > 40) {
	    	System.out.println("노력하세요.");
		} else {
	    	System.out.println("불합격입니다.");
	    }
	}
}
