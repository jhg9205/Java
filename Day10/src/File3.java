import java.io.*;

public class File3 {
    public static void main(String[] args) {
        String input = "C:\\DPR_SH\\Day10\\input4.txt";
        String output = "C:\\DPR_SH\\Day10\\output2.txt";

        FileInputStream fis;
        FileOutputStream fos;

        try{
            fis = new FileInputStream(input);
            fos = new FileOutputStream(output);

            int b;
            while((b = fis.read()) != -1){
                fos.write(b);
                System.out.print((char)b + " ");
            }
            fis.close();
            fos.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
