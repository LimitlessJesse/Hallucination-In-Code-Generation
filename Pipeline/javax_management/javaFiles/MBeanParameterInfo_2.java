import javax.management.MBeanParameterInfo;

public class MBeanParameterInfo_2 {
    public static void main(String[] args) {
        MBeanParameterInfo parameterInfo = new MBeanParameterInfo("name", "type", "description", false, false);
        String type = parameterInfo.getType();
        System.out.println("Type of the parameter: " + type);
    }
}
