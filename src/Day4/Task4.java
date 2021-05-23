package Day4;

import java.util.Random;

/*
Создать новый массив размера 100 и заполнить его случайными числами из
диапазона от 0 до 10000.
Найти максимум среди сумм трех соседних элементов. Для найденной тройки с
максимальной суммой выведите значение суммы и индекс первого элемента тройки.
 */

public class Task4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10000);
        }
        int maxSum = 0;
        int maxSumIndex = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum = sum + arr[j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxSumIndex = i;
            }

        }
        System.out.println(maxSumIndex);
        System.out.println(maxSum);
    }
}
