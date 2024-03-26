import javax.accessibility.AccessibleRelationSet;

public class AccessibleRelationSet_3 {
    public static void main(String[] args) {
        AccessibleRelationSet set = new AccessibleRelationSet();
        set.add(AccessibleRelation.LABEL_FOR);
        set.add(AccessibleRelation.DESCRIBED_BY);
        System.out.println("Before clear: " + set);
        set.clear();
        System.out.println("After clear: " + set);
    }
}
