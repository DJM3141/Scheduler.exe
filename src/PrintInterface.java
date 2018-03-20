
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class PrintInterface {
	PrintInterface() {
		JFrame f = new JFrame("PrintInterface");
		f.setContentPane(new JLabel(new ImageIcon("Background3.jpg")));


		// Main add to frame
		f.setSize(800, 800);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Untested code for printing out schedule
		
		/*
		scheduler newScheduler = new scheduler(DraftInterface.getCourseList()); 
		ArrayList<schedule> finalData = newScheduler.createSchedules();
		
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new File("Finalized Class List.txt"));
			
			ArrayList<offerings> temp = finalData.get(0).getOfferingsList(1);
			for(int j = 0; j < temp.size(); j++) {
				pw.println(temp.get(j).getDepartment() + temp.get(j).getLevel() + "     " 
						+ temp.get(j).getCreditAmount() + "     IsPriority:  " + temp.get(j).getPriority());
			}
			
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			pw.close();
		}
		*/

	}
	public static void main(String[] args) {
		new PrintInterface();
	}
}