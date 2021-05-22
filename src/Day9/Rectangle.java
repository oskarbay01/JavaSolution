package Day9;

/* ${@Author} created on 08.04.2021 inside the package - Day9 */
public class Rectangle extends Figure {
    private double weight;
    private double height;

    public Rectangle(String color, double weight, double height) {
        super(color);
        this.weight = weight;
        this.height = height;
    }

    @Override
    public double area() {
        return weight*height;
    }

    @Override
    public double perimeter() {
        return 2*(weight+height);
    }
}
