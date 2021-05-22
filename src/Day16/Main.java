package Day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/* Askar created on 22.05.2021 inside the package - Day16 */
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
