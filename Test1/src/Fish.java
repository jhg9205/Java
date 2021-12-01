public class Fish extends Item{
    private String from;

    public Fish(){

    }

    public Fish(int price, String from) {
        super(price);
        this.from = from;
    }

    public String getFrom() {return from;}
    public void setFrom(String from) {this.from = from;}

    @Override
    public String toString() {
        return "생선을 선택하셨습니다." +
                "(원산지= " + from  +
                "산, "+ super.toString();
    }
}
