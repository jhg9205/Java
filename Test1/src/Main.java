import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Item[] items = new Item[4];                 // 자식클래스들의 정보를 부모클래스 배열에 초기화
        items[0] = new Meat(10000, 3);
        items[1] = new Fish(3000, "제주");
        items[2] = new Rice(50000, 20);
        items[3] = new Beverage(6500, 10);

        int no = 0;
        Item[] cart = new Item[10];                 // 장바구니에 담을 객체 생성

        while (true) {
            System.out.println("메뉴를 선택하세요. (1.고기, 2.생선, 3.쌀, 4.음료, 5.장바구니확인, 6.종료)");
            int num = sc.nextInt();                 // 메뉴의 값 입력

            if (num == 6) {System.out.println("프로그램을 종료합니다");break;}
            switch (num) {
                case 1: case 2: case 3: case 4:
                    System.out.println(items[num - 1]);
                    System.out.println("-----------------------");
                    cart[no] = items[num - 1];   // 메뉴 정보들을 장바구니 배열에 대입
                    no++;                        // 메뉴가 추가되면 다음 장바구니 배열로 추가
                    break;
                case 5:
                    int sum = 0;    // 전역변수로 지정 시 반복을 다시 할 경우 누적 합산이 되어 지역변수로 지정
                    System.out.println("******** 구입목록 ********");

                    for (int i = 0; i < no; i++) {
                        System.out.println(cart[i]);    // 장바구니 배열의 출력
                        sum += cart[i].getPrice();      // 장바구니 객체들의 총 가격
                    }

                    System.out.println("****총 " + sum + "원 입니다.****");
                    break;
            }
        }
    }
}