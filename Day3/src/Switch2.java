import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("국어점수를 입력하세요");
        int kor = sc.nextInt();
        System.out.println("영어점수를 입력하세요");
        int eng = sc.nextInt();
        System.out.println("수학점수를 입력하세요");
        int math = sc.nextInt();


        int sum = kor + eng + math;
        double avg = sum / 3;
        System.out.println("국어점수 : " + kor + "점");
        System.out.println("영어점수 : " + eng + "점");
        System.out.println("수학점수 : " + math + "점");
        System.out.println("총점 : " + sum + "점");
        System.out.println("평균 : " + avg + "점");

        int avg1 = (int)avg / 10;

        switch (avg1){
            case 9 :
                System.out.println("학점은 : A");
                break;
            case 8 :
                System.out.println("학점은 : B");
                break;
            case 7 :
                System.out.println("학점은 : C");
                break;
            case 6 :
                System.out.println("학점은 : D");
                break;
            default :
                System.out.println("학점은 : F");


        }

    }
}
