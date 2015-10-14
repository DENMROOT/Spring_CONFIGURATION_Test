package model.impl;

import com.google.common.base.Objects;
import model.CdDisk;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

/**
 * Created by dmakarov on 9/14/2015.
 */
@Component ("anotherSideOfTheMoon")
@Entity
@Table(name = "CD_DISK")
public class YellowSubmarine implements CdDisk {
    @Id
    @Column(name = "CD_DISK_ID")
    private long id;

    @Column (name = "TITLE")
    private String title = "Yellow Submarine";

    @Column (name = "ARTIST")
    private String artist = "The beatles";

    @Transient
    private List<String> tracks;

    public YellowSubmarine() {
    }

    public YellowSubmarine(long id, String title, String artist) {
        this.id = id;
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
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

    public void play() {
        System.out.print(artist + ": " + title);
    }

    public List<String> getTracks() {
        return tracks;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        YellowSubmarine that = (YellowSubmarine) o;
        return Objects.equal(id, that.id) &&
                Objects.equal(title, that.title) &&
                Objects.equal(artist, that.artist);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, title, artist);
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("id", id)
                .add("title", title)
                .add("artist", artist)
                .add("tracks", tracks)
                .toString();
    }
}
