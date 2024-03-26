import javax.xml.bind.Unmarshaller;
import java.util.ArrayList;
import java.util.List;

public class Unmarshaller_Listener_1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Unmarshaller.Listener listener = new Unmarshaller.Listener() {
            @Override
            public void beforeUnmarshal(Object target, Object parent) {
                System.out.println("Before unmarshalling: " + target + ", " + parent);
            }
        };
        list.add("Hello");
        System.out.println(list);
    }
}
