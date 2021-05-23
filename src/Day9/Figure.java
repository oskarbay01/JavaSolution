package Day9;

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
