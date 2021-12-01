public class Beverage extends Item{
    private int bundle;

    public Beverage(){

    }

    public Beverage(int price, int bundle) {
        super(price);
        this.bundle = bundle;
    }

    public int getBundle() {return bundle;}
    public void setBundle(int bundle) {this.bundle = bundle;}

    @Override
    public String toString() {
        return "음료를 선택하셨습니다." +
                "(묶음= " + bundle +
                "개, " + super.toString();
    }
}
