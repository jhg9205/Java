import javax.swing.*;
import java.util.Vector;

public class Vector1 {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        System.out.println("현재 벡터 데이터의 길이 : " + vector.size());
        System.out.println("벡터의 크기 : " + vector.capacity());
        System.out.println();

        vector.addElement("김사과");
        vector.addElement("오렌지");
        vector.addElement("반하나");
        vector.addElement("배애리");
        vector.addElement("김사과");
        vector.addElement("이메론");
        vector.addElement("반하나");
        vector.addElement("안카도");
        vector.addElement("박체리");

        System.out.println("현재 백터 데이터의 길이 : " + vector.size());
        System.out.println("현재 백터 데이터의 크기 : " + vector.capacity());
        vector.addElement("박체리");
        vector.addElement("박체리");
        System.out.println("현재 백터 데이터의 길이 : " + vector.size());
        System.out.println("현재 백터 데이터의 크기 : " + vector.capacity());
        System.out.println();
        System.out.println("백터의 두번째 요소 : " + vector.elementAt(1));
        System.out.println();
        vector.remove(3);
        System.out.println("현재 백터 데이터의 길이 : " + vector.size());
        System.out.println("현재 백터 데이터의 크기 : " + vector.capacity());
        vector.remove(3);
        System.out.println("현재 백터 데이터의 길이 : " + vector.size());
        System.out.println("현재 백터 데이터의 크기 : " + vector.capacity());
        System.out.println();
        // 이미 늘어난 크기는 다시 줄어들지 않는다
        for (int i = 0; i < vector.size(); i++) {
            System.out.print(vector.get(i) + " ");
        }
        System.out.println();
        vector.removeAllElements();
        System.out.println("현재 백터 데이터의 길이 : " + vector.size());
        System.out.println("현재 백터 데이터의 크기 : " + vector.capacity());



    }
}
