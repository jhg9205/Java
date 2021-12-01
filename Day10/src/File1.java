import java.io.File;

public class File1 {
    public static void main(String[] args) {
        try {
            File f = new File("C:\\DPR_SH\\Day10\\Input1.txt");
            System.out.println(f.exists());
            System.out.println(f.length());
            System.out.println(!f.isFile());
            System.out.println(f.isDirectory());
            System.out.println(f.isHidden());
            System.out.println(f.getAbsoluteFile());
            File n = new File("C:\\DPR_SH\\Day10\\new\\subDir");
            n.mkdir();

            File file2 = new File(n, "input2.txt");
            file2.createNewFile();

            File file3 = new File("input3.txt");
            file3.renameTo(file2);

            System.out.println(file3.getPath());
            System.out.println(file3.getAbsoluteFile());

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
