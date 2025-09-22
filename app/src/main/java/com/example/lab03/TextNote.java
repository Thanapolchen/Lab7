package com.example.lab03;

public class TextNote extends Note{
    //Attribute
    private  String textContent;

    public TextNote() {
        super();
    }

    //getter method
    public String getTextContent(){
        return textContent;
    }

    //setter method
    public void setTextContent(String newContent){
        this.textContent = newContent;


    }


    //Method
    public String display(){
        return title+":"+textContent+"("+dateCreated+")";
        //System.out.println(title+":"+content+"("+createdDate+")");
    }
}