public class Logger {
    private static Logger instance = new Logger();
    private Logger(){
        System.out.println("New Logger Instance Created");
    };

    static Logger getLogger()
    {
        return instance;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }

}
