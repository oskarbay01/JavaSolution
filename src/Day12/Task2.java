package Day12;

import java.util.ArrayList;

/* ${@Author} created on 20.04.2021 inside the package - Day12 */
public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 31; i++) {
            if (i % 2 == 0)
                arrayList.add(i);
        }

        for (int i = 300; i < 351; i++) {
            if (i % 2 == 0)
                arrayList.add(i);
        }

        System.out.println(arrayList);
    }
}
