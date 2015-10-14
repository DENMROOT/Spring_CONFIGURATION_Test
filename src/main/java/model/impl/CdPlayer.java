package model.impl;

import model.CdDisk;
import model.Player;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * Created by dmakarov on 9/14/2015.
 */
@Component ("cdPlayer")
@Entity
@Table(name = "CD_PLAYER")
public class CdPlayer implements Player {
    @Id
    @Column (name = "CD_PLAYER_ID")
    private long id;

    @OneToOne
    private CdDisk disk;

    public CdPlayer(CdDisk disk) {
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
