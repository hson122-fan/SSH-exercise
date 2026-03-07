package controls;
import org.springframework.stereotype.Repository;

import models.*;

@Repository
public class CommentRepository {

    private String name;

    public CommentRepository(){
        this.name = "Repo vo dich";
    }

    public void storeComment(Comment comment){
        System.out.println("Comment saved into " + this.name);
    }
}
