package mainButton;

import java.awt.*;	
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;

public class DisplayButtonMessage extends JFrame {
	public static void main(String[] args){
		DisplayButtonMessage frame=new DisplayButtonMessage();
		frame.setTitle("ProcessBuilder !!!");
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		frame.setLocation(0,0);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	int i=0;
	static JPanel panel;
	public DisplayButtonMessage(){
		JButton[] buttons = new JButton[6];
		panel=new JPanel(new GridLayout(1,6));
		String  b[]={"HTML5","consult","ROS","Thyroid","DM Complication","Exit"};

		for(i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(b[i]);
			buttons[i].setPreferredSize(new Dimension(200, 35));
			buttons[i].setFont(new Font("Arial", Font.BOLD, 14));
			buttons[i].setSize(80, 80);
			buttons[i].setBackground(Color.ORANGE	);
			buttons[i].setActionCommand(b[i]);
			buttons[i].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
				  String choice = e.getActionCommand();

					try {
						DBM_process.main(choice);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
		panel.add(buttons[i]);
		}
	}
}