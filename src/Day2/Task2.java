package Day2;

import java.util.Scanner;

/* ${@Author} created on 01.04.2021 inside the package - Day2 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if (a >= b) {
            System.out.println("ERROR");
        } else {
            for (int i = a + 1; i < b; i++) {
                if (i % 5 == 0 && i % 10 != 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
