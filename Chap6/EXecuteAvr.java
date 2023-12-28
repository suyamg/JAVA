package PracticeProblems.Chap6;

import java.util.Scanner;

class Average {
    static int kor, eng, mat;
    double total, average;

    public void calc_total() {
        total = kor + eng + mat;
        System.out.println("총점은 " + total + "점이다.");
    }

    public void calc_avr() {
        average = total / 3;
        System.out.println("평균은 " + average + "점이다.");
    }
}

public class EXecuteAvr {
    public static void main(String[] args) {
        Average av = new Average();
        Scanner sn = new Scanner(System.in);

        System.out.print("국어 : ");
        av.kor = sn.nextInt();
        System.out.print("수학 : ");
        av.eng = sn.nextInt();
        System.out.print("영어 : ");
        av.mat = sn.nextInt();

        av.calc_total();
        av.calc_avr();
    }
}
