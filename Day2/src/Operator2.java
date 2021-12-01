/*
    성적 프로그램
    국어점수 : 90,
    영어점수 : 80,
    수학점수 : 70
    위 점수를 변수에 저장하고 총점과 평균을 구하는 프로그램을 작성

    결과)
    국어점수 : 90점
    영어점수 : 80점
    수학점수 : 70점
    총점 : 240점
    평균 : 80점
 */
public class Operator2 {
    public static void main(String[] args) {
        int kor = 90;
        int eng = 80;
        int math = 70;
        int sum = kor + eng + math;
        double avg = (double)sum / 3;

        System.out.println("국어점수 : " + kor + "점");
        System.out.println("엉어점수 : " + eng + "점");
        System.out.println("수학점수 : " + math + "점");
        System.out.println("총점 : " + sum + "점");
        System.out.println("평균 : " + avg + "점");

    }
}
