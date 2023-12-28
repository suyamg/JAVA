package PracticeProblems.Chap5;


import java.util.Scanner;
public class SB_test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String user;
        StringBuffer index = new StringBuffer();
        System.out.print("단어 입력 : ");
        user = in.next();
        int num = user.length();
        for (int i = 0; i<num; i++ ){
            index.append("-");
        }
        System.out.printf("단어(%d글자) : ", num);
        System.out.println(index);


    }

}