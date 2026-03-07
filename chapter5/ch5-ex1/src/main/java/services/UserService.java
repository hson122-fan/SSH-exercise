package services;

import org.springframework.stereotype.Service;
import controls.*;
import models.Comment;

@Service
public class UserService {
    private final CommentRepository repo;

    public UserService(CommentRepository repo){
        this.repo = repo;
    }

    public void userComment(Comment cmt){
        this.repo.storeComment(cmt);
    }
}
