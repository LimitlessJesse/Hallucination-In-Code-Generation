import java.awt.image.Kernel;

public class Kernel_3 {
    public static void main(String[] args) {
        float[] data = {1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f};
        Kernel kernel = new Kernel(3, 3, data);
        int height = kernel.getHeight();
        System.out.println("Height of the kernel: " + height);
    }
}
