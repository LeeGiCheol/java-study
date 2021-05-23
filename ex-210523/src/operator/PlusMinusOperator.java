package operator;

public class PlusMinusOperator {

	public static void main(String[] args) {
		int i = 5, j = 0;
	    j = i++;
	    /*
		    j = i;
		    i++;
	    */
	    
	    int k = 5, n = 0;
	    n = ++k;	
	    
	    /*
	     	++k;
	     	n = k;
	     */
	    
	    System.out.println(j);
	    System.out.println(n);
	}
	
}
