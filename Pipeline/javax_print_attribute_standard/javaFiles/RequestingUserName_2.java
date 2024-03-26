import javax.print.attribute.standard.RequestingUserName;

public class RequestingUserName_2 {
    public static void main(String[] args) {
        RequestingUserName userName = new RequestingUserName("John Doe");
        System.out.println("User Name: " + userName.getName());
    }
}
