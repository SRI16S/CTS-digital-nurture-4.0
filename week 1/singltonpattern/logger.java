
public class logger{
    private static logger instance;
    private logger () {
        // Private constructor to prevent instantiation
        System.out.println("logger() constructor called");
    }    
    public static synchronized logger getInstance() {
        if (instance == null) {
            instance = new logger();
        }
        return instance;
    }
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}