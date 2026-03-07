package services;

import java.util.logging.Logger;
import org.springframework.stereotype.Service;

import aspects.ToLog;
import models.Comment;

@Service
public class CommentService {


    private Logger logger = Logger.getLogger("567567 class");
    
    public void publishComment(Comment comment){
        logger.info("Publishing comment: " + comment.toString());
    }

    @ToLog
    public void deleteComment(Comment cmt){
        logger.info("Deleting comment: " + cmt.toString());
    }

    @ToLog
    public void editComment(Comment comment){
        logger.info("Editing comment: " + comment.toString());
    }

}
