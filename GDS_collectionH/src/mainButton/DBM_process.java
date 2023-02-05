package mainButton;


public class DBM_process {
	public static void main(String bchoice) throws Exception {
		System.out.println("Working Directory = " + System.getProperty("user.dir"));
		String pwd = System.getProperty("user.dir");
		
		if (bchoice== "HTML5") {
			Open_HTMLFormat_files.main("firefox /home/migowj/ittia1_chart/GDS_support_html");
			}
		else if (bchoice== "ROS") {
			ExecuteROS_jar.main(null);
			}
		else if (bchoice== "consult") {
			Open_HTMLFormat_files.main("firefox /home/migowj/ittia1_chart/GDS_support_html/Consultation_sheet");
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