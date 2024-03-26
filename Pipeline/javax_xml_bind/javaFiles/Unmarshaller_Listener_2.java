import javax.xml.bind.Unmarshaller;
import javax.xml.bind.Unmarshaller.Listener;

public class Unmarshaller_Listener_2 {
    public static void main(String[] args) {
        Unmarshaller unmarshaller =...; // initialize your unmarshaller
        unmarshaller.setListener(new Listener() {
            @Override
            public void afterUnmarshal(Object target, Object parent) {
                // your code here
                System.out.println("Unmarshalling completed for: " + target);
            }
        });
    }
}
