package PracticeProblems.Chap5;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseArrayT {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> Scores = new ArrayList<>();
        int data;
        int n = 0;
        while (true) {
            n+=1;
            System.out.print(n+" 원소 입력 : ");
            data =in.nextInt();
            if (data < 0){
                break;
            } else {
                Scores.add(data);
            }
        } System.out.print("배열 원소 : ");
        for (int a : Scores){
            System.out.print(a+" ");
        }
    }
}
