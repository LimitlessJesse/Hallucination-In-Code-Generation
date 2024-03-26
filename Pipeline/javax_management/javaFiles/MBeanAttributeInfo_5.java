import javax.management.MBeanAttributeInfo;

public class MBeanAttributeInfo_5 {
    public static void main(String[] args) {
        MBeanAttributeInfo attributeInfo = new MBeanAttributeInfo("name", "type", "description", true, false, false);
        String type = attributeInfo.getType();
        System.out.println("Type: " + type);
    }
}
