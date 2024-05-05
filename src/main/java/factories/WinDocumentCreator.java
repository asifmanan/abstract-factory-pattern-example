package factories;

import interfaces.Document;
import interfaces.DocumentCreator;
import models.PdfDocument;
import models.WinWordDocument;

public class WinDocumentCreator implements DocumentCreator {
    private Document document;
    @Override
    public Document createWordDocument() {
        document = new WinWordDocument();
        return document;
    }

    @Override
    public Document createPdfDocument() {
        document = new PdfDocument();
        return document;
    }
}
