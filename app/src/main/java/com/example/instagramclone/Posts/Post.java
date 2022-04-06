package com.example.instagramclone.Posts;

public class Post {
   public String userEmail;
   public String comment;
   public String downloadUrl;

    public Post (String userEmail,String comment,String downloadUrl){
        this.userEmail=userEmail;
        this.comment = comment;
        this.downloadUrl= downloadUrl;

    }
}
