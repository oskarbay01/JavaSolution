package Day4;


import java.util.Random;

/*
Заполнить двумерный массив (матрицу) случайными числами от 0 до 50. Размер
матрицы задать m=12 , n=8 ( m - размерность по строкам, n - размерность по колонкам).
В консоль вывести индекс строки, сумма чисел в которой максимальна. Если таких
строк несколько, вывести индекс последней из них.
 */

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
    }
}
