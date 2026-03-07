package controls;

import models.*;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("ARRAY")
public class ArrayStorage implements CommentRepository{ 


    @Override
    public void storeComment(Comment comment){
        System.out.println("Comment saved by array");
    }
}
