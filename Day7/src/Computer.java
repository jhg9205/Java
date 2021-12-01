public class Computer extends Product{

    private String osName;
    private String cpuName;

    //Public은 옵션
    Computer(){

    }
    public Computer(int no, String name, int price, String com, String date, String osName, String cpuName) {
        super(no, name, price, com, date);  // 부모 클래스의 생성자
        this.osName = osName;
        this.cpuName = cpuName;
    }

    public String getOsName() {return osName;}
    public void setOsName(String osName) {this.osName = osName;}

    public String getCpuName() {return cpuName;}
    public void setCpuName(String cpuName) {this.cpuName = cpuName;}

    @Override
    public void etc() {
        System.out.println("computer 클래스의 etc() 호출 ! ");
    }

    @Override
    public String toString() {
        return super.toString() + "{" +
                "os체제='" + osName + '\'' +
                ", 제품명='" + cpuName + '\'' +
                '}';
    }
}
