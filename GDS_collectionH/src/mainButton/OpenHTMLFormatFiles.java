package mainButton;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class OpenHTMLFormatFiles {
	public static void main(String string) throws IOException {
		System.out.println(" Hello MigoWJ ~~!!");
	    System.out.println("Working Directory = " + System.getProperty("user.dir"));
		Runtime runtime = Runtime.getRuntime();
		Process process = runtime.exec(string);
		}
}
