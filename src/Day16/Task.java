package Day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Реализовать программу, записывающую числа разных типов в 2 файла.
 * Файл 1 должен называться “file1.txt”, а Файл 2 должен называться “file2.txt”.
 * Оба файла должны находиться в корне проекта. Создаваться файлы должны не
 * вручную, а при запуске программы
 */

public class Task {
    public static void main(String[] args) throws FileNotFoundException, ArrayIndexOutOfBoundsException {
        File file = new File("file\\shoes.csv");
        Scanner scanner = new Scanner(file);

        File fileOut = new File("file\\testFile1.txt");
        PrintWriter pw = new PrintWriter(fileOut);
        while (scanner.hasNextLine()) {
            String[] line = scanner.nextLine().split(";");
            if (Integer.parseInt(line[2]) == 0)
                try {
                    pw.println(line[0] + ", " + line[1] + ", " + line[2]);
                } catch (Exception e) {
                    e.printStackTrace();
                }

        }
        pw.close();
        scanner.close();
    }
}
