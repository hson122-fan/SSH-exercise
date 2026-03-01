package models;

public class Comment {
    private String context;
    private String author;

    public Comment(String author, String context){
        this.context = context;
        this.author = author;
    }

    public String getComment(){
        return this.context;
    }

    public String getAuthor(){
        return this.author;
    }

    @Override
    public String toString(){
        return this.author + ": " + this.context;
    }
}
