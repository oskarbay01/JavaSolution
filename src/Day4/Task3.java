package Day4;

import java.util.Arrays;
import java.util.Random;

/* ${@Author} created on 04.04.2021 inside the package - Day4 */
public class Task3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int arr[][] = new int[12][8];

        int maxSum = 0;
        int maxSumIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rand.nextInt(50);
                sum += sum + arr[i][j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxSumIndex = i;
            }
        }
        System.out.println(maxSumIndex);

        //System.out.println(Arrays.deepToString(arr));
    }
}
