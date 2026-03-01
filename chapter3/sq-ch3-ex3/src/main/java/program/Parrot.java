package program;

import org.springframework.stereotype.Component;

@Component
public class Parrot {
    private String name;
    
    public Parrot(){
        System.out.println("Parrot created");
    }
    public Parrot(int i){
        if(i == 0){
            System.out.println("this is not a bean created");
        }
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString(){
        return "Parrot: " + this.name;
    }
}
