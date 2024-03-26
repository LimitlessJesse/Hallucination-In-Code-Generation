import javax.management.Notification;
import javax.management.NotificationFilterSupport;

public class NotificationFilterSupport_1 {
    public static void main(String[] args) {
        NotificationFilterSupport filter = new NotificationFilterSupport();
        Notification notification = new Notification("type", new Object(), 0, System.currentTimeMillis(), "message");
        boolean isEnabled = filter.isNotificationEnabled(notification);
        System.out.println("Is notification enabled? " + isEnabled);
    }
}
