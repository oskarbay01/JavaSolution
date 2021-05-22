package Day12;

import java.util.List;

/* ${@Author} created on 20.04.2021 inside the package - Day12 */
public class MusicBand {
    private String name;
    private int year;


    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
