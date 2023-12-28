package PracticeProblems.Chap5;


import java.util.HashSet;
import java.util.Scanner;

class man {
    String user;
    String hiddenString;
    int sum;
    HashSet<String> usedChars = new HashSet<>();

    public man() {
        this.sum = 0;
    }

    public int playGame(StringBuffer outputString) {
        if (usedChars.contains(user)) {
            System.out.println("이미 사용한 문자입니다. 다시 시도해주세요.");
        } else {
            usedChars.add(user);
            int a = hiddenString.indexOf(user);
            if (a != -1) {
                char b = hiddenString.charAt(a);
                outputString.setCharAt(a, b);
                hiddenString = hiddenString.replaceFirst(user, "0");
            } else {
                sum += 1;
                drawHangman(sum);
            }
        }

        System.out.println("단어 : " + outputString);
        return sum;
    }

    public void drawHangman(int sum) {
        switch (sum) {
            case 1:
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("========");
                break;
            case 2:
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("========");
                break;
            case 3:
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println("  |   |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("========");
                break;
            case 4:
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println(" /|   |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("========");
                break;
            case 5:
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println(" /|\\  |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("========");
                break;
            case 6:
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println(" /|\\  |");
                System.out.println(" /    |");
                System.out.println("      |");
                System.out.println("========");
                break;
            case 7:
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println(" /|\\  |");
                System.out.println(" / \\  |");
                System.out.println("      |");
                System.out.println("========");
                break;
        }
    }
}
public class Hangman {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        man hangman = new man();
        hangman.hiddenString = "hello";

        StringBuffer outputString = new StringBuffer();
        for (int i = 0; i < hangman.hiddenString.length(); i++) {
            outputString.append("-");
        }
        int result = hangman.sum;

        while (!outputString.toString().equals(hangman.hiddenString) && hangman.sum < 7)  {
            System.out.print("단어(5글자) : ");
            System.out.println(outputString);
            System.out.print("한 문자를 입력하세요 : ");
            hangman.user = in.next();
            hangman.playGame(outputString);
            result = hangman.sum;
        }

        if (result <= 2) {
            System.out.println(result + "번 틀렸습니다. 참 잘했어요!");
        } else if (result <= 3) {
            System.out.println(result + "번 틀렸습니다. 잘했어요!");
        } else if (result <= 4) {
            System.out.println(result + "번 틀렸습니다. 보통이에요!");
        } else if (result < 7) {
            System.out.println(result + "번 틀렸습니다. 분발하세요!");
        } else if (result == 7) {
            System.out.println("7번 틀렸습니다. 게임을 종료합니다.");
        }
    }
}