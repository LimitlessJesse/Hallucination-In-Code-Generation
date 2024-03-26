import java.beans.*;
import java.lang.reflect.Method;

public class SimpleBeanInfo_4 {
    public static void main(String[] args) {
        SimpleBeanInfo beanInfo = new SimpleBeanInfo() {
            @Override
            public MethodDescriptor[] getMethodDescriptors() {
                try {
                    Method[] methods = getBeanClass().getMethods();
                    MethodDescriptor[] descriptors = new MethodDescriptor[methods.length];
                    for (int i = 0; i < methods.length; i++) {
                        Method method = methods[i];
                        descriptors[i] = new MethodDescriptor(method);
                    }
                    return descriptors;
                } catch (IntrospectionException e) {
                    e.printStackTrace();
                }
                return null;
            }
        };

        MethodDescriptor[] methodDescriptors = beanInfo.getMethodDescriptors();
        for (MethodDescriptor descriptor : methodDescriptors) {
            System.out.println(descriptor.getName() + ": " + descriptor.getShortDescription());
        }
    }
}
