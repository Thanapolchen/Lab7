package com.example.lab03;

public abstract class User {
    //Attribute
    String name;
    String id ;

    //getter method
    public String getName(){
        return  name;
    }

    public String getId(){
        return id;
    }

    //setter method
    public void setName(String newName){
        this.name = newName;
    }

    public void setId(String newId){
        this.id = newId;
    }

    //Method
    abstract public String  getSummary();

    //System.out.println(name+":"+id":");


}