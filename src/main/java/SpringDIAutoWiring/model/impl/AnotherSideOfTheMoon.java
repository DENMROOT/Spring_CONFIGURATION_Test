package SpringDIAutoWiring.model.impl;

import SpringDIAutoWiring.model.CdDisk;
import org.springframework.stereotype.Component;

/**
 * Created by dmakarov on 9/14/2015.
 */
@Component ("anotherSideOfTheMoon")
public class AnotherSideOfTheMoon implements CdDisk {
    private String title = "Another side of the moon";
    private String artist = "The beatles";

    public void play() {
        System.out.print(artist + ": " + title);
    }
}
