import javax.security.auth.callback.ChoiceCallback;

public class ChoiceCallback_2 {
    public static void main(String[] args) {
        ChoiceCallback choiceCallback = new ChoiceCallback() {
            @Override
            public void setSelectedIndex(int index) {
                // Implement your logic here
                System.out.println("Selected index: " + index);
            }

            @Override
            public String getPrompt() {
                return "Choose an option";
            }

            @Override
            public String[] getChoices() {
                return new String[]{"Option 1", "Option 2", "Option 3"};
            }

            @Override
            public boolean isInputValueRequired() {
                return false;
            }
        };

        // Call the method
        choiceCallback.setSelectedIndex(1);
    }
}
