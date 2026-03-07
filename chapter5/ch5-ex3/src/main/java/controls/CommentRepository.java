package controls;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import models.*;

@Repository
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentRepository {

    private String name;

    public CommentRepository(){
        this.name = "Repo vo dich";
        System.out.println("I'm commentRepository");
    }

    public void storeComment(Comment comment){
        System.out.println("Comment saved into " + this.name);
    }
}
