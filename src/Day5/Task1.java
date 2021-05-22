package Day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("AUDI");
        car.setYear(2021);
        car.setColor("black");

        System.out.println(car.getModel()+car.getYear()+car.getColor());
    }
}
