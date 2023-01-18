package Springdemo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("Springdemo")
@PropertySource("classpath:Springdemo/sport.properties")
public class SportConfig {

    @Bean
    public FortuneService sadFortuneService(){
        return new SadFortuneService();
    }
    // define bean for our swim coach AND inject dependency
    @Bean
    public Coach swimCoach(){
        return new SwimCoach(sadFortuneService());
    }
}
