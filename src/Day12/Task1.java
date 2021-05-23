package Day12;

import java.util.ArrayList;

/**
 * Создать список строк, добавить в него 5 марок автомобилей, вывести список в
 * консоль. Добавить в середину еще 1 автомобиль, удалить самый первый автомобиль
 * из списка. Распечатать список.
 */

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

