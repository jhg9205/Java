public class Person {
    private String name;
    private int age;
    private double height;
    private boolean isLover;

    public Person(){
        this.name = "무명";
        this.age = 0;
        this.height = 0.0;
        this.isLover = true;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}

    public double getHeight() {return height;}
    public void setHeight(double height) {this.height = height;}

    public boolean isLover() {return isLover;}
    public void setLover(boolean lover) {isLover = lover;}

    public void info(){
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("키 : " + height);
        System.out.println("애인여부 : " + isLover);
    }

}
