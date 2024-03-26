import javax.management.Notification;
import javax.management.NotificationBroadcaster;

public class Notification_6 {
    public static void main(String[] args) {
        NotificationBroadcaster broadcaster = new NotificationBroadcaster() {
            @Override
            public void addNotificationListener(NotificationListener listener, NotificationFilter filter, Object handback) {
            }

            @Override
            public void removeNotificationListener(NotificationListener listener) {
            }
        };

        Notification notification = new Notification("Test", broadcaster, 0, System.currentTimeMillis(), "This is a test message");
        String message = notification.getMessage();
        System.out.println(message);
    }
}
