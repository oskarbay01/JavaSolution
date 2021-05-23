package Day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Реализовать программу, которая на вход принимает txt файл с целыми числами
 * (можно использовать файл из задания 1 дня 14) и в качестве ответа выводит в
 * консоль среднее арифметическое этих чисел.
 * Ответ будет являться вещественным числом. В консоль необходимо вывести полную
 * запись вещественного числа (со всеми знаками после запятой) и сокращенную запись
 * (с 3 знаками после запятой).
 */
public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Пользователь\\IdeaProjects\\JavaMarathon\\src\\input.txt");

        try {
            Scanner scanner = new Scanner(file);

            String line = scanner.nextLine();
            String[] array = line.split(" ");

            int sum = 0;
            for (String num : array)
                sum += Integer.parseInt(num);

            double avg =  sum /(double) array.length;

            System.out.printf(avg + "--> %2f", avg);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        }

    }
}
