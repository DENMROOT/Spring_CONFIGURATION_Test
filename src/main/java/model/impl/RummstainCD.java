package model.impl;

import model.CdDisk;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by dmakarov on 9/14/2015.
 */
@Component()

/* Scope types for normal Spring and Spring MWC
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
@Scope(value=WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.INTERFACES)
 */
public class RummstainCD implements CdDisk {
    private int id;
    private String title = "Rammstain CDdisk";
    private String artist = "Rammstain";

    public void play() {
        System.out.print(artist + ": " + title);
    }

    public String getArtist() {
        return null;
    }

    public String getTitle() {
        return null;
    }

    public List<String> getTracks() {
        return null;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
