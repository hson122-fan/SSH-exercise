package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import controls.*;
import models.Comment;

@Service
public class CommentService {

    @Autowired
    private ApplicationContext context;
    
    public void sendComment(Comment cmt){
        
        
        CommentProcessor cp = context.getBean(CommentProcessor.class); //avoid unique instance if injecting directly

        cp.setComment(cmt);
        cp.processComment();
        cmt = cp.getComment();
    }

}
