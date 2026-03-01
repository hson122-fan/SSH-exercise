package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import program.Parrot;

@Configuration
public class ProjectConfig {
    
    @Bean
    Parrot parrot(){
        var p = new Parrot();
        p.setName("KoKo");
        return p;
    }

    @Bean
    int number_10(){
        return 10;
    }

    @Bean
    String string_of_smile(){
        return "ahahahaha";
    }
}
