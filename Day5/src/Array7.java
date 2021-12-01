import javax.swing.*;

public class Array7 {
    public static void main(String[] args) {
        String[] str = {"김사과", "반하나", "오렌지", "이메론"};
        for(int i = 0; i <str.length; i++){
            System.out.println(str[i]);
        }
        System.out.println();

        for(String s : str){
            System.out.println(s);
        }

            


    }
}
