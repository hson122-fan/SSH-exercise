package controls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import models.Comment;


@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentProcessor {

    @Autowired
    private CommentRepository repo;

    private Comment comment;

    public void setComment(Comment comment){
        this.comment = comment;
    }

    public Comment getComment(){
        return this.comment;

    }

    public void processComment(){
        this.comment.setValid();
        this.repo.storeComment(this.comment);
    }
    
}
