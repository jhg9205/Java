//2. 블록에 적용
//        같은 객체가 여러개 만들어지더라도 단 한번만 실행되는 코드블록을 만듬

public class Static2 {
    public static void main(String[] args) {
        Block block1 = new Block();
        Block block2 = new Block();
        Block block3 = new Block();
        block1.print();
        block2.print();
        block3.print();
    }
}
