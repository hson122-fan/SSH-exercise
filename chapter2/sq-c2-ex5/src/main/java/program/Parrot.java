package program;

public class Parrot {
    private String name;

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
