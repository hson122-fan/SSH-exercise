package user_service_program;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configs.ConfigProgram;
import models.Comment;
import services.CommentService;
import services.UserService;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ConfigProgram.class);

        var comment = context.getBean(CommentService.class);
        var user = context.getBean("userService", UserService.class);

        Comment cmt1 = new Comment("Son", "Im the one");

        comment.publishComment(cmt1);
        user.userComment(cmt1);
        System.out.println(cmt1);

    }
}