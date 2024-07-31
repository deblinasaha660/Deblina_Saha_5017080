package ProxyPatternExample;

public class ProxyPatternTest {
    public static void main(String[] args) {
        // Create an image proxy
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        // Image will be loaded from server
        System.out.println("First time displaying image1:");
        image1.display();
        System.out.println();

        // Image will not be loaded from server, it will use cached image
        System.out.println("Second time displaying image1:");
        image1.display();
        System.out.println();

        // Image will be loaded from server
        System.out.println("First time displaying image2:");
        image2.display();
    }
}
