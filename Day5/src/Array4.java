import java.util.Scanner;
        // 선택정렬
public class Array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 5;
        int[] arr = new int[num];

        // 80 50 70 100 40
        for(int i = 0; i <arr.length; i++){
            System.out.println((i + 1) + "번째 번호를 입력하세요.");
            arr[i] = sc.nextInt();
        }

        int temp = 0;
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }

    }
}
