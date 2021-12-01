public class For2 {
    public static void main(String[] args) {

        int sum = 0;
        for(int i = 1; i <=100; i++){
            if(i % 2 ==0){
                sum += i;
            }
        }

        int sum1 = 0;
        for(int j = 0; j <= 100; j += 2){
            if(j % 2 == 0){
                sum1 += j;
            }
        }

        System.out.println("i의 합 : " + sum);
        System.out.println("j의 합 : " + sum1);





    }
}
