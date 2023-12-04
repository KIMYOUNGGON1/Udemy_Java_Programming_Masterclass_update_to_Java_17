package section_10.playListChallenge;

import java.util.ArrayList;
import java.util.ListIterator;

public class Album {
    private String name;
    private String artist;

    private static ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public static boolean addSong(String title, double duration) {
        Song song = new Song(title, duration);
        if (!songs.contains(song)) {
            songs.add(song);
            return true;
        }
        return false;
    }

    public static Song findSong(String title) {
        for (Song song : songs) {
            if (song.getTitle().equals(title)) {
                return song;
            }
        }
        return null;
    }


}
