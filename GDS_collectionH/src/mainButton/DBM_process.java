package mainButton;


public class DBM_process {
	static String homeDirectory = System.getProperty("user.home");
	static String hDir = homeDirectory +  "/ittia_chart/addjar_ittia2";
	

	public static void main(String bchoice) throws Exception {
		System.out.println("Working Directory = " + System.getProperty("user.dir"));

		
		if (bchoice== "HTML5") {
			Open_HTMLFormat_files.main("firefox " + hDir + "/SupportFiles");
			}
		else if (bchoice== "ROS") {
			ExecuteROS_jar.main(null);
			}
		else if (bchoice== "consult") {
			Open_HTMLFormat_files.main("file://" + hDir + "/SupportFiles/ConsultationSheet/OT.odt");
		}
		else if (bchoice== "Thyroid") {
			ExecuteTxPx_jar.main(null);
			}
		else if (bchoice== "Support") {}
		else if (bchoice== "aaa") {}
		else if (bchoice== "Exit") {System.exit(0);}
		else {}
	}

}