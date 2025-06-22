public class Logger {
    private static Logger logger = new Logger();
    private Logger(){
        System.out.println("Logger instance created");
    }
    public static Logger getInstance(){
        return logger;
    }
}
