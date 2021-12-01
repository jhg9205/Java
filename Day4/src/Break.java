import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("음식 자판기");

        while(true){
            System.out.println("원하는 메뉴를 선택하세요");
            System.out.println("1. 콜라 2. 방어회 3, 햄버거 4. 처음처럼 5. 종료");
            int sel = sc.nextInt();
            switch(sel){
                case 1 :
                    System.out.println("콜라가 나왔습니다.");
                    break;
                case 2 :
                    System.out.println("방어회가 나왔습니다");
                    break;
                case 3 :
                    System.out.println("햄버거가 나왔습니다");
                    break;
                case 4 :
                    System.out.println("처음처럼이 나왔습니다");
                    break;
                case 5 :
                    System.out.println("종료");
            }
            if(sel ==5) break;
        }

    }
}
