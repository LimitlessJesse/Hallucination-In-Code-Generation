import javax.management.MBeanAttributeInfo;

public class MBeanAttributeInfo_1 {
    public static void main(String[] args) {
        MBeanAttributeInfo attributeInfo = new MBeanAttributeInfo("name", "type", "description", true, false, false, false, null);
        boolean isReadable = attributeInfo.isReadable();
        System.out.println("Is attribute readable? " + isReadable);
    }
}
