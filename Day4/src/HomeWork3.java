//과제3.
//        로또 예측 프로그램을 만들어보자.
//        (1~45 숫자 6개를 추출, 중복된 숫자가 없어야 함)

public class HomeWork3 {
    public static void main(String[] args) {


            for (int i = 1; i <= 6; i++) {
                int rd = (int) (Math.random() * 45) + 1;
                System.out.print(rd + " ");
            }

    }

}




