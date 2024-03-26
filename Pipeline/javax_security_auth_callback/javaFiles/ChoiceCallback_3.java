import javax.security.auth.callback.ChoiceCallback;

public class ChoiceCallback_3 {
    public static void main(String[] args) {
        ChoiceCallback choiceCallback = new ChoiceCallback("Choose an option:", new String[]{"Option 1", "Option 2", "Option 3"});
        String[] choices = choiceCallback.getChoices();
        for (String choice : choices) {
            System.out.println(choice);
        }
    }
}
