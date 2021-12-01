public class Operator4 {
    public static void main(String[] args) {
        int var1 = 10, result = 10;

        System.out.println("현재 var1의 값 : " + var1);
        System.out.println("현재 var1의 값 : " + ++var1);
        System.out.println("현재 var1의 값 : " + var1);
        System.out.println("현재 var1의 값 : " + var1++);
        System.out.println("현재 var1의 값 : " + var1);

        result = var1++;
        System.out.println("현재 result의 값 : " + result);
        System.out.println("현재 var1의 값 : " + var1);
    }
}
