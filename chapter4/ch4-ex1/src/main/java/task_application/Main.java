package task_application;

import service.*;
import models.*;
import controls.*;

public class Main {
    public static void main(String[] args) {
        Comment com1 = new Comment("Son", "i'm the best");
        Comment com2 = new Comment("Anderson", "nah..I am");

        CommentNotificationProxy sender = new PrintCommnent();
        CommentRepository repo = new ArrayStorage();

        CommentService service = new CommentService(sender, repo);

        service.publishComment(com1);
        service.publishComment(com2);

    }
}