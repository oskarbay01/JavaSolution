package Day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/* ${@Author} created on 03.04.2021 inside the package - Day4 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Random rand = new Random();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(10);
        }
        //System.out.print(array[i]+" ");
        System.out.println("Длине массива " + Arrays.toString(array));

        int count8 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 8) {
                count8++;
            }
        }
        System.out.println("Количестве чисел больше 8:" + count8);

        int count1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                count1++;
            }
        }
        System.out.println("Количестве чисел равных 1:" + count1);

        int countEven = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countEven++;
            }
        }
        System.out.println("Количестве четных чисел:" + countEven);

        int countOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                countOdd++;
            }
        }
        System.out.println("Количестве нечетных чисел:" + countOdd);

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Сумме всех элементов массива:" + sum);
    }
}
