package innerclass;

public class OutterClass {

    private int x = 10;
    private static int y = 100;


    class InstanceInnerClass {
        int i = x;
        int j = y;
    }

    static class StaticInnerClass {
        // int num = x; // 사용불가
        int num2 = y;
    }

    void outterClassMethod() {
        int localVariable = 1000;
        final int finalLocalVariable = 10000;
        
        class LocalInnerClass {
            int a = x;
            int b = y;
            int c = localVariable;
            int d = finalLocalVariable;

            void localInnerMethod() {
                System.out.println("outterClassMethod.LocalInnerClass.localInnerMethod.a = " + a);
                System.out.println("outterClassMethod.LocalInnerClass.localInnerMethod.b = " + b);
                System.out.println("outterClassMethod.LocalInnerClass.localInnerMethod.c = " + c);
                System.out.println("outterClassMethod.LocalInnerClass.localInnerMethod.d = " + d);
            }
        }

        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.localInnerMethod();
    }

}