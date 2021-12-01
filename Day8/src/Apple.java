public class Apple extends Fruit{
    private int dang;

    public Apple(String name, int price, String color, String from, int dang) {
        super(name, price, color, from);
        this.dang = dang;
    }

    public int getDang() {return dang;}
    public void setDang(int dang) {this.dang = dang;}

    @Override
    public String toString() {
        return super.toString() + "{" +
                "당도 = " + dang +
                '}';
    }
}
