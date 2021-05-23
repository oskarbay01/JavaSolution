package Day5;

/**
 * Создать класс Мотоцикл (англ. Motorbike ), с полями “Год выпуска”, “Цвет”,
 * “Модель”. Создать экземпляр класса Мотоцикл, с помощью конструктора (сеттеры не
 * использовать). Придерживаться принципов инкапсуляции и использовать ключевое
 * слово this . Геттером получить год выпуска, цвет, модель, вывести значения в
 * консоль.
 */

public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike(2020, "white", "lexus");
        System.out.println(motorbike.getColor() + "\n"
                + motorbike.getModel() + "\n" + motorbike.getYear());
    }
}
