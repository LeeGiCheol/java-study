package oop;

public class Setting extends Person {

    int x;
    int y = x;

    void method() {
        int i;
        
//        int j = i;  // 컴파일 에러
    }
    
    
    public static void main(String[] args) {
    	Setting set = new Setting();
    	
    	System.out.println(set.getClass().getSuperclass());
    	System.out.println(set.getClass().getSuperclass().getSuperclass());
    	
    }    
}