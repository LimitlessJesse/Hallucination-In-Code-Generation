import javax.management.AttributeChangeNotification;
import javax.management.AttributeChangeNotificationFilter;
import javax.management.Notification;

public class AttributeChangeNotificationFilter_6 {
    public static void main(String[] args) {
        AttributeChangeNotificationFilter filter = new AttributeChangeNotificationFilter();
        Notification notification = new AttributeChangeNotification(
                this,
                0,
                System.currentTimeMillis(),
                "Attribute change",
                "Attribute",
                "String",
                "oldValue",
                "newValue"
        );
        boolean isEnabled = filter.isNotificationEnabled(notification);
        System.out.println("Is notification enabled: " + isEnabled);
    }
}
