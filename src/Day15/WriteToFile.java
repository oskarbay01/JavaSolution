package Day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Необходимо сформировать новый файл
 * (src/main/resources/missing_shoes.txt) с информацией о моделях и
 * размерах обуви, которой нет на складе (количество = 0) . Для этого реализуйте
 * программу, которая принимает на вход csv файл и создает новый txt файл
 * следующего содержания (должно получиться 11 строк):
 * */

public class WriteToFile {
    public static void main(String[] args) {
        File file = new File("testFile");
        try {
            PrintWriter pw  =new PrintWriter(file);

            pw.println("Test 1");
            pw.println("Test 2");

            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
