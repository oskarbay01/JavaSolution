package Day3;

import java.util.Scanner;

/* ${@Author} created on 03.04.2021 inside the package - Day3 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = 0;

        while (count < 5) {
            double a = scan.nextDouble();
            double b = scan.nextDouble();

            count++;

            if (b == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(a / b);
        }
    }
}
