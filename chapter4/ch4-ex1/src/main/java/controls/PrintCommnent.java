package controls;


import models.*;
public class PrintCommnent implements CommentNotificationProxy{
    


    @Override
    public void sendComment(Comment comment){
        System.out.println(comment);
    }
}
