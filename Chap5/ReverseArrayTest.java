package PracticeProblems.Chap5;

public class ReverseArrayTest {
    public static int[] reverse(int[] org){
        int len = org.length;
        int[] reversed = new int[len];

        for(int i=0; i<len; i++){
            reversed[i] = org[len-1-i];
        }
        return reversed;
    }

    public static void main(String[] args) {
        int[] data = {1,3,5,7,9};

        int [] result = reverse(data);

        for (int i : result) {
            System.out.print(i+" ");

        }
    }
}
