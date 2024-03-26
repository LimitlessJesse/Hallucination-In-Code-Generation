import javax.management.MBeanAttributeInfo;

public class MBeanAttributeInfo_2 {
    public static void main(String[] args) {
        MBeanAttributeInfo attributeInfo = new MBeanAttributeInfo("name", "java.lang.String", "description", true, false, false);
        boolean isWritable = attributeInfo.isWritable();
        System.out.println("Is attribute writable? " + isWritable);
    }
}
