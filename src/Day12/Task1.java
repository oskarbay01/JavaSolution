package Day12;

import java.util.ArrayList;

/* ${@Author} created on 20.04.2021 inside the package - Day12 */
public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Audi");
        arrayList.add("Toyota");
        arrayList.add("Nissan");
        arrayList.add("RR");
        arrayList.add("BMW");

        System.out.println(arrayList);

        arrayList.add(2,"Kia");
        //arrayList.remove(0);

        System.out.println(arrayList);
        }
    }

