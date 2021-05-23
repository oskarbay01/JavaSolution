package Day2;

import java.util.Scanner;

/*
Реализовать программу, которая принимает на вход через консоль с помощью
класса Scanner , число, соответствующее количеству этажей в здании. Используя
условный оператор if , необходимо вывести в консоль сообщение о типе такого дома
 */
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
