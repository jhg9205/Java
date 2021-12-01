public class Product {

    private  int no;
    private  String name;
    private  int price;
    private  String com;
    private  String date;

    public Product(){

    }
    public Product(int no, String name, int price, String com, String date) {
        this.no = no;
        this.name = name;
        this.price = price;
        this.com = com;
        this.date = date;
    }

    public int getNo() {return no;}
    public void setNo(int no) {this.no = no;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public int getPrice() {return price;}
    public void setPrice(int price) {this.price = price;}

    public String getCom() {return com;}
    public void setCom(String com) {this.com = com;}

    public String getDate() {return date;}
    public void setDate(String date) {this.date = date;}

    @Override
    public String toString() {
        return "상품{" +
                "상품번호=" + no +
                ", 상품명='" + name + '\'' +
                ", 가격=" + price +
                ", 제조사='" + com + '\'' +
                ", 제조년월일='" + date + '\'' +
                '}';
    }

    public void print(){
        System.out.println("product 클래스의 print() 호출 ! ");
    }

    public void etc(){
        System.out.println("product 클래스의 ect() 호출 ! ");
    }

}
