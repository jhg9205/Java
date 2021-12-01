import java.io.FileReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        PhoneBook p;
        WorkController workController = new WorkController();
        workController.setList(new ArrayList<PhoneBook>());
        String file = "PhoneBook.txt";

        while(true){
            System.out.println("메뉴를 입력하세요. 1)등록 2)출력 3)수정 4)삭제 5)검색 6)저장 7)파일불러오기 8)종료");
            name = sc.next();
            if(name.equals("종료"))break;
            switch (name){
                case "등록" :
                    workController.insert(name);
                    break;
                case "출력" :
                    workController.list();
                    break;
                case "수정" :
                    workController.revise();
                    break;
                case "삭제" :
                    workController.remove();
                    break;
                case "검색" :
                    if(!workController.find()){System.out.println("찾는 연락처가 없습니다.");}
                    break;
                case "저장" :
                    workController.save(file);
                    break;
                case "파일불러오기" :
                    try{
                        FileReader fileReader = new FileReader(file);
                        int cur = 0;
                        while((cur = fileReader.read()) != -1){
                            System.out.print((char)cur);
                        }
                        fileReader.close();
                    }catch(Exception e){
                        e.printStackTrace();
                    }
            }
        }
    }
}
