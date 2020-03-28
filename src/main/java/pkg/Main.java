package pkg;

import org.tinylog.Logger;

public class Main {

    public static void main(String[] args) {
        Logger.error("This is an error message");
        Logger.warn("This is a warn message");
        Logger.info("This is an info message");
        Logger.debug("This is a debug");
        Logger.trace("This is a trace");
        Logger.info("User's name is {}", System.getProperty("user.name"));
        LOgger.error(new RuntimeException("Ooops"), "Something is wrong");
    }
}
