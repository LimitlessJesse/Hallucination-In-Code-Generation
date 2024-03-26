import java.awt.Button;

public class Button_3 {
    public static void main(String[] args) {
        Button button = new Button("Click me");
        String label = button.getLabel();
        System.out.println("Button label: " + label);
    }
}
