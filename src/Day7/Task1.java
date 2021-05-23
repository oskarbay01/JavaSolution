package Day7;

/**
 * Для этого задания скопируйте класс Самолет из предыдущего дня в пакет текущего
 * дня.
 * В классе Самолет создать статический метод compareAirplanes , который в
 * качестве аргументов принимает два объекта класса Airplane (два самолета) и выводит
 * сообщение в консоль о том, какой из самолетов длиннее.
 */

public class Task1 {
    public static void main(String[] args) {
        Plane plane1= new Plane("Boeing",2020,30,20000,234323);
        Plane plane2= new Plane("Boeing",2015,20,30000,2423542);

        Plane.compareAirplanes(plane1,plane2);


    }
}
