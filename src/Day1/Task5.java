package Day1;

import java.util.Scanner;

/* Пользователь created on 01.04.2021 inside the package - Day1 */
public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        for (int i = 1; i < 10; i++) {
            System.out.println(i + "*" + k + "=" + i * k);
        }
    }
}
