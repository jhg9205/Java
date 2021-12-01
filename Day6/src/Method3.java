public class Method3 {

    public static int method1(int num){
        return num;
    }

    public static int method2(){
        int num = (int)(Math.random()*45)+1;
        return num;
    }

    public static int[] getScore(){
        int[] num = {90, 80, 70, 60, 50};
        return num;
    }


    public static void main(String[] args) {

        System.out.println(method1(10));
        int result = method1(5);
        System.out.println(result);

        int random = method2();
        System.out.println("랜덤한 수 : " + method2());

        int[] Score = getScore();
        for(int j : Score){
            System.out.print(j + " ");
        }


    }
}
