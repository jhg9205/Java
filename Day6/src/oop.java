public class oop {

    public static void main(String[] args) {
        User user = new User();
        user.id = "jhg9205";
        user.name = "정승훈";
        user.pw = "1234";
        user.age = 20;
        user.point = 100;

        user.info();
        System.out.println();

        User member = new User();
        member.id = "jsh9512205";
        member.name = "정하영";
        member.pw = "123456789";
        member.age = 200;
        member.point = 50;
        member.info();

        // 클래스를 만들고 메인클래스에서 서로 다른 객체를 생성하면 메모리도 다른 메로리로 생성된다.
        // 클래스는 파일일 뿐이고 메모리에 올릴 경우 객체가 된다.


    }

}
