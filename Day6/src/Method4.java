import java.util.Scanner;

public class Method4 {

    public static int method1(int num1, int num2){
        return num1 + num2;
    }
    public static int method2(int num1, int num2){
        return num1 - num2;
    }
    public static int method3(int num1, int num2){
        return num1 * num2;
    }
    public static int method4(int num1, int num2){
        return (int)num1 / num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력하세요 : ");
        int num1 = sc.nextInt();
        System.out.print("두번째 숫자를 입력하세요 : ");
        int num2 = sc.nextInt();

        int result1 = method1(num1, num2);
        int result2 = method2(num1, num2);
        int result3 = method3(num1, num2);
        int result4 = method4(num1, num2);

        System.out.println(num1 +" + " + num2 + " = " + result1);
        System.out.println(num1 +" - " + num2 + " = " + result2);
        System.out.println(num1 +" * " + num2 + " = " + result3);
        System.out.println(num1 +" / " + num2 + " = " + result4);

    }
}
