import java.util.logging.LogManager;

public class LogManager_2 {
    public static void main(String[] args) {
        LogManager logManager = LogManager.getLogManager();
        logManager.readConfiguration();
    }
}
