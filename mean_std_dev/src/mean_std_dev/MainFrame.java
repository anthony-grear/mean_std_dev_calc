package mean_std_dev;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame {
	private JFrame frame1; 
	private JPanel panel1, panel2;
	private JDialog dialog;
	
	public MainFrame() {
		initialize();		
	}

	private void initialize() {
		
		//frame to enter values
		frame1 =  new JFrame();
		frame1.setTitle("Mean and Std Deviation Calculator");
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setSize(400,185);
		frame1.setLocation(450,100);
		frame1.setLayout(new BorderLayout());
		
		//container for frame1
		panel1 = new JPanel();
		panel1.setBackground(new Color(31, 104, 150));
		
		//frame to display window
		dialog = new JDialog(frame1, "Mean and Std Dev");
//		dialog.setTitle("Output Window");
		dialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		dialog.setSize(300,185);
		dialog.setLocation(850,100);
		dialog.setLayout(new BorderLayout());
		dialog.setVisible(true);
		
//		frame1.pack();
		frame1.setVisible(true);
		
	}
	

}
