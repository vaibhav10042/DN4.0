
public class PDFDocumentFactory extends DocumentFactory{
    public Document CreateDocument(){
        System.out.println("CREATING A PDF DOCUMENT FROM THE \"PDF DOCUMENT FACTORY\"");
        return new PDFDocument().create();
    }
}
