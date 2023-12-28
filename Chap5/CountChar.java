package PracticeProblems.Chap5;

class Countchar {
    public static int countchar(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
}

public class CountChar {
    public static void main(String[] args) {
        System.out.println(Countchar.countchar("jazz",'z'));
    }
}
