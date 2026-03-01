package program;


public class Person {
    private String name;
    private Parrot parrot;

    // public Person(Parrot parrot){
    //     System.out.println("I'm a human");
    //     this.parrot = parrot;
        
    // }
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setParrot(Parrot parrot){
        this.parrot = parrot;
    }
    
    public Parrot getParrot(){
        return this.parrot;
    }
}
