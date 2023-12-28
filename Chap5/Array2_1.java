package PracticeProblems.Chap5;

public class Array2_1 {
    public static void main(String[] args) {
        int num = 1;
        int[][] array = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = num;
                System.out.printf("%2s", array[i][j]);
                num += 1;
            }
            System.out.println();  // Move to the next line after each row
        }
    }
}
