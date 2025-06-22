public class WordDocumentFactory extends DocumentFactory{
    public Document CreateDocument(){
        System.out.println("CREATING A WORD DOCUMENT FROM THE \"WORD DOCUMENT FACTORY\"");
        return new WordDocument().create();
    }
}
