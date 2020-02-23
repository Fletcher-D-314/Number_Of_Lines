import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class NumberOfLines {

    public static void main(String[] args) {

        int gridSize = 3;
        ArrayList<int[]> positions = new ArrayList<>(0);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int i = 0;
        boolean run = true;

        while (run) {

            if (num1 == (gridSize * gridSize)) {
                i = 0;
                num1 = 0;
                num2++;
            }
            if (num2 == (gridSize * gridSize)) {
                num2 = 0;
                num3++;
            }
            if (num3 == (gridSize * gridSize)) {
                run = false;
            } else {

                if (num1 != num2) {
                    if (num1 != num3) {
                        if (num2 != num3) {
                            int[] newPositions = {num1, num2, num3};
                            Arrays.sort(newPositions);
                            if (positions.size() == 0) {
                                positions.add(newPositions);
                            } else if (!isInArray(newPositions, positions)) {
                                positions.add(newPositions);
                            }
                            System.out.println("num1 = " + num1 + "\tnum2 = " + num2 + "\tnum3 = " + num3 + "\t");
                        }
                    }
                }

                i++;
                num1 = i;
            }
        }
        for (int[] position : positions) {
            System.out.print(Arrays.toString(position) + ", ");
        }
    }

    private static boolean isInArray(int[] newPosition, ArrayList<int[]> positions) {
        boolean isPresent = false;
        for (int[] position : positions) {
            if (Arrays.equals(position, newPosition)) {
                isPresent = true;
                break;
            }
        }
        return isPresent;
    }

}