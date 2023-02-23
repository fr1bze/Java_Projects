import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class Main {
    private static void configureLogging() {
        Logger LOGGER1 = Logger.getLogger("org.example.java.logging.ClassA");
        LOGGER1.setLevel(Level.ALL);
        Logger LOGGER2 = Logger.getLogger("org.example.java.logging.ClassB");
        LOGGER2.setLevel(Level.WARNING);
        Logger LOGGER3 = Logger.getLogger("org.stepic.java");

        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        handler.setFormatter(new XMLFormatter());
        LOGGER3.addHandler(handler);
        LOGGER3.setUseParentHandlers(false);
    }


}
