package PracticeProblems.Chap5;


import java.util.Scanner;

class Hangmann {
    String user;
    String hiddenString;
    int sum;

    public Hangmann() {
        this.sum = 0;
    }

    public int playGame(StringBuffer outputString) {
        int a = hiddenString.indexOf(user);
        if (a != -1) {
            char b = hiddenString.charAt(a);
            outputString.setCharAt(a, b);
            hiddenString = hiddenString.replaceFirst(user, "0");
        }else{
            sum += 1;

        }

        System.out.println("단어 : " + outputString);
        return sum;
    }
}

public class Game {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Hangmann hangman = new Hangmann();
        hangman.hiddenString = "hello";

        StringBuffer outputString = new StringBuffer();
        for (int i = 0; i < hangman.hiddenString.length(); i++) {
            outputString.append("-");
        }

        while (outputString.toString().contains("-")) {
            System.out.print("단어(5글자) : ");
            System.out.println(outputString);
            System.out.print("한 문자를 입력하세요 : ");
            hangman.user = in.next();
            hangman.playGame(outputString);
        }

        int result = hangman.sum;

        if (result <= 2) {
            System.out.println(result + "번 틀렸습니다. 참 잘했어요!");
        } else if (result <= 3) {
            System.out.println(result + "번 틀렸습니다. 잘했어요!");
        } else if (result <= 4) {
            System.out.println(result + "번 틀렸습니다. 보통이에요!");
        } else {
            System.out.println(result + "번 틀렸습니다. 분발하세요!");
        }
    }
}
