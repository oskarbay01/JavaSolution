package Day3;

import java.util.Scanner;

/* ${@Author} created on 01.04.2021 inside the package - Day3 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Выводите город в консоль");

        while (true) {
            String city = scan.nextLine();

            if (city.equalsIgnoreCase("Stop"))
                break;

            switch (city) {
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Россия");
                    break;

                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Италия");
                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Англия");
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кельен":
                    System.out.println("Германия");
                    break;
                default:
                    System.out.println("Неизвестная страна");
            }

        }
    }
}
