package mean_std_dev;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainFrame {
	private JFrame frame1, frame2; 
	
	public MainFrame() {
		initialize();		
	}

	private void initialize() {
		frame1 =  new JFrame();
		frame1.setTitle("Mean and Std Deviation Calculator");
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setSize(400,185);
		frame1.setLocation(450,100);
		frame1.setLayout(new BorderLayout());
		
		frame2 = new JFrame();
		frame2.setTitle("Output Window");
		frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame2.setSize(300,185);
		frame2.setLocation(850,100);
		frame2.setLayout(new BorderLayout());
		
		frame1.setVisible(true);
		
	}
	

}
