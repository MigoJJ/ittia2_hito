package mainButton;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExecuteTxPx_jar {
	static String homeDirectory = System.getProperty("user.home");
	public static void main(String[] args) throws Exception {
		String[] list = new String[] {"/bin/bash", "-c", "java -jar TxPx.jar","pwd"};		
		Process p = null;
		ProcessBuilder pb = new ProcessBuilder(list);
		pb.directory(new File("/home/migowj/ittia_chart/addjar_ittia4"));
		System.out.println("" + pb.directory());
		p = pb.start();
		
		printResults(p);

	}
		public static void printResults(Process process) throws IOException {
		    BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
		    String line = "";
		    while ((line = reader.readLine()) != null) {
		        System.out.println(line);
		    }
		}
}