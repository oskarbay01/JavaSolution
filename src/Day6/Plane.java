package Day6;

/* - producer (изготовитель)
- year (год выпуска)
- length (длина)
- weight (вес)
- fuel (количество топлива в баке) + геттер для этого поля
 */

public class Plane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Plane(String producer, int year, int length, int weight, int fuel) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;

    }

    public int getFuel() {
        return fuel;
    }

    public void info() {
        System.out.println("Изготовитель:" + producer + "год выпуска:" + year
                + "длина:" + length + "вес:" + weight +
                "количество топлива в баке:" + fuel);
    }

    public void fillUp(int InputFill) {
        fuel = fuel + InputFill;
    }
}
