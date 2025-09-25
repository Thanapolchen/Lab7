package com.example.lab03;

import java.util.Date;

public class Note {
    //Attribute
    public String title;
    public Date dateCreated;
    public User owner;
    public java.sql.Date createdDate;

    //getter method
    public String getTitle(){
        return title;
    }
    public Date getDateCreated(){
        return dateCreated;
    }
    public User getUser(){
        return owner;
    }
    //setter method
    public void setTitle(String newTitle){
        this.title = newTitle;

    }
    public void getDateCreated(Date newCreatedDate){
        this.dateCreated=newCreatedDate;
    }
    public void setOwner(User owner) {
        this.owner = owner;
    }

    //Method
    public String getSummary() {
        return null;
    }

    //System.out.println(title+":"+content+"("+createdDate+")");

    public String display() {
        return null;
    }

}