public class Operator1 {
            public static void main(String[] args) {
                int var1 = 10, var2 = 3;    //변수의 초기화

                int result = var1 + var2;   // 10 + 3
                System.out.println(result); // 결과는 13

                result = var1 - var2;       // 10 - 3
                System.out.println(result); // 결과는 7

                result = var1 * var2;       // 10 * 3
                System.out.println(result); // 결과는 30

        /*
            정수 / 정수 = 정수
            실수 / 정수 = 실수
            정수 / 실수 = 실수
            실수 / 실수 = 실수
         */
        result = var1 / var2;
        System.out.println(result);

        System.out.println(var1 / var2);    // 3
        System.out.println(var1 / 3.0);     // 3.3333333335

        result = var1 % var2;
        System.out.println(result);
    }
}
