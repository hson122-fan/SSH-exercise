package services;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import controls.*;
import models.Comment;

@Service
public class UserService {
    private final CommentRepository repo;

    public UserService(CommentRepository repo){
        this.repo = repo;
        System.out.println("I'm userService");
    }

    public void userComment(Comment cmt){
        this.repo.storeComment(cmt);
    }

    
}
