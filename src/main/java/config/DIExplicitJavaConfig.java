package config;

import model.CdDisk;
import model.Player;
import model.aspects.DiskPlayAspect;
import model.impl.CdPlayer;
import model.impl.RummstainCD;
import model.impl.YellowSubmarine;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Profile;

/**
 * Created by dmakarov on 9/14/2015.
 */
@Configuration
@EnableAspectJAutoProxy
public class DIExplicitJavaConfig {
    @Bean(name="beatlesBean")
    /*
    @Qualifier creates custom qualifier that is type and refactor safe, and whpuld not be changed if YellowSubmarine class,
    would change.
     */
    @Qualifier("superPuperBean")
    @Profile("dev")
//    set master bean that will be injected if multiple beans (ambiguity) of that type exists in container
//    @Primary
    public CdDisk getBeatlesBean () {
        return new YellowSubmarine();
    }

    @Bean(name="rummstainBean")
    @Profile("test")
    public CdDisk getRummstainBean () {
        return new RummstainCD();
    }

//    automatic Bean injection due to Spring getBeatlesBean() interception;
//    @Bean(name = "CdPlayerBean")
//    public Player getCdPlayerBean () {
//        return new CdPlayer(getBeatlesBean());
//    }

    @Bean(name = "CdPlayerBean")
    public Player getCdPlayerBean (@Qualifier("superPuperBean")CdDisk disk) {
        return new CdPlayer(disk);
    }

    @Bean
    public DiskPlayAspect diskPlayAspect() {
        return new DiskPlayAspect();
    }


}
