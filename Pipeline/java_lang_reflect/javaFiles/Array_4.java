import java.lang.reflect.Array;

public class Array_4 {
    public static void main(String[] args) {
        // Create an array of integers
        Integer[] array = (Integer[]) Array.newInstance(Integer.class, 5);

        // Set the value of the first index to 10
        Array.set(array, 0, 10);

        // Print the array
        for (int i = 0; i < array.length; i++) {
            System.out.println("Index " + i + ": " + array[i]);
        }
    }
}
