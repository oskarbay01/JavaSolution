package Day12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* ${@Author} created on 21.04.2021 inside the package - Day12 */
public class Task3 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("ZZ",1985 );
        MusicBand band2 = new MusicBand("AA", 2000);
        MusicBand band3 = new MusicBand("WW", 1999);
        MusicBand band4 = new MusicBand("EE", 1989);
        MusicBand band5 = new MusicBand("XX", 1993);
        MusicBand band6 = new MusicBand("CC", 1995);
        MusicBand band7 = new MusicBand("VV", 2001);
        MusicBand band8 = new MusicBand("HH", 2007);
        MusicBand band9 = new MusicBand("GG", 2005);
        MusicBand band10 = new MusicBand("SS", 2010);

        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(band1);
        musicBands.add(band2);
        musicBands.add(band3);
        musicBands.add(band4);
        musicBands.add(band5);
        musicBands.add(band6);
        musicBands.add(band7);
        musicBands.add(band8);
        musicBands.add(band9);
        musicBands.add(band10);

        System.out.println(musicBands);

        Collections.shuffle(musicBands);
        List<MusicBand> groupsAfter2000 = new ArrayList<>();

        for (MusicBand band:musicBands) {
            if(band.getYear()>2000)
                groupsAfter2000.add(band);

        }
        System.out.println(groupsAfter2000);


    }
}
