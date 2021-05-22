package Day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/* Askar created on 22.05.2021 inside the package - Day15 */
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
