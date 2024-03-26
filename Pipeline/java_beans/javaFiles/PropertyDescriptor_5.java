import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class PropertyDescriptor_5 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");

        PropertyDescriptor pd = new PropertyDescriptor("size", ArrayList.class);
        Method readMethod = pd.getReadMethod();
        pd.setReadMethod(readMethod);

        int size = (int) readMethod.invoke(list);
        System.out.println("Size of the list: " + size);
    }
}
