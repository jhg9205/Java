//1. 변수에 적용
//        모든 객체가 변수를 공용으로 사용

public class Static1 {
    public static void main(String[] args) {
        Button customer1 = new Button();
        customer1.click();
        customer1.click();
        customer1.click();

        Button customer2 = new Button();
        customer2.click();
    }
}
