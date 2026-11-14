
import java.util.Arrays;

public class Problem1 {
    public static void lineUp(int[] heights) {
        for (int i = 0; i < heights.length; i++) {
            boolean swapped = false;

            for (int j = 0; j < heights.length - 1 - i; j++) {
                if (heights[j] > heights[j + 1]) {
                    int temp = heights[j];
                    heights[j] = heights[j + 1];
                    heights[j + 1] = temp;
                    swapped = true;
                }
            }

            System.out.println("Pass " + (i + 1) + ": " + Arrays.toString(heights));

            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] heights1 = {4, 2, 5, 1};
        int[] heights2 = {1, 3, 2, 4};

        lineUp(heights1);
        lineUp(heights2);
    }
}
