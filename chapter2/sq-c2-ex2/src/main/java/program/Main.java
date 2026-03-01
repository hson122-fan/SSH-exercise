package program;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = 
            new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot p = context.getBean(Parrot.class);
        int ten = context.getBean(Integer.class);
        String smile = context.getBean(String.class);

        System.out.println(p.getName());
        System.out.println(ten);
        System.out.println(smile);
    }
}