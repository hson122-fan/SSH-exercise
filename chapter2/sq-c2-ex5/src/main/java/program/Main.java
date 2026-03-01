package program;

import config.ProjectConfig;

import java.util.function.Supplier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = 
            new AnnotationConfigApplicationContext(ProjectConfig.class);

            Parrot x = new Parrot();
            x.setName("hola");

            Supplier<Parrot> parrot_supplier = () -> x;

            context.registerBean("parrot1",
                        Parrot.class,
                        parrot_supplier
            );

            Parrot x2 = new Parrot();
            x2.setName("holalaho");

            Supplier<Parrot> parrot_supplier2 = () -> x2;

            context.registerBean("parrot12",
                        Parrot.class,
                        parrot_supplier2,
                        bc -> bc.setPrimary(true)
            );
            
            Parrot p = context.getBean(Parrot.class);
            if(p.equals(x)){
                System.out.println("true");
            }
            System.out.println(p.getName());

    }
}