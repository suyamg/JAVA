package PracticeProblems.Chap6;

class Bank {
    public double getInt_rate() {
        return 3.0;
    }
}

class BadBank extends Bank {
    public double getInt_rate() {
        return 10.0;
    }
}

class NormalBank extends Bank {
    public double getInt_rate() {
        // You need to define a method to get the interest rate for NormalBank
        return 5.0; // Adjust this value as needed
    }
}

class GoodBank extends Bank {
    public double getInt_rate() {
        return 3.0;
    }
}

public class BankTest {
    public static void main(String[] args) {
        BadBank b1 = new BadBank();
        NormalBank b2 = new NormalBank();
        GoodBank b3 = new GoodBank();

        System.out.println("BadBank의 이자율: " + b1.getInt_rate() + " %");
        System.out.println("NormalBank의 이자율: " + b2.getInt_rate() + " %");
        System.out.println("GoodBank의 이자율: " + b3.getInt_rate() + " %");
    }
}
