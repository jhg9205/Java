interface Inter1{
    void method1();
}

class Test1 implements Inter1{
    @Override
    public void method1() {
        System.out.println("Inter1을 구현한 클래스");
    }
}

interface Inter2{
    String method2();
}

class Test2 implements Inter2{
    @Override
    public String method2() {
        return "실명 클래스";
    }
}

class Test3{
    public void method3(Inter2 inter2){
        System.out.println(inter2.method2());
    }
}


public class Anonymous {
    public static void main(String[] args) {
        Test2 test2 = new Test2();
        Test3 test3 = new Test3();

        test3.method3(test2);
        test3.method3(new Test2(){
            @Override
            public String method2() {
                return "익명 객체!";
            }
        });
    }
}
