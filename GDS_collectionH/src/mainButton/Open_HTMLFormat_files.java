package mainButton;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class OpenHTMLFormatFiles {
    public static void main(String[] args) {
        System.out.println("Hello MigoWJ ~~!!");
        System.out.println("Working Directory = " + System.getProperty("user.dir"));

        // Replace file path with your own ODT file path
        File file = new File("path/to/your/file.odt");

        try {
            if (file.exists()) {
                Desktop.getDesktop().open(file);
            } else {
                System.out.println("File does not exist.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
