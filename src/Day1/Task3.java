package Day1;

/*
Вывести на экран слово “JAVA” , в столбик, чтобы оно повторилось 10 раз,
используя цикл на ваше усмотрение ( for или while )
 */

public class Task3 {
    public static void main(String[] args) {
        int year = 1980;
        while (year <= 2020) {
            System.out.println("Олимпиада " + year + "года");
            year = year + 4;
        }
    }
}
