public class System_5 {
    public static void main(String[] args) {
        String key = "java.version";
        String value = System.getProperty(key);
        System.out.println("The value of the system property " + key + " is " + value);
    }
}
