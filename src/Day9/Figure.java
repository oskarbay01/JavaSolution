package Day9;

/* ${@Author} created on 08.04.2021 inside the package - Day9 */
public abstract class Figure {
    public String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Figure(String color) {
        this.color = color;
    }

    public abstract double area();
    public abstract double perimeter();
}
