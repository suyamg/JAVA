package PracticeProblems.Chap7;
interface Human{
    void eat();
    static void echo(){
        System.out.println("야호!!!");
    }

    default void print(){
        System.out.println("인간입니다.");
        }
}
class Worker implements Human { //Human 구현 클래스
    public void eat(){
        System.out.println("빵을 먹습니다.");
    }
}
public class HumanTest {
    public static void main(String[] args) {
        Human.echo(); //인터페이스에 있는 메서드를 불러올 때는 public 으로 지정
        Worker p = new Worker();
        p.print();
        p.eat();

    }
}


