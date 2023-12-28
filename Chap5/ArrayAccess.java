package PracticeProblems.Chap5;
import java.util.Scanner;
public class ArrayAccess {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] a = new int[5];
        for (int i=1; i<6; i++) {
            System.out.printf("%d번째 입력: ", i);
            int k = in.nextInt();
            in.nextLine();
            a[i-1] = k;
        }
        int maxnum = a[0];
        for(int p : a) {
            if (maxnum < p){
                maxnum = p;
            }

        }
        System.out.println("입력된 수에서 가장 큰 수는 "+maxnum+" 입니다.");
    }
}
