public class Shape implements Drawable, Movable{

    String name = "도형";

    // Drawable(추상메소드) 재정의
    @Override
    public void drawPrint(String msg) {
        System.out.println("Shape drawPrint() 호출 : " + msg);
    }
    @Override
    public void serColor(String color) {System.out.println("Shape setColer() 호출 : " + color);}

    // Movable(추상메소드) 재정의
    @Override
    public void move(int x, int y) {System.out.println("Shape move() 호출 : " + x + " ," + y);}
    @Override
    public void test() {System.out.println("Shape test() 호출");}
}
