package config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by dmakarov on 9/14/2015.
 */
@Configuration

//adding XML config file to context initialization
@ImportResource("classpath:xml_config.xml")
public class DIExplicitXMLConfig {
}
