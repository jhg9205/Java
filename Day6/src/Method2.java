public class Method2 {

    public static void method1(int num){
        System.out.println("매개변수로 전달된 값 : " + num);
    }

    public static void method2(int num1, int num2){
        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
    }

    public static void method3(int start, int end){
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += i;
        }
        System.out.println(start + "부터" + end + "까지의 합 = " +  sum);
    }


    public static void main(String[] args) {
        method1(30);
        method2(10,30);
        method2(1,2);
        method3(1, 10);
    }


}
