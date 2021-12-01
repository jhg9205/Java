public class Operator3 {
    public static void main(String[] args) {
        int var1 = 10, var2 = 3;        // 변수의 초기화

        boolean result = var1 > var2;   // 10 > 3
        System.out.println(result);     // true

        result = var1 < var2;           // 10 < 3
        System.out.println(result);     // false

        result = var1 >= var2;          // 10 >= 3
        System.out.println(result);     // true

        result = var1 <= var2;          // 10 <= 3
        System.out.println(result);     // false

        result = var1 == var2;          // 10 == 3 (10과 3은 같은가?)
        System.out.println(result);     // false

        result = var1 != var2;          // 10 != 3 (10과 3은 다른가?)
        System.out.println(result);     // true
    }
}
