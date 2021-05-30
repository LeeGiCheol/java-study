package oop;

public class CBVCBR {
	
    public static void main(String[] args) {
        Data data = new Data();
        data.x = 10;
        System.out.println("before x : " + data.x);

        change(data.x);
        System.out.println("after x : " + data.x);

        realChange(data);
        System.out.println("after data.x : " + data.x);
    }

    public static void change(int x) {
        x = 1000;
        System.out.println("change x : " + x);
    }

    public static void realChange(Data data) {
        data.x = 1000;
        System.out.println("change data.x : " + data.x);
    }
    
}

