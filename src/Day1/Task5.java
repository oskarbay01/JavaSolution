package Day1;

import java.util.Scanner;

/*
Объявите переменную типа int , имя переменной - k . Присвойте этой переменной
какую-нибудь цифру от 1 до 9. Используя цикл на ваше усмотрение ( for или while )
 */

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        for (int i = 1; i < 10; i++) {
            System.out.println(i + "*" + k + "=" + i * k);
        }
    }
}
