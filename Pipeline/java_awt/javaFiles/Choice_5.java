import java.awt.Choice;

public class Choice_5 {
    public static void main(String[] args) {
        Choice choice = new Choice();
        choice.add("Item 1");
        choice.add("Item 2");
        choice.add("Item 3");

        String item = choice.getItem(1); // This will get the second item in the Choice
        System.out.println(item); // Outputs: Item 2
    }
}
