import javax.management.Notification;
import javax.management.NotificationBroadcaster;

public class Notification_8 {
    public static void main(String[] args) {
        NotificationBroadcaster broadcaster = new NotificationBroadcaster() {
            @Override
            public void addNotificationListener(NotificationListener listener, NotificationFilter filter, Object handback) {
            }

            @Override
            public void removeNotificationListener(NotificationListener listener) {
            }
        };

        Notification notification = new Notification("Test", broadcaster, 0, System.currentTimeMillis(), "Test message", "Test user data");

        Object userData = notification.getUserData();
        System.out.println("User data: " + userData);
    }
}
