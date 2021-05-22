package Day5;

/* ${@Author} created on 06.04.2021 inside the package - Day5 */
public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike(2020, "white", "lexus");
        System.out.println(motorbike.getColor() + "\n"
                + motorbike.getModel() + "\n" + motorbike.getYear());
    }
}
