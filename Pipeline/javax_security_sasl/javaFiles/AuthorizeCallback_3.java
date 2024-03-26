import javax.security.sasl.AuthorizeCallback;

public class AuthorizeCallback_3 {
    public static void main(String[] args) {
        AuthorizeCallback callback = new AuthorizeCallback() {
            @Override
            public void setAuthorized(boolean authorized) {
                System.out.println("Authorization status: " + authorized);
            }
        };

        // Use the callback
        callback.setAuthorized(true);
    }
}
