package Day9;

/* ${@Author} created on 08.04.2021 inside the package - Day9 */
public class Triangle extends Figure{
    private double a,b,c;

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        return a*b*c;
    }

    @Override
    public double perimeter() {
        return a+b+c;
    }
}
