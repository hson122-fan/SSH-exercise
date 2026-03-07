package user_service_program;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configs.ConfigProgram;
import models.Comment;
import services.CommentService;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ConfigProgram.class);

        CommentService service = context.getBean(CommentService.class);

        Comment cmt = new Comment("Son", "I'm the best");
        service.deleteComment(cmt);
        // service.publishComment(cmt);
        // service.editComment(cmt);


    }
}