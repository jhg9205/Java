public class PhoneBook {
    private String name;
    private String num;
    private String address;
    private String memo;
    private String date;


    public PhoneBook(String name, String num, String address, String memo, String date) {
        this.name = name;
        this.num = num;
        this.address = address;
        this.memo = memo;
        this.date = date;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getNum() {return num;}
    public void setNum(String num) {this.num = num;}

    public String getAddress() {return address;}
    public void setAddress(String address) {this.address = address;}

    public String getMemo() {return memo;}
    public void setMemo(String memo) {this.memo = memo;}

    public String getDate() {return date;}
    public void setDate(String date) {this.date = date;}

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(",").append(num).append(",").append(address).append(",").append(memo)
                .append(",").append(date);
        return sb.toString();

    }
}
