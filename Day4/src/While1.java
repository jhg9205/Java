public class While1 {
    public static void main(String[] args) {
        int i = 1;

        // 무한루프
//        while(i <= 5){
//            System.out.println("안녕하세요. java");
//        }

        while(i <= 5){  // 조건식
            System.out.println( i + "번째" + "안녕하세요. java!"); // 조건식이 참이면 실행할 명령문
            i++;        // 조기식에 증감연산자를 하여 무한루프를 피한다.
        }







    }
}
