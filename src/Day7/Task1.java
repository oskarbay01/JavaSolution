package Day7;

/* ${@Author} created on 06.04.2021 inside the package - Day7 */
public class Task1 {
    public static void main(String[] args) {
        Plane plane1= new Plane("Boeing",2020,30,20000,234323);
        Plane plane2= new Plane("Boeing",2015,20,30000,2423542);

        Plane.compareAirplanes(plane1,plane2);


    }
}
