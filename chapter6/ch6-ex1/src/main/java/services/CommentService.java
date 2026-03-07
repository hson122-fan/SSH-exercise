package services;

import java.util.logging.Logger;
import org.springframework.stereotype.Service;

import models.Comment;

@Service
public class CommentService {


    private Logger logger = Logger.getLogger(CommentService.class.getName());

    public void publishComment(Comment comment){
        logger.info("Publishing comment: " + comment.toString());
    }

    public void printSomething(){
        System.out.println("I'm print something");
    }

}
