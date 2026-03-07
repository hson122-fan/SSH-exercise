package controls;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import models.*;

@Component
@Qualifier("PUSH")
public class PushNotification implements CommentNotificationProxy{
    
    @Override
    public void sendComment(Comment comment){
        System.out.println(comment + " - pushed comment");
    }
}
