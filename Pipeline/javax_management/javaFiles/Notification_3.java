import javax.management.Notification;
import javax.management.NotificationBroadcaster;

public class Notification_3 {
    public static void main(String[] args) {
        NotificationBroadcaster broadcaster = new NotificationBroadcaster() {
            @Override
            public void addNotificationListener(NotificationListener listener, NotificationFilter filter, Object handback) {
            }

            @Override
            public void removeNotificationListener(NotificationListener listener) {
            }
        };

        Notification notification = new Notification("type", broadcaster, 0);
        String type = notification.getType();
        System.out.println("Type: " + type);
    }
}
