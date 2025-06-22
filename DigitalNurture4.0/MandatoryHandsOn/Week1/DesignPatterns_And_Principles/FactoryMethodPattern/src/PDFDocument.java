public class PDFDocument implements Document{
    public Document create(){
        System.out.println("Opening the Created PDF Document");
        return new PDFDocument();
    }
}
