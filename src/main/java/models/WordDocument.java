package models;
import interfaces.Document;

public class WordDocument implements Document {
    @Override
    public void display(){
        System.out.println("Displaying Word Document...");
    }
}
