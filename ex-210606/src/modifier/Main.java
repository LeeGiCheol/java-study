package modifier;


public class Main {

    public static void main(String[] args) {
    	Me me = new Me();
//        me.age = 26;                        // 사용불가
    	me.name = "LEEGICHEOL";             // 사용가능
    	
    	System.out.println(me.getName());   // 사용가능
    	System.out.println(me.hello());     // 사용가능
    	//System.out.println(me.greeting());  // 사용불가
    }
    
}