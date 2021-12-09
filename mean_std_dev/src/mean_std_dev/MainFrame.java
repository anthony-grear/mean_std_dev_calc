package mean_std_dev;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class MainFrame {
	private JFrame frame1; 
	private JPanel panel1, panel2;
	private JDialog dialog;
	private JTextField tf;
	private JButton button;
	private JLabel label;
	
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
		
		tf = new JTextField(16);
		
		label = new JLabel();		
		
		
		
		button = new JButton("Calculate");
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String values = tf.getText();
				String[] arr = values.split(",");
				double total=0;
				double tempDouble;
				double avg = 0;
				String temp = new String();
				for (int i=0;i<arr.length; i++) {
					temp = arr[i].trim();
					tempDouble = Double.parseDouble(temp);
					total = total + tempDouble;					
				}
				avg = total / arr.length;
				tf.setText("");
				String s=String.valueOf(avg);
				label.setText("Mean: "+s);
				dialog.setVisible(true);
			}
		});		
		
		
		//container for frame1
		panel1 = new JPanel();
//		panel1.setBackground(new Color(31, 104, 150));
		panel1.add(tf);
		panel1.add(button);
		
		panel2 = new JPanel();
		panel2.add(label);
		
		//dialog to display output
		dialog = new JDialog(frame1, "Mean and Std Dev");
//		dialog.setTitle("Output Window");
		dialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		dialog.setSize(300,185);
		dialog.setLocation(850,100);
		dialog.setLayout(new BorderLayout());
		dialog.add(panel2);
		
		
		frame1.add(panel1);
//		frame1.pack();
		frame1.setVisible(true);		
	}
	
	
	

}
