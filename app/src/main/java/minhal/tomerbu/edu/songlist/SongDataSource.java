package minhal.tomerbu.edu.songlist;

import java.util.ArrayList;

/**
 * Created by ANDROID on 12/11/2017.
 */

public class SongDataSource {
    private ArrayList<Song> songs = new ArrayList<>();

    public SongDataSource() {
        for (int i = 0; i < 100; i++)
            songs.add(new Song(
                    "Rihanna",
                    "Nothing Is Promised",
                    "4:32",
                    "https://www.youtube.com/watch?v=vnDqIlHsEqc",
                    R.drawable.nothing)
            );
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }
}
