package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


import program.Parrot;

@Configuration
@ComponentScan(basePackages = "program")
public class ProjectConfig {
    
    @Bean
    Parrot parrot1(){
        Parrot p = new Parrot();
        p.setName("This is parrot 1");
        return p;
    }

    @Bean
    Parrot parrot2() {
        Parrot p = new Parrot();
        p.setName("this is parrot 2");
        return p;
    }
}
