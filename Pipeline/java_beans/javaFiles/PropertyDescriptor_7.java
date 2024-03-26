import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

public class PropertyDescriptor_7 {
    public static void main(String[] args) throws Exception {
        // Create a new PropertyDescriptor
        PropertyDescriptor pd = new PropertyDescriptor("bound", MyBean.class);

        // Get the write method
        Method writeMethod = pd.getWriteMethod();

        // Create a new instance of MyBean
        MyBean bean = new MyBean();

        // Set the bound
        writeMethod.invoke(bean, true);

        // Print the bound
        System.out.println(bean.isBound());
    }
}

class MyBean {
    private boolean bound;

    public boolean isBound() {
        return bound;
    }

    public void setBound(boolean bound) {
        this.bound = bound;
    }
}
