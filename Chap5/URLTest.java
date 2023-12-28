package PracticeProblems.Chap5;

import java.util.Scanner;

public class URLTest {
    public static void main(String[] args) {
        String s;
        int num = 2;
        Scanner in = new Scanner(System.in);

        while (true) {
            String c1 = "", c2 = "";
            System.out.print("URL을 입력하세요: ");
            s = in.nextLine();
            if (s.equals("bye")){
                break;
            } else {
                String[] strArr = s.split("\\."); // '.'은 정규 표현식에서 특별한 의미를 가지므로 이스케이프 해야함
                for (String c : strArr) {
                    if (num == 0){
                        c1 = c;
                    } else if (num == 1) {
                        c2 = c;
                    }
                    num -= 1;
                }
                System.out.printf(s + "은" + "\" %s \"" + "로 끝납니다.",c1);
                System.out.println();
                System.out.printf(s + "은" + "\" %s \"" + "를 포함합니다.",c2);
                System.out.println();
            }
        }
    }
}
