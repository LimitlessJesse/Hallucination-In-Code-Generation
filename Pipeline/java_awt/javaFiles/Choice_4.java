import java.awt.Choice;

public class Choice_4 {
    public static void main(String[] args) {
        Choice choice = new Choice();
        choice.add("Item 1");
        choice.add("Item 2");
        choice.add("Item 3");

        int itemCount = choice.getItemCount();
        System.out.println("Number of items: " + itemCount);
    }
}
