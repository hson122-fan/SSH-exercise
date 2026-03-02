package services;

import models.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import controls.*;

@Component
public class CommentService {
    
    private final CommentNotificationProxy send;
    private final CommentRepository repo;

    @Autowired //if have one constructor in the class, the @Autowired annotation is optional
    public CommentService(CommentNotificationProxy send, CommentRepository repo){
        this.send = send;
        this.repo = repo;

    }
    public void publishComment(Comment comment){
        send.sendComment(comment);
        repo.storeComment(comment);
    }
}
