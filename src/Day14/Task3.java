package Day14;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Askar created on 22.05.2021 inside the package - Day14 */
public class Task3 {
    public static void main(String[] args) {
        System.out.println(parseFileToOblect());
    }

    public static List<Person> parseFileToOblect() {
        File file = new File("C:\\Users\\Пользователь\\IdeaProjects\\JavaMarathon\\src\\people.txt");
        List<Person> people = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                String[] person = line.split(" ");
                if (Integer.parseInt(person[1]) < 0)
                    throw new IllegalArgumentException();
                Person currentPerson = new Person(person[0], Integer.parseInt(person[1]));
                people.add(currentPerson);
            }

            return people;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
        return null;
    }
}
