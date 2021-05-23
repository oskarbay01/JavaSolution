package Day4;

import java.util.Random;

/*
Создать новый массив размера 100 и заполнить его случайными числами из
диапазона от 0 до 10000.
Затем, используя циклы for each вывести:
- наибольший элемент массива
- наименьший элемент массива
- количество элементов массива, оканчивающихся на 0
- сумму элементов массива, оканчивающихся на 0
 */

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10000);
        }

        int max = 0;
        //[1,4,6,10,-1]
        for (int element : arr) {
            if (element > max)
                max = element;
        }
        System.out.println(max);

        int min = 1000;
        //[4,6,10,1]
        for (int element : arr) {
            if (element < min)
                min = element;
        }
        System.out.println(min);

        int count0 = 0;
        for (int element : arr) {
            if (element % 10 == 0)
                count0++;
        }
        System.out.println(count0);
    }
}
