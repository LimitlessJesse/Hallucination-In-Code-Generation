import java.lang.ref.SoftReference;

public class SoftReference_1 {
    public static void main(String[] args) {
        String str = "Hello, World!";
        SoftReference<String> softRef = new SoftReference<>(str);

        // Get the object
        String obj = softRef.get();

        // Print the object
        System.out.println(obj);

        // Garbage collect the object
        str = null;
        System.gc();

        // Get the object again
        obj = softRef.get();

        // Print the object
        System.out.println(obj);
    }
}
