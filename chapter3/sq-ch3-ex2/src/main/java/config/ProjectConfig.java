package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import program.Parrot;
import program.Person;

@Configuration
public class ProjectConfig {
    
    @Bean
    Parrot parrot(){
        Parrot p = new Parrot();
        p.setName("Keke");
        return p;
    }

    Parrot parrot2() {
        Parrot p = new Parrot(0);
        p.setName("this is not an bean instanci");
        return p;
    }

    @Bean
    public Person person(){
        Person p = new Person();
        p.setName("Ella");
        p.setParrot(parrot2());
        return p;
    }
}
