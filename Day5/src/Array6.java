import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("배열에 들어갈 숫자를 작성하세요");
        int inPut = sc.nextInt();


        int[] num1 = {inPut, inPut, inPut, inPut, inPut, inPut};
        for(int i = 0; i < num1.length; i++){
            System.out.print(num1[i] + " ");
        }
        System.out.println();
        System.out.println();


        int[][] num2 = {{num1[0],num1[1],num1[2],}, {num1[3],num1[4],num1[5]}};
        for(int i = 0; i < num2.length; i++){
            for(int j = 0; j < num2[i].length; j++){
                System.out.print(num2[i][j] + " ");
            }
            System.out.println();
        }



    }
}
