package Day8;

/**
 * Создать строку, состоящую из чисел от 0 до 100. Важно понимать, что это одна
 * строка, полученная конкатенацией (“склеиванием”) чисел из диапазона через пробел
 * (0 + “ “ + 1 + “ “ + 2 + … + 100)
 */

public class Task1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= 100; i++) {
            sb.append(i).append(" ");


        }
        System.out.println(sb);
    }
}
