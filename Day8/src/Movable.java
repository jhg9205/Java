public interface Movable {
    int min = 1;

    public void move(int x, int y);
    public void test();

    public default void printMove(){
        System.out.println("Movable 인터페이스의 printMove() 호출");
    }
}
