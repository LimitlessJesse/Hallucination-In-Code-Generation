import javax.accessibility.AccessibleStateSet;

public class AccessibleStateSet_3 {
    public static void main(String[] args) {
        AccessibleStateSet stateSet = new AccessibleStateSet();
        stateSet.add(AccessibleStateSet.State.ACTIVE);
        stateSet.add(AccessibleStateSet.State.CHECKED);
        System.out.println("Initial state set: " + stateSet);

        stateSet.clear();
        System.out.println("State set after clear: " + stateSet);
    }
}
