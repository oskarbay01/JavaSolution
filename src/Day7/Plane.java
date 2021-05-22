package Day7;

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

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void fillUp(int InputFill) {
        fuel = fuel + InputFill;
    }

    public static void compareAirplanes(Plane plane1,Plane plane2){
        if (plane1.getLength()>plane2.getLength()) {
            System.out.println("Первый самолет длиннее");
        }else if (plane1.getLength()< plane2.getLength()){
            System.out.println("Второй самолет длиннее");
        }else{
            System.out.println("Два самолетов равны");
        }
    }
}
