package controls;

import models.*;
import java.util.ArrayList;

public class ArrayStorage implements CommentRepository{ 


    private ArrayList<Comment> comments;

    public ArrayStorage(){
        this.comments = new ArrayList<>();
    }

    @Override
    public void storeComment(Comment comment){
        this.comments.add(comment);
    }
    
    public ArrayList<Comment> getComments(){
        return (ArrayList<Comment>)this.comments.clone();
    }
}
