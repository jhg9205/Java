import java.io.*;
import java.util.*;

public class WorkController {
    private ArrayList<PhoneBook> list;      // 값을 담을 배열 선언

    public ArrayList<PhoneBook> getList() {return list;}
    public void setList(ArrayList<PhoneBook> list) {this.list = list;}


    public void insert(String phone){               // 전화번호 등록 기능
        String name, address, memo, num, date;
        PhoneBook pb;

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("* 이름을 입력하세요");
            name = sc.next();
            System.out.println("* 번호를 입력하세요");
            num = sc.next();
            System.out.println("* 주소를 입력하세요");
            address = sc.next();
            System.out.println("* 메모를 입력하세요");
            memo = sc.next();
            System.out.println("* 날짜를 입력하세요");
            date = sc.next();
            pb = new PhoneBook(name, num, address, memo, date); // PhoneBook 생성자에 방금 입력한 리턴값을 받고
            list.add(pb);                                       // 선언해둔 list 배열에 차례대로 저장
            HashSet<PhoneBook> hashSet = new HashSet<>();
            for(PhoneBook item : list){
                hashSet.add(item);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public void list(){                         // 입력한 전화번호 출력
        try {
            for (int i = 0; i < list.size(); i++) {     // 배열의 출력
                System.out.println(list.get(i));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public boolean find(){                          // 검색기능
        Scanner sc = new Scanner(System.in);
        boolean isFind = false;                     // isFind 변수에 false로 지정해놓고 if문을 빠져나가면 true로 바뀌게 설계
        try {
            System.out.println("* 찾는 번호를 입력하세요.");
            String find = sc.next();                // 찾는 번호를 입력받는다
            for (int i = 0; i < list.size(); i++) { // 저장된 list배열의 길이만큼 반복수행
                if (list.get(i).getNum().equals(find)) {    // 입력반은 번호와 list배열의 번호가 일치하는지 확신
                    System.out.println(list.get(i));        // 일치한다면 출력
                    isFind = true;                          // 출력 후 isFind 변수를 true로 설정
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return isFind;      // ifFind = true 값 리턴
    }


    public void save(String file){          // 파일저장기능
        try{
            PrintWriter printWriter = new PrintWriter(new FileOutputStream(file));  // file파일을 저장할 스트림을 생성 후
            for(PhoneBook p : list){   // list의 값들을 p에 옮긴 후 차례대로 저장        // PrintWriter 클래스 생성
                printWriter.println(p);
            }
            System.out.println("저장되었습니다.");
            printWriter.close();        // 스트림 닫기
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public boolean remove() {           // 삭제기능
        Scanner sc = new Scanner(System.in);
        boolean isFind = false;
        System.out.println("삭제하려는 번호를 입력하세요");
        String find = sc.next();
        try{
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getNum().equals(find)) {
                    System.out.println(list.get(i) + "\n삭제되었습니다.");
                    isFind = true;
                }else System.out.println("삭제하려는 정보가 없습니다.");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return isFind;
    }

    public void revise() {                  // 수정하기
        Scanner sc = new Scanner(System.in);
        String name, num, address, memo, date;
        PhoneBook phoneBook;
        try {
            System.out.println("수정할 연락처를 입력해 주세요");
            String inPut = sc.next();
            boolean pen = false;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getNum().equals(inPut)) {
                    System.out.println("이름을 입력해 주세요");
                    name = sc.next();
                    System.out.println("전화번호를 입력해 주세요");
                    num = sc.next();
                    System.out.println("주소를 입력해주세요");
                    address = sc.next();
                    System.out.println("메모를 입력해주세요");
                    memo = sc.next();
                    System.out.println("날짜를 입력해주세요");
                    date = sc.next();

                    phoneBook = new PhoneBook(name, num, address, memo, date);
                    list.set(i, phoneBook);
                    System.out.println("수정을 완료했습니다");
                    pen = true;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
