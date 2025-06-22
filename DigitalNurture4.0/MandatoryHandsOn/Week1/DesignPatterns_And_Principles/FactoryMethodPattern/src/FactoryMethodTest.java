public class FactoryMethodTest {
    public static void main(String[] args) {
        System.out.println("---Factory Method Pattern Testing---");
        DocumentFactory wordDoc = new WordDocumentFactory();
        wordDoc.CreateDocument();
        DocumentFactory excelDoc = new ExcelDocumentFactory();
        excelDoc.CreateDocument();
        DocumentFactory pdfDoc = new PDFDocumentFactory();
        pdfDoc.CreateDocument();
        System.out.print("All The Documents Have Been Created From The Factory");
    }
}