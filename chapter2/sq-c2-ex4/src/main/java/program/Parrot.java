package program;

import jakarta.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class Parrot {
    private String name;

    @PostConstruct
    public void init(){
        this.name = "kiki";
    }
    
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
