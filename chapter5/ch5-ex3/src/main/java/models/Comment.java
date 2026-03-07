package models;

public class Comment {
    private String context;
    private String author;
    private Boolean valid;

    public Comment(String author, String context){
        this.context = context;
        this.author = author;
        this.valid = false;
    }

    public String getComment(){
        return this.context;
    }

    public String getAuthor(){
        return this.author;
    }

    public void setValid(){
        if(!this.valid){
            this.valid = true;
        }
    }


    @Override
    public String toString(){
        return this.author + ": " + this.context + " -- " + this.valid;
    }
}
