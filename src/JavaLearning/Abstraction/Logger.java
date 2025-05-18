package JavaLearning.Abstraction;

public interface Logger {
        abstract void log (String msg);
        default void info (String msg) {
            System.out.println("INFO : " + msg );
        }
        static void help () {
            System.out.println("Logger Interface Help");
        }
}

class FileLogger implements Logger {

    @Override
    public void log(String msg) {
        System.out.println("Log : " + msg);
    }
}

class MainLogger {
    public static void main(String[] args) {
        FileLogger fileLogger = new FileLogger();
        fileLogger.info("You are a new Logger");

        Logger.help();
    }

}


