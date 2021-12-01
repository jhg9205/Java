import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Jdbc5 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1/aiclass?useSSL=false";
        String userid = "root";
        String userpw = "8140";
        Scanner sc = new Scanner(System.in);
        System.out.println("********** 회원탈퇴 **********");
        System.out.println("탈퇴할 아이디를 입력하세요");
        String mem_userid = sc.next();

        StringBuilder sql = new StringBuilder();
        sql.append("delete from tb_member where ")
                .append("mem_userid = '"+mem_userid+"'");
        System.out.println(sql.toString());
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, userid, userpw);     // DBMS 연결
            Statement stmt = conn.createStatement();                                // DBMS에 쿼리를 전달할 준비 완료!
            int result = stmt.executeUpdate(sql.toString());                        // 쿼리문 전달
            if(result >= 1) System.out.println("회원탈퇴 완료!");
            else System.out.println("회원탈퇴 실패!");

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
