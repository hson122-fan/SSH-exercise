package config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import program.Parrot;
import program.Person;

@Configuration
@ComponentScan(basePackages = "program")
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
    public Person person(@Qualifier("parrot2") Parrot parrot){

        Person p = new Person();
        p.setName("Ella");
        p.setParrot(parrot);
        return p;
    }
}
