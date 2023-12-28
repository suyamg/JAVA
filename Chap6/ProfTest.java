package PracticeProblems.Chap6;
class Person{
    String phone;
    public  String getPhone(){
        System.out.print("Person: ");
        return phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

}
class Professor extends Person{
    public void setPhone(String phone){
        this.phone = phone + "(Professor)";
    }

    }
public class ProfTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.setPhone("010-1111-2222");
        System.out.println(p.getPhone());

        Professor a = new Professor();
        a.setPhone("010-1234-5678");
        System.out.println(a.getPhone());

    }
}

