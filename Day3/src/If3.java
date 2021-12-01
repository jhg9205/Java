//문제.
//        국어점수, 영어점수, 수학점수를 입력받아 총 점, 평균, 학점을 구하는 프로그램을 작성해보자.
//        (단, 학점은 평균기준이며 90점 이상 A학점, 80점 이상 B학점, 70점 이상 C학점, 60점 이상 D학점, 나머지는 F학점)
//
//        결과
//        국어점수를 입력하세요. 90
//        영어점수를 입력하세요. 80
//        수학점수를 입력하세요. 70
//
//        국어점수 : 90점
//        영어점수 : 80점
//        수학점수 : 70점
//        총점 : 240점
//        평균 : 80점
//        학점 : B학점

import java.util.Scanner;

public class If3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("국어점수를 입력하세요");
        int kor1 = sc.nextInt();
        System.out.println("영어점수를 입력하세요");
        int eng1 = sc.nextInt();
        System.out.println("수학점수를 입력하세요");
        int math1 = sc.nextInt();

        int sum = kor1 + eng1 + math1;
        double avg = (double)sum / 3;

        System.out.println("국어점수 : " + kor1 + "점");
        System.out.println("영어점수 : " + eng1 + "점");
        System.out.println("수학점수 : " + math1 + "점");
        System.out.println("총점 : " + sum + "점");
        System.out.println("평균 : " + avg + "점");

        if(avg >= 90 && avg <=100) System.out.println("학점 : A학점");
        if(avg >= 80 && avg < 90) System.out.println("학점 : B학점");
        if(avg >= 70 && avg <80) System.out.println("학점 : C학점");
        if(avg >= 60 && avg <70) System.out.println("학점 : D학점");
        if(avg >= 0 && avg < 60) System.out.println("학점 : F학점");


    }
}
