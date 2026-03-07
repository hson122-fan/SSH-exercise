package services;

import models.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import controls.*;

@Component
public class CommentService {
    
    private final CommentNotificationProxy noti;
    private final CommentRepository repo;

    public CommentService(@Qualifier("PUSH") CommentNotificationProxy noti
                            , @Qualifier("HASH") CommentRepository repo){
        
        this.noti = noti;
        this.repo = repo;
    }

    public void publishComment(Comment comment){
        noti.sendComment(comment);
        repo.storeComment(comment);
    }
}
