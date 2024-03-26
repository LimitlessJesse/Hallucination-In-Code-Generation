import java.lang.System;

public class System_2 {
    public static void main(String[] args) {
        // Create source array
        int[] src = {1, 2, 3, 4, 5};

        // Create destination array
        int[] dest = new int[10];

        // Copy elements from source to destination
        System.arraycopy(src, 0, dest, 0, src.length);

        // Print destination array
        for (int i : dest) {
            System.out.print(i + " ");
        }
    }
}
