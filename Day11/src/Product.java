public class Product {
    private String pname;
    private int price;
    private String com;

    public Product(String pname, int price, String com) {
        this.pname = pname;
        this.price = price;
        this.com = com;
    }

    public String getPname() {return pname;}
    public void setPname(String pname) {this.pname = pname;}

    public int getPrice() {return price;}
    public void setPrice(int price) {this.price = price;}

    public String getCom() {return com;}
    public void setCom(String com) {this.com = com;}

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(pname).append(", ").append(price).append(", ").append(com);
        return sb.toString();
    }
}
