import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {

        while (true) {
            Scanner sc = new Scanner(System.in);
            double game = Math.random();
            int cpu = (int) (game * 10) + 1;
            System.out.println("가위, 바위, 보 중 하나를 선택하세요.");
            String user = sc.next();

            if (cpu <= 3) {
                if (user.equals("가위")) {
                    System.out.println("컴퓨터 : 가위" + '\n' + "유저 : 가위" + '\n' + "비겼습니다");
                } else if (user.equals("바위")) {
                    System.out.println("컴퓨터 : 가위" + '\n' + "유저 : 바위" + '\n' + "이겼습니다");
                    break;
                } else if (user.equals("보")) {
                    System.out.println("컴퓨터 : 가위" + '\n' + "유저 : 보" + '\n' + "졌습니다");
                }
            } else if (cpu <= 6) {
                if (user.equals("가위")) {
                    System.out.println("컴퓨터 : 바위" + '\n' + "유저 : 가위" + '\n' + "졌습니다");
                } else if (user.equals("바위")) {
                    System.out.println("컴퓨터 : 바위" + '\n' + "유저 : 바위" + '\n' + "비겼습니다");
                } else if (user.equals("보")) {
                    System.out.println("컴퓨터 : 바위" + '\n' + "유저 : 보" + '\n' + "이겼습니다");
                    break;
                }
            } else if (cpu > 6) {
                if (user.equals("가위")) {
                    System.out.println("컴퓨터 : 보" + '\n' + "유저 : 가위" + '\n' + "이겼습니다");
                    break;
                } else if (user.equals("바위")) {
                    System.out.println("컴퓨터 : 보" + '\n' + "유저 : 바위" + '\n' + "졌습니다");
                } else if (user.equals("보"))
                    System.out.println("컴퓨터 : 보" + '\n' + "유저 : 보" + '\n' + "비겼습니다");
            }
        }
        System.out.println("프로그램 종료");
    }


}
