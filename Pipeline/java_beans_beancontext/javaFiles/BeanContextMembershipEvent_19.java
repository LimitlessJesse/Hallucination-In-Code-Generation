import java.beans.beancontext.BeanContextMembershipEvent;

public class BeanContextMembershipEvent_19 {
    public static void main(String[] args) {
        BeanContextMembershipEvent event = new BeanContextMembershipEvent(new Object(), "test");
        event.addBeanContextMembershipListener(e -> System.out.println("BeanContextMembershipEvent: " + e.getID()));
        event.addBeanContextMembershipListener(e -> System.out.println("BeanContextMembershipEvent size: " + e.size()));
    }
}
