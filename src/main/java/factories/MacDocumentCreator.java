package factories;

import interfaces.Document;
import interfaces.DocumentCreator;
import models.MacWordDocument;
import models.PdfDocument;

public class MacDocumentCreator implements DocumentCreator {
    private Document document;
    @Override
    public Document createWordDocument() {
        document = new MacWordDocument();
        return document;
    }

    @Override
    public Document createPdfDocument() {
        document = new PdfDocument();
        return document;
    }
}
