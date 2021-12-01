//3. 메소드에 적용
//        객체를 사용하지 않고 클래스.메소드 이름으로 접근하여 사용

import java.util.Scanner;

public class Static3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("반지름을 입력하세요");
        double r = sc.nextDouble();
        double area = AreaUi.calcCircle(r);
        System.out.println("원의 넓이 : " + area);
    }
}
