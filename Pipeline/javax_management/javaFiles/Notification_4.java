import javax.management.Notification;
import javax.management.NotificationBroadcaster;

public class Notification_4 {
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
        long sequenceNumber = notification.getSequenceNumber();

        System.out.println("Sequence Number: " + sequenceNumber);
    }
}
