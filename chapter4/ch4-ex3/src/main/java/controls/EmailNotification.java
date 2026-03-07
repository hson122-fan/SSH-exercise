package controls;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import models.Comment;

@Component
@Qualifier("EMAIL")
public class EmailNotification implements CommentNotificationProxy{
    
    @Override
    public void sendComment(Comment comment){
        System.out.println(comment + " - email sended");
    }
    
}
