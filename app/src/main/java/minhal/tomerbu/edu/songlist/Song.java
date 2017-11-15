package minhal.tomerbu.edu.songlist;

/**
 * Created by ANDROID on 12/11/2017.
 */

public class Song {
    //STRING ARTIST
    private String artist;
    private String title;
    private String duration; //"4:23" ...Date... (sound)
    private String url;
    private int imageResID;// drawable!

    //constructor:
    public Song(String artist, String title, String duration, String url, int imageResID) {
        this.artist = artist;
        this.title = title;
        this.duration = duration;
        this.url = url;
        this.imageResID = imageResID;
    }

    //getters and setters:
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDuration() {
        return duration;
    }
    public void setDuration(String duration) {
        this.duration = duration;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public int getImageResID() {
        return imageResID;
    }
    public void setImageResID(int imageResID) {
        this.imageResID = imageResID;
    }

    //toString
    @Override
    public String toString() {
        return "Song{" +
                "artist='" + artist + '\'' +
                ", title='" + title + '\'' +
                ", duration='" + duration + '\'' +
                ", url='" + url + '\'' +
                ", imageResID=" + imageResID +
                '}';
    }
}
