package PracticeProblems.Chap5;

class MakeAlpha {
    public static char[][] makeAlpha() {
        char[][] alpha = new char[5][5];
        char letter = 'A';

        for (int i = 0; i < alpha.length; i++) {
            for (int j = 0; j < alpha[i].length; j++) {
                alpha[i][j] = letter;
                letter++;
            }
        }
        return alpha;
    }

    public static void main(String[] args) {
        char[][] alpha = makeAlpha();

        for (int i = 0; i < alpha.length; i++) {
            for (int j = 0; j < alpha[i].length; j++) {
                System.out.printf("%2c", alpha[i][j]);
            }
            System.out.println();
        }
    }
}
