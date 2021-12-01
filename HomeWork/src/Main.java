import java.util.Scanner;

public class Main extends Fruit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fruit[] fruit = new Fruit[3];
        fruit[0] = new Apple(1, "사과", 1000, "제주도", "빨강");
        fruit[1] = new Orange(2, "오렌지", 2000, "청도", 7);
        fruit[2] = new Banana(3, "바나나", 1500, "필리핀", 6);
        Fruit[] order = new Fruit[10];
        int ea = 0;

        while(true){
            System.out.println("메뉴를 고르세요 (1 사과구입, 2 오렌지구입, 3 바나나구입, 4 구입목록, 5 과일검색, 6 종료");
            int sel = sc.nextInt();
            if(sel == 6)break;
                    switch (sel){
                        case 1 :
                        case 2 :
                        case 3 :
                            System.out.println(" 구입한 과일은" + fruit[sel-1]);
                        case 4 :
                            System.out.println("***** 과일목록 *****");
                            System.out.println();
                        case 5 :
                        case 6 :
                            break;
                    }







        }



    }
}
