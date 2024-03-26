import java.nio.channels.spi.AbstractSelector;

public class AbstractSelector_2 {
    public static void main(String[] args) {
        AbstractSelector selector = AbstractSelector.provider();
        System.out.println(selector);
    }
}
