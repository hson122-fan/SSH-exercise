package services;

import java.util.logging.Logger;
import org.springframework.stereotype.Service;

import models.Comment;

@Service
public class CommentService {


    private Logger logger = Logger.getLogger("567567 class");
    
    public String publishComment(Comment comment){
        logger.info("Publishing comment: " + comment.toString());
        return "SUCCESS";
    }

}
