package PracticeProblems.Chap5;

public class AlphaTest {
    public static void main(String[] args) {
        int i, j;
        char a = 'A'; // 65 ~ 90
        char[] alpha = new char[26];
        int radix = 10; // 10진수

        // Generate alphabet characters and store them in the 'alpha' array
        for (int p = 0; p < 26; p++) {
            int num = a;
            char value_char = (char) (num + p);
            alpha[p] = value_char;
        }

        // Print the triangular pattern
        for (i = 0; i < 26; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print(alpha[j]); // Print each character in the row
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}
