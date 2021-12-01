public class Banana extends Fruit{
    int ea;
    public Banana(){

    }

    public Banana(int no, String name, int price, String from, int ea) {
        super(no, name, price, from);
        this.ea = ea;
    }

    public int getEa() {return ea;}
    public void setEa(int ea) {this.ea = ea;}

    @Override
    public String toString() {
        return super.toString() + "Banana{" +
                "개수=" + ea +
                '}';
    }
}
