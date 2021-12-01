// 부모 클래스
class User{
    // 유저 클래스
}

//자식 클래스
class Banana1 extends User{
    // 반하나 회원 클래스
}

public class Instanceof {
    public static void main(String[] args) {
        User user = new User();
        Banana1 banana = new Banana1();
        User user_banana = new Banana1();
        // Banana banana_user = new User(); (X)

        System.out.println("user instanceof User : " + (user instanceof User));
        System.out.println("banana instanceof banana : " + (banana instanceof Banana1));
        System.out.println("user instanceof Banana : " + (user instanceof Banana1));
        System.out.println("banana instanceof User : " + (banana instanceof User));
        System.out.println("user_banana instanceof User : " + (user_banana instanceof User));
        System.out.println("user_banana instanceof Banana : " + (user_banana instanceof Banana1));

    }
}
