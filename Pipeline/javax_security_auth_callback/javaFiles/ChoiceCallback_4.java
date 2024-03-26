import javax.security.auth.callback.ChoiceCallback;

public class ChoiceCallback_4 {
    public static void main(String[] args) {
        ChoiceCallback choiceCallback = new ChoiceCallback("Choose an option:", new String[]{"Option 1", "Option 2"});
        System.out.println(choiceCallback.getPrompt());
    }
}
