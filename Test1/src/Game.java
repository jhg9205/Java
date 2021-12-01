import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cpu = new int[5];
        int[] user = new int[5];
        int score = 0;

        // 랜덤값의 저장 (중복은 안됌)
        for (int i = 0; i < cpu.length; i++) {
            cpu[i] = (int) (Math.random() * 10) + 1;
            for (int j = 0; j < i; j++) {
                if (cpu[i] == cpu[j]) {
                    i--;
                    break;
                }
            }
        }
        System.out.println("게임을 시작합니다!");

        // 게임의 일치, 불일치
        for (int i = 0; i < cpu.length; i++) {
            System.out.print((i + 1) + "번째 숫자를 입력하세요 ");
            user[i] = sc.nextInt();
                if(cpu[i] == user[i]){
                    System.out.println("정답입니다.");
                    score++;
                }else
                    System.out.println("틀렸습니다.");
        }
        System.out.println("-----------------------");

        // 결과값 출력
        switch (score){
            case 0 : case 1 :
                System.out.println(score + "개를 맞췄습니다 미션실패ㅜㅜ");
                break;
            case 2 : case 3 : case 4 : case 5 :
                System.out.println(score + "개를 맞췄습니다 미션성공!!");
        }
    }
}