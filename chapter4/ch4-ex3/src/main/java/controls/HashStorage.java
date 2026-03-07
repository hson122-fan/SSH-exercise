package controls;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import models.Comment;

@Component
@Qualifier("HASH")
public class HashStorage implements CommentRepository {
    
    @Override
    public void storeComment(Comment comment){
        System.out.println("Comment saved by hash");
    }
}
