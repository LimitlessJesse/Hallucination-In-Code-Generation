import javax.management.openmbean.TabularDataSupport;
import javax.management.openmbean.CompositeData;

public class TabularDataSupport_5 {
    public static void main(String[] args) {
        TabularDataSupport tabularDataSupport = new TabularDataSupport();

        // Add some data
        tabularDataSupport.put("key1", "value1");
        tabularDataSupport.put("key2", "value2");

        System.out.println("Before clear: " + tabularDataSupport);

        // Clear all data
        tabularDataSupport.clear();

        System.out.println("After clear: " + tabularDataSupport);
    }
}
