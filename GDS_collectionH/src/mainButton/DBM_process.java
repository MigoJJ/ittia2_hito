package mainButton;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DBM_process {
	public static void main(String bchoice) throws IOException {
		System.out.println("Working Directory = " + System.getProperty("user.dir"));
		String pwd = System.getProperty("user.dir");
		
		if (bchoice== "HTML5") {Open_HTMLFormat_files.main(null);}
		else if (bchoice== "Pregnancy") {}
		else if (bchoice== "OT") {}
		else if (bchoice== "Support") {}
		else if (bchoice== "aaa") {}
		else if (bchoice== "Exit") {}
		else {}
	}

}