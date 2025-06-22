public class WordDocument implements Document{
    public Document create(){
        System.out.println("Opening the Created Word Document");
        return new WordDocument();
    }

}
