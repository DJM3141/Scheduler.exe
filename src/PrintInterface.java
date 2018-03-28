
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

		scheduler newScheduler = new scheduler(DraftInterface.getCourseList());
		ArrayList<schedule> finalData = newScheduler.createSchedules();
		
		for (int scheduleNumber = 0; scheduleNumber < finalData.size(); scheduleNumber++) {
			System.out.println("Schedule " + (scheduleNumber + 1));
			for (int day = 0; day < 7; day++) {
				if (day == 0)
					System.out.println("Sunday");
				else if (day == 1)
					System.out.println("Monday");
				else if (day == 2)
					System.out.println("Tuesday");
				else if (day == 3)
					System.out.println("Wednesday");
				else if (day == 4)
					System.out.println("Thursday");
				else if (day == 5)
					System.out.println("Friday");
				else if (day == 6)
					System.out.println("Saturday");
				for (int j = 0; j < finalData.get(scheduleNumber).getOfferingsList(day).size(); j++)
					System.out.println(finalData.get(scheduleNumber).getOfferingsList(day).get(j).getLevel() + "      "
							+ finalData.get(scheduleNumber).getOfferingsList(day).get(j).getStartTime() + " - "
							+ finalData.get(scheduleNumber).getOfferingsList(day).get(j).getEndTime());
				System.out.println();
			}
		}
		
	}
	public static void main(String[] args) {
		new PrintInterface();
	}
}