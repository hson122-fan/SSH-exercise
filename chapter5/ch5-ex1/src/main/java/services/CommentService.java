package services;

import org.springframework.stereotype.Service;
import controls.*;
import models.Comment;


@Service
public class CommentService {
    
    private final CommentRepository repo;

    public CommentService(CommentRepository repo){
        this.repo = repo;
    }

    public void publishComment(Comment cmt1){
        this.repo.storeComment(cmt1);
    }
}
