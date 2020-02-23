import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class NumberOfLines {

    public static void main(String[] args) {

        int gridSize = 3;
        int[][] grid = new int[gridSize][gridSize];
        int x = 0;
        int y = 0;
boolean isRunning = true;
        while (isRunning){
            grid[y][x] = 1;
            for (int[] row : grid) {
                System.out.println(Arrays.toString(row));
            }
            System.out.println();
            if (x == 2) {
                x = -1;
                y++;
            }
            x++;
            if (y ==3){
                isRunning = false;
            }
        }
    }
}