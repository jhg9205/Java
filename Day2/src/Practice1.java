public class Practice1 {
    public static void main(String[] args) {

        // 점수의 평균 내기
        int[] var1 = {100, 60, 80};
        int sum = 0;
        for(int i = 0; i < var1.length; i++){
            sum += var1[i];
        }
        double avg = sum / var1.length;

        System.out.println("점수의 총 합 : " + sum);
        System.out.println("점수의 평균 = " + avg);

        // 학생들의 학점

        int[] std1 = {70, 40, 90};
        int[] std2 = {40, 100, 90};
        int[] std3 = {20, 10, 10};

        int sum1 = 0, sum2 = 0, sum3 =0;

        for(int i = 0; i < std1.length; i++){
            sum1 += std1[i];
        }
        int avg1 = sum1/ std1.length;
        System.out.println("std1의 평균 : " + avg1);

        for(int i = 0; i < std2.length; i++){
            sum2 += std2[i];
        }
        int avg2 = sum2/ std2.length;
        System.out.println("std2의 평균 : " + avg2);

        for(int i = 0; i < std3.length; i++){
            sum3 += std3[i];
        }
        int avg3 = sum3/ std3.length;
        System.out.println("std3의 평균 : " + avg3);

        if(avg1 > 80){
            System.out.println("std1의 학점은 A 입니다");
        }else if(avg1 > 60){
            System.out.println("std1의 학점은 B 입니다");
        }else if(avg1 > 40){
            System.out.println("std1의 학점은 C 입니다");
        }else {
            System.out.println("std1은 과락입니다.");
        }

        if(avg2 > 80){
            System.out.println("std2의 학점은 A 입니다");
        }else if(avg2 > 60){
            System.out.println("std2의 학점은 B 입니다");
        }else if(avg2 > 40){
            System.out.println("std2의 학점은 C 입니다");
        }else {
            System.out.println("std2은 과락입니다.");
        }

        if(avg3 > 80){
            System.out.println("std3의 학점은 A 입니다");
        }else if(avg3 > 60){
            System.out.println("std3의 학점은 B 입니다");
        }else if(avg3 > 40){
            System.out.println("std3의 학점은 C 입니다");
        }else{
            System.out.println("std3은 과락입니다.");
        }

    }
}
