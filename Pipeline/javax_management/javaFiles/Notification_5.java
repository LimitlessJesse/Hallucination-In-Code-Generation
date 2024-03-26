import javax.management.Notification;
import javax.management.NotificationBroadcaster;

public class Notification_5 {
    public static void main(String[] args) {
        NotificationBroadcaster broadcaster = new NotificationBroadcaster() {
            @Override
            public void addNotificationListener(NotificationListener listener, NotificationFilter filter, Object handback) {
            }

            @Override
            public void removeNotificationListener(NotificationListener listener) {
            }
        };

        Notification notification = new Notification("Test", broadcaster, System.currentTimeMillis());
        long timeStamp = notification.getTimeStamp();

        System.out.println("Time stamp: " + timeStamp);
    }
}
