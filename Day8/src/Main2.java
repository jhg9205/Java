public class Main2 {
    public static void main(String[] args) {
        // Drawable drawable = new Drawable();
        Circle circle = new Circle();
        circle.drawPrint("원의 넓이를 구함");
        circle.serColor("파랑");

        DigitalPic digitalPic = new DigitalPic();
        digitalPic.move(10,5);
        digitalPic.test();

        Shape shape = new Shape();
        shape.move(5,7);
        shape.test();
        shape.drawPrint("도형을 그리고 있음");
        shape.serColor("핑크");

        Drawable drawable = new Shape();
        drawable.drawPrint("그립을 그립니다");
        drawable.serColor("골드");
//        drawable.test();
//        drawable.move();

        Movable movable = new Shape();
        movable.move(5,7);
        movable.test();
//        movable.drawPrint();
//        movable.setColor();

        // static으로 처리된 필드와 메소드     static으로 처리되어 메모리가 이미 저장되어 있기 때문에 오버라이딩 노필요
        System.out.println("MAX : " + Drawable.max);
        Drawable.staticMethod();
        System.out.println(Movable.min);

    }
}
