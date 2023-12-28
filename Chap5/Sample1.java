package PracticeProblems.Chap5;

import java.util.Scanner;

public class Sample1 {
    static Scanner in = new Scanner(System.in);
    static Subject subjects[] = new Subject[4];

    public static void main(String[] args) {
        int sum = 0;
        String[] subjectNames = {"국어", "영어", "수학", "과학"};

        for (int i = 0; i < 4; i++) {
            subjects[i] = new Subject(subjectNames[i]);
            System.out.print(subjectNames[i] + " 점수 : ");
            subjects[i].jumsu = in.nextInt();
            sum += subjects[i].jumsu;
        }

        System.out.println("합계 : " + sum);
        System.out.println("등급 : " + subjects[0].getGrade(sum));
    }
}

class Subject {
    int jumsu;
    String name;

    public Subject(String name) {
        this.name = name;
    }

    public char getGrade(int totalScore) {
        if (totalScore == 400) {
            return 'A';
        } else if (totalScore >= 320) {
            return 'B';
        } else if (totalScore >= 280) {
            return 'C';
        } else if (totalScore >= 240) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
