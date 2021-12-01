public class random1 {
    public static void main(String[] args) {
        double random = Math.random();
        System.out.println("랜덤한 수 : " + random);    // 0.25(98876211392793

        // 0.2598876211392793
        // random * 10;  2.5598876211392793
        int num = (int)(random * 10); // 2
        System.out.println(num);

        // 랜덤한 수를 뽑아 1 ~ 45까지 랜덤한 숫자를 추출
        int num1 = (int)(random * 45)+1;
        System.out.println(num1);


    }
}
