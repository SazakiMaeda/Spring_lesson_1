package lesson1.newTest.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("lesson1.newTest")
@PropertySource("classpath:compComponents.properties")
public class SpringConfig {
}
