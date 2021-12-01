//문제.
//        문자열로 숫자를 입력받아 각 자리수를 곱하는 프로그램을 작성해보자.
//        숫자를 입력하세요. 354
//        결과
//        60

import java.util.Scanner;

public class String3 {
    public static void main(String[] args) {
        System.out.println("숫자를 입력하세요.");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int result = 1;

        for (int i = 0; i < input.length(); i++) {
            result *= Integer.parseInt(input.substring(i, i+1));
        }
        System.out.println("결과 : " + result);
    }
}
