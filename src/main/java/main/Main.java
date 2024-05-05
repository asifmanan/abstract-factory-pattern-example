package main;

import factories.MacDocumentCreator;
import factories.WinDocumentCreator;
import interfaces.Document;
import interfaces.DocumentCreator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DocumentCreator documentCreator=null;
        String osName = getOs();
        if(osName.equalsIgnoreCase("win")) {
            documentCreator = new WinDocumentCreator();
        }
        if (osName.equalsIgnoreCase("mac")) {
            documentCreator = new MacDocumentCreator();
        }
        if(documentCreator!=null) {
            Document wordDocument = documentCreator.createWordDocument();
            wordDocument.display();

            Document pdfDocument = documentCreator.createPdfDocument();
            pdfDocument.display();
        }


    }
    public static String getOs() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter OS Name: ");
        return scanner.nextLine();
    }
}
