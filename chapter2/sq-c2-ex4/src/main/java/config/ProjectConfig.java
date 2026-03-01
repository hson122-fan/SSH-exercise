package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import program.Parrot;


@Configuration
@ComponentScan(basePackages = "program")
public class ProjectConfig {
    
    // @Bean
    // Parrot parrot1(){
    //     var p = new Parrot();
    //     p.setName("KoKo");
    //     return p;
    // }

    // @Bean(name = "jaja")
    // @Primary
    // Parrot parrot2(){
    //     var p = new Parrot();
    //     p.setName("a");
    //     return p;
    // }

    // @Bean(value = "baba")
    // Parrot parrot3(){
    //     var p = new Parrot();
    //     p.setName("b");
    //     return p;
    // }

    // @Bean
    // int number_10(){
    //     return 10;
    // }

    // @Bean
    // String string_of_smile(){
    //     return "ahahahaha";
    // }
}
