
public class Testclass {
    public static void main(String[] args) {
        logger log1 = logger.getInstance();
        log1.log("This is a log message.");
        logger log2 = logger.getInstance();
        log2.log("This is another log message.");
        if (log1 == log2) {
            System.out.println("log1 and log2 are the same instance.");
        } else {
            System.out.println("log1 and log2 are different instances.");
        }
    }
}