package controls;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import models.*;

@Repository
@Lazy
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
