import javax.security.auth.callback.PasswordCallback;
import javax.security.auth.callback.CallbackHandler;
import java.io.IOException;

public class PasswordCallback_1 {
    public static void main(String[] args) {
        CallbackHandler handler = new CallbackHandler() {
            @Override
            public void handle(java.security.auth.callback.Callback[] callbacks) throws IOException, UnsupportedCallbackException {
                for (java.security.auth.callback.Callback callback : callbacks) {
                    if (callback instanceof PasswordCallback) {
                        PasswordCallback pc = (PasswordCallback) callback;
                        pc.setPassword("password".toCharArray());
                    }
                }
            }
        };
    }
}
