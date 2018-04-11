
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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class PrintInterface {
	PrintInterface() {
		JFrame f = new JFrame("PrintInterface");
		f.setContentPane(new JLabel(new ImageIcon("Background3.jpg")));
		ImageIcon img = new ImageIcon("dog1.png.png");
		f.setIconImage(img.getImage());


		// Main add to frame
		f.setSize(800, 800);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Code for printing out the Final Schedule
		scheduler newScheduler = new scheduler(DraftInterface.getCourseList()); 
		ArrayList<schedule> finalData = newScheduler.createSchedules();
		
		// Prints out the Final Schedule to a File
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new File("Finalized Class List.txt"));
			
			for (int scheduleNumber = 0; scheduleNumber < finalData.size(); scheduleNumber++) {
				pw.println("Schedule " + (scheduleNumber + 1));
				pw.println();
				for (int day = 0; day < 7; day++) {
					if (day == 0)
						pw.println("Sunday");
					else if (day == 1)
						pw.println("Monday");
					else if (day == 2)
						pw.println("Tuesday");
					else if (day == 3)
						pw.println("Wednesday");
					else if (day == 4)
						pw.println("Thursday");
					else if (day == 5)
						pw.println("Friday");
					else if (day == 6)
						pw.println("Saturday");
					for (int j = 0; j < finalData.get(scheduleNumber).getOfferingsList(day).size(); j++)
						pw.println(finalData.get(scheduleNumber).getOfferingsList(day).get(j).getLevel() + "      "
								+ finalData.get(scheduleNumber).getOfferingsList(day).get(j).getStartTime() + " - "
								+ finalData.get(scheduleNumber).getOfferingsList(day).get(j).getEndTime());
					pw.println();
				}
				pw.println();
			}
			
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			pw.close();
		}
		
		// Display the final schedules in the application
		JTextArea CurrentCourseList = new JTextArea();
		String courseList = "";
		
		for (int scheduleNumber = 0; scheduleNumber < finalData.size(); scheduleNumber++) {
			courseList = courseList + "Schedule " + (scheduleNumber + 1) + "\n\n";
			for (int day = 0; day < 7; day++) {
				if (day == 0)
					courseList = courseList + "Sunday\n\n";
				else if (day == 1)
					courseList = courseList + "Monday\n\n";
				else if (day == 2)
					courseList = courseList + "Tuesday\n\n";
				else if (day == 3)
					courseList = courseList + "Wednesday\n\n";
				else if (day == 4)
					courseList = courseList + "Thursday\n\n";
				else if (day == 5)
					courseList = courseList + "Friday\n\n";
				else if (day == 6)
					courseList = courseList + "Saturday\n\n";
				for (int j = 0; j < finalData.get(scheduleNumber).getOfferingsList(day).size(); j++)
					courseList = courseList + finalData.get(scheduleNumber).getOfferingsList(day).get(j).getLevel() + "      "
							+ finalData.get(scheduleNumber).getOfferingsList(day).get(j).getStartTime() + " - "
							+ finalData.get(scheduleNumber).getOfferingsList(day).get(j).getEndTime() + "\n";
			}
			courseList = courseList + "\n\n";
		}
		
		CurrentCourseList.setText(courseList);
		CurrentCourseList.setOpaque(true);
		CurrentCourseList.setBounds(225, 200, 300, 300);
		CurrentCourseList.setEditable(false);
		
		JScrollPane scrollV = new JScrollPane (CurrentCourseList); 
		scrollV.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollV.setBounds(175, 200, 400, 300);
		f.add(scrollV);
		
		// Prints out final schedule to the console
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