package Day5;

/**
 * Создать класс Автомобиль (англ. Car ), с полями “Год выпуска”, “Цвет”, “Модель”.
 * Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль,
 * задать сеттером каждое поле, вывести в консоль значение каждого поля геттером.
 * Созданный вами класс должен отвечать принципам инкапсуляции.
 */

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("AUDI");
        car.setYear(2021);
        car.setColor("black");

        System.out.println(car.getModel()+car.getYear()+car.getColor());
    }
}
