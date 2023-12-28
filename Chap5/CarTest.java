package PracticeProblems.Chap5;

class Car{
    String color;
    static int numOfCars = 0;
    static int numOfRedCars = 0;

    public Car(String color){
        this.color = color.toLowerCase();
        numOfCars++;

        if (this.color.equals("red")) {
            numOfRedCars++;
        }
    }

    public static int getNumOfCar(){
        return numOfCars;
    }

    public static int getNumOfRedCar(){
        return numOfRedCars;
    }
}

public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car("red");
        Car c2 = new Car("blue");
        Car c3 = new Car("Red");

        System.out.printf("자동차 수 : %d, 빨간색 자동차 수: %d", Car.getNumOfCar(), Car.getNumOfRedCar());
    }
}
