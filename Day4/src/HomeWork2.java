//과제2.
//        사칙연산의 답을 맞추는 퀴즈게임 만들기
//        (단, 피연산자와 연산자는 모두 랜덤, 나누기는 정수로만 계산, 피연산자의 범위는 1~10이며,
//        10점(10문제를 맞췄을 경우)을 달성할 경우 게임종료
//
//        4 * 2 = ? 8
//        맞췄습니다.(1점)
//        5 + 3 = ? 7
//        틀렸습니다.
//        9 - 2 = ? 7
//        맞췄습니다. (2점)


import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        int score = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("게임을 시작합니다.");
        System.out.println("10문제를 맞추면 통과입니다.");
        System.out.println("--------------------------");
        while (score <= 10) {
            int result;
            int pi1 = (int) (Math.random() * 10) + 1;
            int pi2 = (int) (Math.random() * 10) + 1;
            int or = (int) (Math.random() * 4) + 1;
            String op = "";

            if (or == 1) {
                op = "+";
                result = pi1 + pi2;
            } else if (or == 2) {
                op = "-";
                result = pi1 - pi2;
            } else if (or == 3) {
                op = "*";
                result = pi1 * pi2;
            } else {
                op = "/";
                result = pi1 / pi2;
            }
            System.out.println(pi1 + op + pi2);

            int user = sc.nextInt();
            if (user == result) {
                System.out.println("정답입니다.");
                System.out.println();
                score++;
            } else
                System.out.println("오답입니다.");
            System.out.println();


        }
        System.out.println("클리어!!");


    }
}




