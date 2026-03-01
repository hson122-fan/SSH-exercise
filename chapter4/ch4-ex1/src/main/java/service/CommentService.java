package service;

import models.*;
import controls.*;

public class CommentService {
    
    private final CommentNotificationProxy send;
    private final CommentRepository repo;

    public CommentService(CommentNotificationProxy send, CommentRepository repo){
        this.send = send;
        this.repo = repo;

    }
    public void publishComment(Comment comment){
        send.sendComment(comment);
        repo.storeComment(comment);
    }
}
