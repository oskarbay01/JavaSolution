package Day2;

import java.util.Scanner;

/* ${@Author} created on 01.04.2021 inside the package - Day2 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double x = scan.nextDouble();
        double y = 0;

        if (x >= 5) {
            y = (Math.pow(x, 2) - 10) / (x + 7);
        } else if (x > -3 && x < 5) {
            y = (x + 3) * (Math.pow(x, 2) - 2);
        } else {
            y=420;
        }
        System.out.println(y);
    }
}
