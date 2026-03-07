package user_service_program;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configs.ConfigProgram;
import models.Comment;
import services.CommentService;
import services.UserService;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ConfigProgram.class);

        var cmt01 = context.getBean(CommentService.class);
        var cmt02 = context.getBean(UserService.class);

        System.out.println(cmt01.getClass().getName());


    }
}