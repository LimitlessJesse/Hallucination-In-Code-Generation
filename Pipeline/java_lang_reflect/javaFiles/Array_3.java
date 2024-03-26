import java.lang.reflect.Array;

public class Array_3 {
    public static void main(String[] args) {
        try {
            // Create an array of 5 integers
            Object array = Array.newInstance(Integer.class, 5);

            // Set the values of the array
            for (int i = 0; i < 5; i++) {
                Array.set(array, i, i * 10);
            }

            // Print the values of the array
            for (int i = 0; i < 5; i++) {
                System.out.println(Array.get(array, i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
