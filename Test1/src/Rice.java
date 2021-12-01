public class Rice extends Item{
    private int kg;

    public Rice(){

    }

    public Rice(int price, int kg) {
        super(price);
        this.kg = kg;
    }

    public int getKg() {return kg;}
    public void setKg(int kg) {this.kg = kg;}

    @Override
    public String toString() {
        return "쌀을 선택하셨습니다." +
                "(무게= " + kg +
                "kg, " + super.toString();
    }
}
