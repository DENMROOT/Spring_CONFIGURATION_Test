package config;


import model.CdDisk;
import model.Player;
import model.impl.CdPlayer;
import model.impl.DefaultCdDisk;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * Created by dmakarov on 9/18/2015.
 */
@Configuration
@PropertySource("classpath:/property.txt")
public class PropertyConfig {
    @Autowired
    Environment env;

    @Bean
    public CdDisk getBeatlesBean (){
        return new DefaultCdDisk(env.getProperty("title"), env.getProperty("artist"));
    }

    @Bean(name = "CdPlayerBean")
    public Player getCdPlayerBean (CdDisk disk) {
        return new CdPlayer(disk);
    }
}
