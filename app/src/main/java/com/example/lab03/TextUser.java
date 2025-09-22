package com.example.lab03;

public class TextUser extends User{
    //Attribute
    private String textName;

    //getter method
    public String getTextName() {
        return name;
    }

    //setter method
    public void setTextName(String newName) {
        this.textName = newName;
    }
    //Method
    public String  getSummary(){
        return name+":("+id+")";
    }

    // return System.out.println(name+","+id",");

}