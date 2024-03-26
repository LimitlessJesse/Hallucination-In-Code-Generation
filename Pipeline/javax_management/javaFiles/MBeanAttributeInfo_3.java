import javax.management.MBeanAttributeInfo;

public class MBeanAttributeInfo_3 {
    public static void main(String[] args) {
        MBeanAttributeInfo attributeInfo = new MBeanAttributeInfo("name", "type", "description", true, false, false, false, null);
        boolean isReadOnly = attributeInfo.isIs();
        System.out.println("Is attribute read-only? " + isReadOnly);
    }
}
