package controls;


import org.springframework.stereotype.Component;

import models.*;

@Component
public class PrintCommnent implements CommentNotificationProxy{
    
    @Override
    public void sendComment(Comment comment){
        System.out.println(comment);
    }
}
