import javax.management.*;

public class NotificationBroadcasterSupport_3 {
    public static void main(String[] args) {
        NotificationBroadcasterSupport broadcaster = new NotificationBroadcasterSupport();

        // Register a listener
        NotificationListener listener = new NotificationListener() {
            public void handleNotification(Notification notification, Object handback) {
                System.out.println("Received notification: " + notification);
            }
        };
        broadcaster.addNotificationListener(listener, null, null);

        // Send a notification
        Notification notification = new Notification("TestNotification", new Object(), 0);
        broadcaster.sendNotification(notification);
    }
}
