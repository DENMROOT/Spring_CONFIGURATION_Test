package SpringDIXMLConfig;

import config.DIExplicitXMLConfig;
import model.CdDisk;
import model.impl.CdPlayer;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by dmakarov on 9/14/2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DIExplicitXMLConfig.class)
public class CdDiskXMLConfigTest {
    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Autowired
    private CdDisk cdDisk1;

    @Autowired
    private CdPlayer cdPlayer1;

    @Test
    public void cdShouldNotBeNull () {
        assertNotNull(cdDisk1);
    }

    @Test
    public void cdPlayerCdDiskShouldnotBeNull () {
        assertNotNull(cdPlayer1.getDisk());
    }

    @Test
    public void cdPlayerShouldPlayCdDisk () {
        cdPlayer1.playDisk();
        assertEquals("Metallica" + ": Hardcore" + "", log.getLog());
    }

    @Test
    public void cdDiskShouldContainTracksList(){
        assertEquals(cdDisk1.getTracks().size(),3);
    }

}
