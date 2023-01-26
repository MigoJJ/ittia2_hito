package mainButton;

import java.io.IOException;

public class Open_HTMLFormat_files {

	public static void main(String[] args) throws IOException {
		System.out.println(" Hello MigoWJ ~~!!");
	    System.out.println("Working Directory = " + System.getProperty("user.dir"));
		Runtime runtime = Runtime.getRuntime();
		Process process = runtime.exec("firefox /home/migowj/ittia1_chart/GDS_support_html");
		}
}
