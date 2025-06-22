public abstract class DocumentFactory {
    abstract Document CreateDocument();
    public void process(){
        Document doc = CreateDocument();
        doc.create();
    }
}
