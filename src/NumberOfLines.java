import java.util.Arrays;

public class NumberOfLines {

    public static void main(String[] args) {

        int gridSize = 3;
        int[][] grid = new int[gridSize][gridSize];

        for (int[] line : grid) {
            System.out.println(Arrays.toString(line));
        }
    }
}