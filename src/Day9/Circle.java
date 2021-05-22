package Day9;

/* ${@Author} created on 08.04.2021 inside the package - Day9 */
public class Circle extends Figure {
    private double r;

    public Circle(String color) {
        super(color);
    }

    @Override
    public double area() {
        return r * r * Math.PI;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * r;
    }
}
