public interface Drawable {

    // 상수 필드(interface에 일반 필드로 변수를 작성하면 jvm이 알아서 변경)
    int max = 100;  // -> (public static final) int max = 100;

    // 추상 메소드(interface에 일반 메소드로 작성하면 jvm이 알아서 변경)
    void drawPrint(String msg);  //  -> (public abstract) void drawPrint(String msg);
    void serColor(String color); // -> (public abstract) void setColor(String color);

    // 인스턴스 메소드(자바 8부터)
    public default void printInfo(){
        System.out.println("Drawable 인터페이스의 printInfo() 호출");
    }

    // static 메소드
    public static void staticMethod(){
        System.out.println("Drawable 인터페이스의 staticMethod() 호출");
    }

}
