public class Lambda1 {
    public static void main(String[] args) {
        Calc mimNum = (x,y) -> x < y ? x : y;

        System.out.println(mimNum.min(2,4));
    }
}
