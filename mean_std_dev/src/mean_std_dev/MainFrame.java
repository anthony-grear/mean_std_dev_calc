package mean_std_dev;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class MainFrame {
	private JFrame frame1; 
	private JPanel panel1, panel2, panel3;
	private JDialog dialog, dialog2;
	private JTextField tf;
	private JButton button;
	private JLabel label;
	private JTextArea textArea = new JTextArea();	
	
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
				try {
				double total=0;
				double total2=0;
				double tempDouble;
				double avg = 0;
				String temp = new String();				
				String values = tf.getText();
				String[] arr = values.split(",");				
								
				for (int i=0;i<arr.length; i++) {
					temp = arr[i].trim();
					tempDouble = Double.parseDouble(temp);
					total = total + tempDouble;					
				}
				avg = total / arr.length;
				for (int i=0;i<arr.length; i++) {
					temp = arr[i].trim();
					tempDouble = Double.parseDouble(temp);
					total2 = total2 + Math.pow((tempDouble-avg), 2);			
				}
				Double stdDev = Math.sqrt(total2/arr.length);				
				tf.setText("");
				String s=String.valueOf(avg);
				String s2 = String.valueOf(stdDev);				
				textArea.setText("Mean: "+s+"\nStdDev: "+s2);
				panel2.add(textArea);
				dialog.setVisible(true);
				} catch (Exception e3) {
					dialog2.setVisible(true);
					tf.setText("");					
				}
			}
		});		
		
		label = new JLabel("<html>Incorrect Input. <br>Enter the list of numbers, separated by commas.<html>");
		//container for frame1
		panel1 = new JPanel();
		panel1.add(tf);
		panel1.add(button);
		JTextArea textArea2 = new JTextArea("Enter a list of numbers separated by commas.");
		panel1.add(textArea2);
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel3.add(label);		
		
		dialog2 = new JDialog(frame1, "Input Error");
		dialog2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);		
		dialog2.setLocation(250,100);
		dialog2.setLayout(new BorderLayout());
		dialog2.add(panel3);
		dialog2.pack();
		
		//dialog to display output
		dialog = new JDialog(frame1, "Mean and Std Dev");
		dialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		dialog.setSize(300,185);
		dialog.setLocation(850,100);
		dialog.setLayout(new BorderLayout());
		dialog.add(panel2);		
		
		frame1.add(panel1);
		frame1.setVisible(true);		
	}
	
	
	

}
