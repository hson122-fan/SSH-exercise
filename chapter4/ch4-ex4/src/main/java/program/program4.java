package program;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.*;
import models.Comment;
import services.CommentService;

public class program4 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ConfigProgram.class);

        Comment comment = new Comment("Anderson", "Nah..I am");
        CommentService service = context.getBean(CommentService.class);
        service.publishComment(comment);
    }
}