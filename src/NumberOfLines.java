import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class NumberOfLines {

    public static void main(String[] args) {

        int gridSize = 3;
        int[][] grid = new int[gridSize][gridSize];
        int j = 0;
        int i = 0;
        boolean isRunning = true;

        while (isRunning) {
            grid[i][j] = 1;
            for (int[] row : grid) {
                System.out.println(Arrays.toString(row));
            }
            System.out.println();
            if (j == gridSize - 1) {
                j = -1;
                i++;
                grid = new int[gridSize][gridSize];
            }
            j++;
            if (i == gridSize) {
                isRunning = false;
            }
        }
    }
}