package Day10;

/* ${@Author} created on 09.04.2021 inside the package - Day10 */
public class Rect extends Figure{

    public Rect(double a, double b) {
        super(a, b);
    }

    @Override
    public double area() {
        return a*b;
    }
}
