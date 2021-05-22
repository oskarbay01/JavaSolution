package Day6;

/* ${@Author} created on 06.04.2021 inside the package - Day5 */
public class Motorbike {
    private int year;
    private String color;
    private String model;


    public Motorbike(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {

        return color;
    }

    public String getModel() {

        return model;
    }

    public void info(){
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int InputYear){
        return InputYear-year;
    }

}
