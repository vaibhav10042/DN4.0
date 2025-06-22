public class ExcelDocumentFactory extends DocumentFactory{
    public Document CreateDocument(){
        System.out.println("CREATING AN EXCEL DOCUMENT FROM THE \"EXCEL DOCUMENT FACTORY\"");
        return new ExcelDocument().create();
    }
}
