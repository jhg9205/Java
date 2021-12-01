import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class WorkController {

    private ArrayList<Word> list;

    public ArrayList<Word> getList() {return list;}
    public void setList(ArrayList<Word> list) {this.list = list;}

    public void insert(String eng){
        String kor, date;
        int level;
        Word w;

        Scanner sc = new Scanner(System.in);
        System.out.print("* 뜻을 입력하세요");
        kor = sc.next();
        System.out.print("* 레벨을 입력하세요");
        level = sc.nextInt();
        System.out.print("* 날짜를 입력하세요");
        date = sc.next();
        w = new Word(eng, kor, level, date);
        list.add(w);
    }

    public void list(){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public boolean find(){
        Scanner sc = new Scanner(System.in);
        boolean isFind = false;
        System.out.println("* 찾는 단어를 입력하세요.");
        String find = sc.next();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getEng().equals(find)){
                System.out.println(list.get(i));
                isFind = true;
            }
        }
        return isFind;
    }

    public void save(String file){
        try{
            PrintWriter printWriter = new PrintWriter(new FileOutputStream(file));
            for(Word w : list){
                printWriter.println(w);
            }
            System.out.println("저장되었습니다.");
            printWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void read(String file){
        Scanner sc = null;
        String temp;
        String[] arr;
        Word w;
        try{
            sc = new Scanner(new FileInputStream(file));
            while(sc.hasNextLine()){
                temp = sc.nextLine();
                arr = temp.split(", ");
                w = new Word(arr[0], arr[1], Integer.parseInt(arr[2]), arr[3]);
                list.add(w);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
