public class While2 {
    public static void main(String[] args) {
        // 1부터 10까지 총 합
        int i = 1;
        int sum = 0;
        while(i <= 10){
            sum += i;
            System.out.println("i값은 : " + i);
            i++;
            System.out.println("sum값은 : " + sum);
        }
        System.out.println("");
        System.out.println(sum);
    }
}
