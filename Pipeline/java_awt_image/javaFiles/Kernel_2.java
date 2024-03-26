import java.awt.image.Kernel;

public class Kernel_2 {
    public static void main(String[] args) {
        float[] data = {1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f};
        Kernel kernel = new Kernel(3, 3, data);
        int width = kernel.getWidth();
        System.out.println("Width of the kernel: " + width);
    }
}
