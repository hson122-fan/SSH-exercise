package program;

public class Parrot {
    private String name;
    
    public Parrot(){
        System.out.println("Parrot created");
        this.name = "Hola";
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
