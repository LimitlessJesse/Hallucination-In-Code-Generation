import javax.security.auth.callback.*;
import java.io.IOException;

public class TextOutputCallback_4 {
    public static void main(String[] args) {
        CallbackHandler handler = new CallbackHandler() {
            @Override
            public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
                for (Callback callback : callbacks) {
                    if (callback instanceof TextOutputCallback) {
                        TextOutputCallback textOutputCallback = (TextOutputCallback) callback;
                        String message = textOutputCallback.getMessage();
                        System.out.println(message);
                    }
                }
            }
        };

        try {
            handler.handle(new Callback[] { new TextOutputCallback("Hello, World!", false) });
        } catch (IOException | UnsupportedCallbackException e) {
            e.printStackTrace();
        }
    }
}
