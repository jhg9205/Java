public class Generic1 {
    public static void main(String[] args) {
        Box2<String> box2 = new Box2();
        box2.setT("안녕하세요");
        System.out.println(box2.getT());

        Box2<Integer> box22 = new Box2<>();
        box22.setT(10);
        System.out.println(box22.getT());

        Apple apple = new Apple("사과", 1000, "빨강", "제주산", 7);
        Box2<Apple> box21 = new Box2<>();
        box21.setT(apple);
        System.out.println(box21.getT());

        Apple apple1 = box21.getT();
        System.out.println(apple1);

    }
}
