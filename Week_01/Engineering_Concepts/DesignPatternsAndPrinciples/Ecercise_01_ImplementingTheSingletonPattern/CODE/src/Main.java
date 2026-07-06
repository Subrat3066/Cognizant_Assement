public class Main{
    public static void main(String[] args) {
        Logger logger1 = Logger.getLogger();
        Logger logger2 = Logger.getLogger();

        logger1.log("Message from logger1");
        logger2.log("Message from logger2");

        if (logger1 == logger2) {
            System.out.println("Singleton verified: Both references point to the same instance.");
        } else {
            System.out.println("Singleton failed: Different instances were created.");
        }
    }
}