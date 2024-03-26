import java.util.logging.ErrorManager;
import java.util.logging.Logger;

public class ErrorManager_1 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("MyLogger");
        ErrorManager errorManager = new ErrorManager() {
            @Override
            public void error(String message, Exception ex, int code) {
                System.out.println("Error: " + message);
                ex.printStackTrace();
                System.out.println("Error code: " + code);
            }
        };
        logger.setErrorManager(errorManager);

        try {
            // Some code that may throw an exception
            throw new Exception("Test exception");
        } catch (Exception e) {
            logger.log(java.util.logging.Level.SEVERE, "An error occurred", e);
        }
    }
}
