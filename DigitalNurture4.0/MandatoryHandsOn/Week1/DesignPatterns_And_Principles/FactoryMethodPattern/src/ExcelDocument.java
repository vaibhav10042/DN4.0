public class ExcelDocument implements Document{
    public Document create(){
        System.out.println("Opening The Created Excel Document");
        return new ExcelDocument();
    }
}
