package services;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import controls.*;
import models.Comment;


@Service
@Lazy
public class CommentService {
    
    private final CommentRepository repo;

    public CommentService(CommentRepository repo){
        this.repo = repo;
        System.out.println("I'm commentService");
    }

    public void publishComment(Comment cmt1){
        this.repo.storeComment(cmt1);
    }
}
