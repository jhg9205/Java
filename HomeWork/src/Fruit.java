public class Fruit {
    private int no;
    private String name;
    private int price;
    private String from;

    public Fruit(){

    }

    public Fruit(int no, String name, int price, String from) {
        this.no = no;
        this.name = name;
        this.price = price;
        this.from = from;
    }

    public int getNo() {return no;}
    public void setNo(int no) {this.no = no;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public int getPrice() {return price;}
    public void setPrice(int price) {this.price = price;}

    public String getFrom() {return from;}
    public void setFrom(String from) {this.from = from;}

    @Override
    public String toString() {
        return "과일{" +
                " 구매번호 =" + no +
                ", 과일이름 ='" + name + '\'' +
                ", 가격 =" + price +
                ", 원산지 ='" + from + '\'' +
                '}';
    }
}
