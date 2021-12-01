public class Circle implements Drawable{

    double radius = 10.0;
    String backGround;


    @Override
    public void drawPrint(String msg) {
        System.out.println("msg : " + msg);
        System.out.println("면적 : " + (radius*radius*Math.PI));
    }

    @Override
    public void serColor(String color) {
        this.backGround = color;
        System.out.println(color + "색상으로 배경을 설정함함");
    }




}
