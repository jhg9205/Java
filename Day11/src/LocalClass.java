public class LocalClass {
    private int num1 = 10;
    private void method1(){
        int num2 = 20;

        class Local{
            private int num3 = 30;
            public static final int num4 = 40;
            public void method2(){
                System.out.println("num1 : " + num1);
                System.out.println("num2 : " + num2);
                System.out.println("num3 : " + num3);
            }
        }

        Local local = new Local();
        local.method2();

    }

    public static void main(String[] args) {
        LocalClass localClass = new LocalClass();
        localClass.method1();
    }
}
