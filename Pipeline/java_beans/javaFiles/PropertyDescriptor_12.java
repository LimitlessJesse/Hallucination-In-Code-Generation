import java.beans.PropertyDescriptor;
import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.SimpleBeanInfo;

public class PropertyDescriptor_12 {
    public static void main(String[] args) throws IntrospectionException {
        BeanInfo beanInfo = new SimpleBeanInfo();
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();

        for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
            System.out.println("Property: " + propertyDescriptor.getName());
            System.out.println("Is bound: " + propertyDescriptor.isBound());
        }
    }
}
