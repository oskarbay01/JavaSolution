package Day3;

import java.util.Scanner;

/* ${@Author} created on 03.04.2021 inside the package - Day3 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            double a = scan.nextDouble();
            double b = scan.nextDouble();

            if (b == 0) {
                break;
            }
            System.out.println(a/b);
        }
    }
}
