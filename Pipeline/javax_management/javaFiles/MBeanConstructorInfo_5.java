import javax.management.MBeanConstructorInfo;

public class MBeanConstructorInfo_5 {
    public static void main(String[] args) {
        MBeanConstructorInfo constructorInfo1 = new MBeanConstructorInfo(new String[]{"arg1", "arg2"}, "description1");
        MBeanConstructorInfo constructorInfo2 = new MBeanConstructorInfo(new String[]{"arg1", "arg2"}, "description1");

        System.out.println(constructorInfo1.equals(constructorInfo2)); // Output: true
    }
}
