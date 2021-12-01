public class Oop2 {
    public static void main(String[] args) {
        Member mb = new Member();
        // mb.userid = "apple";     // private으로 필드를 설정하면 접근이 안됌
        // System.out.println(mb.userid(););
        mb.setUserid("apple");
        System.out.println(mb.getUserid());
        mb.setName("김사과");
        System.out.println(mb.getName());

        Member banana = new Member();
        // new연산자가 생성자를 자동 호출함(생성자는 뒤에 Member)
        banana.setUserid("banana");
        System.out.println(banana.getUserid());
        banana.setName("반하나");
        System.out.println(banana.getName());

        Member orange = new Member("orange", "1234", "오렌지", "fdsf", "man");
        orange.info();

        Member cherry = new Member("cherry", "1234556789");
        cherry.info();
    }
}
