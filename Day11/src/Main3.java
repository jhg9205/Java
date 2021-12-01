import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String eng;
        Word w;
        WorkController workController = new WorkController();
        workController.setList(new ArrayList<Word>());


        String file = "wordbook.txt";
        workController.read(file);

        System.out.println("✔영어 단어장");
        System.out.println("print : 지금까지 등록한 영어단어가 출력됩니다.");
        System.out.println("find : 영어단어를 검색할 수 있습니다.");
        System.out.println("save : 파일에 저장합니다.");
        System.out.println("exit : 프로그램을 종료합니다.");

        while(true){
            System.out.println("영어단어 또는 메뉴를 입력하세요***");
            eng = sc.next();
            if(eng.equals("exit"))break;
            switch (eng){
                case "print" :
                    workController.list();
                    break;
                case "find" :
                    if(!workController.find()){
                        System.out.println("찾는 단어가 없습니다.");
                    }
                    break;
                case "save" :
                    workController.save(file);
                    break;
                default:
                    workController.insert(eng);
            }
        }
    }
}
