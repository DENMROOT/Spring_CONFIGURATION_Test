package SpringDIAutoWiring.model.impl;

import SpringDIAutoWiring.model.CdDisk;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by dmakarov on 9/14/2015.
 */
@Component()
@Qualifier("yellowBean")
public class YellowSubmarine implements CdDisk {
    private String title = "Yellow Submarine";
    private String artist = "The beatles";

    public void play() {
        System.out.print(artist + ": " + title);
    }
}
