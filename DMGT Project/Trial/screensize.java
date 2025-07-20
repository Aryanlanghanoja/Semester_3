import java.awt.Dimension;
import java.awt.Toolkit;

public class screensize {
    public static void main(String[] args) {
        // Get the default toolkit
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        
        // Get the screen size
        Dimension screenSize = toolkit.getScreenSize();
        
        // Extract the width and height
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        
        // Print the screen size
        System.out.println("Screen Width: " + screenWidth + " pixels");
        System.out.println("Screen Height: " + screenHeight + " pixels");
    }
}
