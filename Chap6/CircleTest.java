package PracticeProblems.Chap6;

class Circle{
    int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    public void show(){
        System.out.println("반지름이 "+radius+"인 원이다.");
    }
}
class ColoredCircle extends Circle{
    String color;
    public ColoredCircle(int radius, String color){ //부모생성자 호출 기능
        super(radius);
        this.color = color;
    }
    public void show(){
        System.out.println("반지름이 "+radius+"인 "+color+" 원이다.");
    }

}
public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        ColoredCircle coloredCircle = new ColoredCircle(10,"빨간색");
        circle.show();
        coloredCircle.show();


    }
}

