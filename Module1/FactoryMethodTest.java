interface Document {
    void open();
}

class WordDocument implements Document {
    public void open() {
        System.out.println("Opening Microsoft Word Document.");
    }
}

class PdfDocument implements Document {
    public void open() {
        System.out.println("Opening PDF Document.");
    }
}

class ExcelDocument implements Document {
    public void open() {
        System.out.println("Opening Excel Spreadsheet.");
    }
}

abstract class DocumentFactory {
    public abstract Document createDocument();

    public void openDocument() {
        Document document = createDocument();
        document.open();
    }
}

class WordDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new WordDocument();
    }
}

class PdfDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new PdfDocument();
    }
}

class ExcelDocumentFactory extends DocumentFactory {
    public Document createDocument() {
        return new ExcelDocument();
    }
}

public class FactoryMethodTest {
    public static void main(String[] args) {

        DocumentFactory wordFactory = new WordDocumentFactory();
        wordFactory.openDocument();

        DocumentFactory pdfFactory = new PdfDocumentFactory();
        pdfFactory.openDocument();

        DocumentFactory excelFactory = new ExcelDocumentFactory();
        excelFactory.openDocument();
    }
}