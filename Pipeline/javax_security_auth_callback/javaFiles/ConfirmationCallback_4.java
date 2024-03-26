import javax.security.auth.callback.ConfirmationCallback;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.UnsupportedCallbackException;
import java.io.IOException;

public class ConfirmationCallback_4 {
    public static void main(String[] args) {
        ConfirmationCallback callback = new ConfirmationCallback() {
            @Override
            public void confirm(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
                for (Callback callback : callbacks) {
                    if (callback instanceof ConfirmationCallback) {
                        System.out.println(((ConfirmationCallback) callback).getPrompt());
                    }
                }
            }
        };

        try {
            callback.confirm(new Callback[] { callback });
        } catch (IOException | UnsupportedCallbackException e) {
            e.printStackTrace();
        }
    }
}
