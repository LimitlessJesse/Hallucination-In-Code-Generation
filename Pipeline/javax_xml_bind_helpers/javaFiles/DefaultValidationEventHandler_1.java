import javax.xml.bind.ValidationEvent;
import javax.xml.bind.helpers.DefaultValidationEventHandler;

public class DefaultValidationEventHandler_1 {
    public static void main(String[] args) {
        DefaultValidationEventHandler handler = new DefaultValidationEventHandler();
        ValidationEvent event = new ValidationEvent() {
            @Override
            public ValidationEventLocator getLocator() {
                return null;
            }

            @Override
            public String getMessage() {
                return null;
            }

            @Override
            public Throwable getLinkedException() {
                return null;
            }

            @Override
            public Source getLocatorSource() {
                return null;
            }

            @Override
            public boolean isFatal() {
                return false;
            }

            @Override
            public boolean isAssociated() {
                return false;
            }

            @Override
            public String getResource() {
                return null;
            }

            @Override
            public String getID() {
                return null;
            }

            @Override
            public String getType() {
                return null;
            }
        };
        boolean handled = handler.handleEvent(event);
        System.out.println("Event handled: " + handled);
    }
}
