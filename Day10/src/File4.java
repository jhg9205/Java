import java.io.FileReader;
public class File4 {
    public static void main(String[] args) {
        char[] arr = new char[60];

        try{
            FileReader fr = new FileReader("input1.txt");
            System.out.print((char) fr.read());    // char의 배열 형태로 데이터를 읽어옴
            fr.read(arr);
            for (char c : arr){
                System.out.print(c);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
