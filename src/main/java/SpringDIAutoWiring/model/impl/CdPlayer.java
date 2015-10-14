package SpringDIAutoWiring.model.impl;

import SpringDIAutoWiring.model.CdDisk;
import SpringDIAutoWiring.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by dmakarov on 9/14/2015.
 */
@Component ("cdPlayer")
public class CdPlayer implements Player {

    private CdDisk disk;

    @Autowired

    public CdPlayer(@Qualifier("yellowBean")CdDisk disk) {
        this.disk = disk;
    }

    public CdDisk getDisk() {
        return disk;
    }

    public void setDisk(CdDisk disk) {
        this.disk = disk;
    }

    public void playDisk() {
        this.disk.play();
    }
}
