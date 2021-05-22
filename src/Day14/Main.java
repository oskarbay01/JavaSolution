package Day14;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/* Askar created on 22.05.2021 inside the package - Day14 */
public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Пользователь\\IdeaProjects\\JavaMarathon\\src\\input1.txt");

        try {
            Scanner scanner = new Scanner(file);

            String line = scanner.nextLine();
            String[] numbers = line.split(" ");

            if (numbers.length != 5)
                throw new IllegalArgumentException();

            int sum=0;
            for (String number:numbers)
                sum+=Integer.parseInt(number);

            System.out.println(sum);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный вход файла");
        }

    }
}
