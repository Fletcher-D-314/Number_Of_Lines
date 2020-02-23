import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class NumberOfLines {

    public static void main(String[] args) {

        int gridSize = 3;
        int[][] grid = new int[gridSize][gridSize];
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int i = 0;
        boolean run = true;

        while (run) {
            System.out.println("num1 = " + num1 + "\tnum2 = " + num2 + "\tnum3 = " + num3);
            i++;
            num1 = i;

            if (num1 == 9) {
                i = 0;
                num1 = 0;
                num2++;
            }
            if (num2 == 9) {
                num2 = 0;
                num3++;
            }
            if (num3 == 9) {
                run = false;
            }
        }
    }
}