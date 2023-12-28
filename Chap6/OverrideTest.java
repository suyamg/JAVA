package PracticeProblems.Chap6;

class Vehicle{
    String color;
    int speed;
    public Vehicle(String color , int speed ) {
        this.color = color;
        this.speed = speed;

    }
    public void show() {
        System.out.println("색상: "+ color);
        System.out.println("속도: "+ speed);
    }
}

class Car extends Vehicle{
    int displacement;
    int gears;

    public Car (String color , int speed , int displacement, int gears ){
        super(color,speed);
        this.displacement = displacement;
        this.gears = gears;

    }

    public void show() {
        System.out.println("자동차 색상: "+ color);
        System.out.println("자동차 속도: "+ speed);
        System.out.println("자동차 배기량: "+ displacement);
        System.out.println("자동차 기어 단수: "+ gears);
    }
}
public class OverrideTest {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("검정", 150);
        Car c = new Car("파랑",200,1000,5);
        v.show();
        System.out.println();
        // Vehicle v = c;
        c.show();

    }
}
