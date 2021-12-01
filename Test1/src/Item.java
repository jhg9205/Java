public class Item {
    private int price;

    public Item(){

    }

    public Item(int price) {
        this.price = price;
    }

    public int getPrice() {return price;}
    public void setPrice(int price) {this.price = price;}

    @Override
    public String toString() {
        return "가격=" + price +
                ')';
    }
}

