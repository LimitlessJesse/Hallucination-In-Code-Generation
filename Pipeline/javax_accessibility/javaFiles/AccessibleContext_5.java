import javax.accessibility.AccessibleContext;
import javax.accessibility.AccessibleRole;

public class AccessibleContext_5 {
    public static void main(String[] args) {
        AccessibleContext context = new AccessibleContext() {
            @Override
            public AccessibleRole getAccessibleRole() {
                return AccessibleRole.PUSH_BUTTON;
            }
        };

        AccessibleRole role = context.getAccessibleRole();
        System.out.println("Accessible Role: " + role);
    }
}
