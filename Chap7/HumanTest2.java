package PracticeProblems.Chap7;

interface HHuman{
    void eat();
    static void echo(){
        System.out.println("야호!!!");
    }

    default void print(){
        System.out.println("인간입니다.");
    }
}

class Student implements HHuman {
    private int age;

    public Student(int age) {
        this.age = age;
    }

    public void print() {
        System.out.println(age + "세의 학생입니다.");
    }

    public void eat() {
        System.out.println("도시락을 먹습니다.");
    }
}
class Worker2 implements HHuman { //Human 구현 클래스
    public void eat(){
        System.out.println("빵을 먹습니다.");
    }
}

public class HumanTest2 {
    public static void main(String[] args) {
        HHuman.echo(); //인터페이스에 있는 메서드를 불러올 때는 public 으로 지정
        Worker2 p = new Worker2();
        p.print();
        p.eat();
        Student s = new Student(20);
        s.print();
        s.eat();

    }
}
