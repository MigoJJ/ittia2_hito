package mainButton;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class OpenConsultFormatFiles {
		static String homeDirectory = System.getProperty("user.home");
		static String hDir = homeDirectory +  "/ittia_chart/addjar_ittia2";
	    public static void main(String string) {
	        System.out.println("Hello MigoWJ ~~!!");
	        System.out.println("Working Directory = " + System.getProperty("user.dir"));

	        // Replace file path with your own ODT file path
	        File file = new File(hDir + "/SupportFiles/ConsultationSheet/OT.odt");

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
