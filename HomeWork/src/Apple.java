public class Apple extends Fruit{

    String color;

    public Apple(){

    }

    public Apple(int no, String name, int price, String from, String color) {
        super(no, name, price, from);
        this.color = color;
    }

    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}

    @Override
    public String toString() {
        return super.toString() + "Apple{" +
                "색상='" + color + '\'' +
                '}';
    }
}
