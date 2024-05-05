package models;
import interfaces.Document;

public class PdfDocument implements Document {
    @Override
    public void display() {
        System.out.println("Displaying PDF Document...");
    }
}
