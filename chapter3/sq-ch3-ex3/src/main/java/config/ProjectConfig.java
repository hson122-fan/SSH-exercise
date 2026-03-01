package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Configuration;

import program.Parrot;
import program.Person;

@Configuration
public class ProjectConfig {
    
    @Bean
    Parrot parrot(){
        Parrot p = new Parrot();
        p.setName("This is parrot 1");
        return p;
    }

    @Bean
    @Primary
    Parrot parrot2() {
        Parrot p = new Parrot();
        p.setName("this is parrot 2");
        return p;
    }

    @Bean
    public Person person(Parrot parrot1){
        Person p = new Person();
        p.setName("Ella");
        p.setParrot(parrot1);
        return p;
    }
}
