import javax.management.Notification;
import javax.management.NotificationBroadcaster;

public class Notification_11 {
    public static void main(String[] args) {
        NotificationBroadcaster broadcaster = new NotificationBroadcaster() {
            @Override
            public void sendNotification(Notification notification) {
                System.out.println("Notification sent: " + notification);
            }
        };

        Notification notification = new Notification("Test", this, 0, System.currentTimeMillis(), "Test notification");
        notification.setSource(broadcaster);

        broadcaster.sendNotification(notification);
    }
}
