//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SingletonTest {
    public static void main(String[] args) {
        System.out.println("---Singleton Logger Testing---");
        Logger logger = Logger.getInstance();
        System.out.println("Logger created successfully");
        Logger logger1 = Logger.getInstance();
        System.out.println("Logger1 created successfully");

        System.out.println("Verifying both the logger");
        System.out.println(logger == logger1);

        System.out.println("No different instance is created");
        System.out.print("---End of Testing---");
    }
}