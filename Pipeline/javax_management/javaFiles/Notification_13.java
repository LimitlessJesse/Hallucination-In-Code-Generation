import javax.management.Notification;
import javax.management.NotificationBroadcaster;

public class Notification_13 {
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
        notification.setTimeStamp(System.currentTimeMillis());
        System.out.println("Time stamp: " + notification.getTimeStamp());
    }
}
