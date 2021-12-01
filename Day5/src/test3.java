public class test3 {
    public static void main(String[] args) {
        int[] numArr = new int[6];

        int temp = 0;

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = (int) (Math.random() * 45) + 1;

            for (int j = 0; j < i; j++) {
                if (numArr[i] == numArr[j]) {
                    i--;
                }
            }

            for (int j = 0; j < numArr.length; j++) {
                if (numArr[i] < numArr[j]) {
                    temp = numArr[i];
                    numArr[i] = numArr[j];
                    numArr[j] = temp;
                }
            }
        }
        System.out.print("로또 번호 : ");
        for (int i = 0; i < 6; i++) {
            System.out.print(numArr[i] + "번 ");
        }

    }
}