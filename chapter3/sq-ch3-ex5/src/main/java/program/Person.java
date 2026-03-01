package program;

import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name;
    private final Parrot parrot;

    public Person(Parrot parrot2){
        System.out.println("I'm a human");

        this.name = "Son";
        this.parrot = parrot2;
        
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    // public void setParrot(Parrot parrot){
    //     this.parrot = parrot;
    // }
    
    public Parrot getParrot(){
        return this.parrot;
    }
}
