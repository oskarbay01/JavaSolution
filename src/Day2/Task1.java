package Day2;

import java.util.Scanner;

/* ${@Author} created on 01.04.2021 inside the package - Day2 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int floor= scan.nextInt();
        if(floor>=1 && floor<=4){
            System.out.println("Малоэтажный дом");
        }else if (floor>=5 && floor<=8){
            System.out.println("Cреднеэтажный дом");
        }else if (floor>=9){
            System.out.println("Многоэтажный дом");
        }else {
            System.out.println("ERROR");
        }
    }
}
