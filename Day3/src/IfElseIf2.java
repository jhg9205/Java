import java.util.Scanner;

public class IfElseIf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("혈액형을 입력하세요");
        String blood = sc.next();   // A , B, O, AB
        System.out.println("RH+, RH-중 선택하세요");
        String rh = sc.next();      // RH+, RH-

        if (blood.equals("A")) {
            if (rh.equals("RH+")) {
                System.out.println("RH+ A형입니다");
            }else{
                System.out.println("RH- A형입니다");
            }
        }

        else if (blood.equals("B")) {
            if (rh.equals("RH+")) {
                System.out.println("RH+ B형입니다");
            }else {
                System.out.println("RH- B형입니다");
            }
        }

        else if (blood.equals("O")) {
            if (rh.equals("RH+")) {
                System.out.println("RH+ O형입니다");
            }else{
                System.out.println("RH- O형입니다");
            }
        }

        else if (blood.equals("AB")) {
            if (rh.equals("RH+")) {
                System.out.println("RH+ AB형입니다");
            }else{
                System.out.println("RH- AB형입니다");
            }
        }
    }
}
