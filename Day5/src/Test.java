import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int std = 8;
        int[] arr = new int[std];

        for(int i = 0; i < arr.length; i++){
            System.out.println( (i + 1) + "번째 숫자를 입력하세요");
            arr[i] = sc.nextInt();
        }


    }
}
