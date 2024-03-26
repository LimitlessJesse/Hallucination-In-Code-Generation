import javax.management.*;

public class NotificationBroadcasterSupport_2 {
    public static void main(String[] args) {
        NotificationBroadcasterSupport broadcaster = new NotificationBroadcasterSupport();

        // Create a NotificationListener
        NotificationListener listener = new NotificationListener() {
            @Override
            public void handleNotification(Notification notification, Object handback) {
                System.out.println("Notification received: " + notification);
            }
        };

        // Add the listener
        broadcaster.addNotificationListener(listener, null, null);

        // Remove the listener
        broadcaster.removeNotificationListener(listener);
    }
}
