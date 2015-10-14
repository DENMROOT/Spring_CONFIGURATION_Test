package model.impl;

import model.CdDisk;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by dmakarov on 9/18/2015.
 */
@Component
public class DefaultCdDisk implements CdDisk{
    private int id;
    private String title;
    private String artist;

    public DefaultCdDisk() {
    }

    public DefaultCdDisk(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getTracks() {
        return null;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return com.google.common.base.Objects.toStringHelper(this)
                .add("title", title)
                .add("artist", artist)
                .toString();
    }

    public void play() {
        System.out.print(artist + ": " + title);
    }
}
