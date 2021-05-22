package Day6;

/* ${@Author} created on 04.04.2021 inside the package - Day5 */
public class Car {
    private int year;
    private String color;
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int InputYear) {
        return InputYear - year;
    }

}
