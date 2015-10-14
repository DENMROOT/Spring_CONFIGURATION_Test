package model;

import java.util.List;

/**
 * Created by dmakarov on 9/14/2015.
 */
public interface CdDisk {
    void play();
    String getArtist();
    String getTitle();
    List<String> getTracks();
    long getId();
    void setId(int id);
    void setArtist(String Artist);
    void setTitle(String title);
}
