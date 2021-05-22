package Day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/* Askar created on 22.05.2021 inside the package - Day16 */
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
