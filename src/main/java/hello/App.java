package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    public enum Level {
        HIGH,
        MEDIUM,
        LOW
    }

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(App.class);
        System.out.println("----------app----------");
        Level level = Level.LOW;
        switch (level) {
            case HIGH   :
                System.out.println("this is HIGH");
                break;
            case MEDIUM :
                System.out.println("this is MEDIUM");
                break;
            case LOW    :
                System.out.println("this is LOW");
                break;
        }
        System.out.println("----------app end----------");
    }

}
