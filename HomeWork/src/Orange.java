public class Orange extends Fruit{

    int dang;

    public Orange(){

    }

    public Orange(int no, String name, int price, String from, int dang) {
        super(no, name, price, from);
        this.dang = dang;
    }

    public int getDang() {return dang;}
    public void setDang(int dang) {this.dang = dang;}

    @Override
    public String toString() {
        return super.toString() + "Orange{" +
                "당도=" + dang +
                '}';
    }
}
