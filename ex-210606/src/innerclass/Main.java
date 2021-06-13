package innerclass;


public class Main {

    public static void main(String[] args) {
        OutterClass outterClass = new OutterClass();
        outterClass.outterClassMethod();

        
        
        OutterClass.InstanceInnerClass instanceInnerClass = outterClass.new InstanceInnerClass();
        System.out.println("instanceInnerClass.i = " + instanceInnerClass.i);
        System.out.println("instanceInnerClass.j = " + instanceInnerClass.j);

        OutterClass.StaticInnerClass staticInnerClass = new OutterClass.StaticInnerClass();
        System.out.println("staticInnerClass.num2 = " + staticInnerClass.num2);
    }

}