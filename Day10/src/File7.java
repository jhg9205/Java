import java.io.*;

public class File7 {
    public static void main(String[] args) {
        String file1 = "output3.txt";
        String[] arr = {"김사과", "반하나", "오렌지", "이메론"};

        try{
            PrintWriter pw = new PrintWriter(new FileOutputStream(file1));
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
                pw.print(arr[i] + " ");
            }
            pw.close();


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
