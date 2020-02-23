import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class NumberOfLines {

    public static void main(String[] args) {

        int gridSize = 3;
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int i = 0;
        boolean run = true;

        while (run) {

            if (num1 == (gridSize*gridSize)) {
                i = 0;
                num1 = 0;
                num2++;
            }
            if (num2 == (gridSize*gridSize)) {
                num2 = 0;
                num3++;
            }
            if (num3 == (gridSize*gridSize)) {
                run = false;
            } else {

                if (num1!=num2){
                    if (num1 != num3){
                        if (num2 != num3){
                            System.out.println("num1 = " + num1 + "\tnum2 = " + num2 + "\tnum3 = " + num3);
                        }
                    }
                }

                i++;
                num1 = i;
            }
        }
    }
}