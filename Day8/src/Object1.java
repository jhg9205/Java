public class Object1 {
    public static void main(String[] args) {
        Box box = new Box();
        box.setObj("안녕하세요");    // String
        System.out.println(box.getObj());

        box.setObj(10);             // ing
        System.out.println(box.getObj());

        Apple apple = new Apple("사과", 1000, "빨강", "제주산", 7);
        box.setObj(apple);
        System.out.println(box.getObj());

        Apple apple1 = (Apple) box.getObj();    // Object 객체의 강제 형변환
        System.out.println(apple1);


    }
}
