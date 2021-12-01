public class StaticClass {
    static class Static{
        int num = 0;
        public void plus(){
            num++;
        }
    }


    public static void main(String[] args) {
        StaticClass.Static cal = new StaticClass.Static();
        cal.plus();
        System.out.println(cal.num);
    }
}
