public class Meat extends Item{
    private int weight;

    public Meat(){

    }

    public Meat(int price, int weight) {
        super(price);
        this.weight = weight;
    }

    public int getWeight() {return weight;}
    public void setWeight(int weight) {this.weight = weight;}

    @Override
    public String toString() {
        return "고기를 선택하셨습니다." +
                "(무게= " + weight +
                "kg, "+ super.toString();
    }
}
