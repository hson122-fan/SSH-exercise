package program;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main_ch3_ex5 {
    public static void main(String[] args) {
        var context = 
            new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person = context.getBean(Person.class);
        Parrot parrot = context.getBean("parrot1", Parrot.class);
        if(person.getParrot().equals(parrot)){
            System.out.println("same same\n" + parrot.getName());
        }
        else{
            System.out.println("same same but different\n" + parrot.getName());
        }

        

    }
}