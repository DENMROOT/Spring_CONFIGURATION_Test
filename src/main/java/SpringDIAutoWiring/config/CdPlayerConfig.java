package SpringDIAutoWiring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by dmakarov on 9/14/2015.
 */
@Configuration

/* DifferentVariants of component scan: package name, package name Array, concrete class,interfaces name
@ComponentScan ("SpringDIAutoWiring.model")
 */
//@ComponentScan (basePackageClasses = {CdDisk.class, Player.class})
@ComponentScan(basePackages = {"SpringDIAutoWiring.model"})
public class CdPlayerConfig {
}
