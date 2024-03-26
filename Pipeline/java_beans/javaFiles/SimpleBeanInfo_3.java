import java.beans.*;

public class MyBeanInfo extends SimpleBeanInfo {

    public BeanInfo[] getAdditionalBeanInfo() {
        try {
            BeanDescriptor bd = getBeanDescriptor();
            bd.setValue(BeanDescriptor.PROPERTY_COUNT_PROPERTY, "propertyCount");
            bd.setValue(BeanDescriptor.PROPERTY_SUPPORT_PROPERTY, "propertySupport");

            PropertyDescriptor[] pds = getPropertyDescriptors();
            BeanInfo[] beanInfos = new BeanInfo[pds.length];

            for (int i = 0; i < pds.length; i++) {
                beanInfos[i] = new PropertyDescriptor(pds[i].getName(), getBeanClass());
            }

            return beanInfos;
        } catch (IntrospectionException e) {
            e.printStackTrace();
            return null;
        }
    }
}
