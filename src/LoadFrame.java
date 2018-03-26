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
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class LoadFrame {
	LoadFrame() {
		JFrame f = new JFrame("Currently Loaded Courses");
		f.setContentPane(new JLabel(new ImageIcon("Background3.jpg")));

		// Classes already added Text
		// May Need multiple for all info
		JLabel ClassInfo = new JLabel();
		ClassInfo.setText("Classes Added");
		ClassInfo.setBounds(335, 50, 500, 200);

		// Display to show the current courses entered in this instance of the app
		JTextArea CurrentCourseList = new JTextArea();
		ArrayList<course> temp = DraftInterface.getCourseList();
		String courseList = "";
		for(int i = 0; i < temp.size(); i++) {
			courseList = courseList + temp.get(i).getDepartment() + temp.get(i).getLevel() + "     " 
					+ temp.get(i).getCreditAmount() + "     IsPriority:  " + temp.get(i).getPriority() + "\n";
			for(int j = 0; j < temp.get(i).getOfferings().size(); j++) {
				courseList = courseList + "    From: " + temp.get(i).getOffering(j)
						.getStartTime() + " to " + temp.get(i).getOffering(j)
						.getEndTime() + " on " + temp.get(i).getOffering(j).printDays() +  "  " + temp.get(i).getOffering(j).getType() +"\n";
			}
		}
		
		/*
		for(int i = 0; i < temp.size(); i++) {
			courseList = courseList + temp.get(i).getDepartment() + temp.get(i).getLevel() + "     " 
					+ temp.get(i).getCreditAmount() + "     IsPriority:  " + temp.get(i).getPriority() 
					+ "\n";
			for(int j = 0; j < temp.get(i).getOfferings().size(); j++) {
				courseList = courseList + "    From: " + temp.get(i).getOfferings().get(j)
						.getStartTime() + " to " + temp.get(i).getOfferings().get(j)
						.getEndTime() + " on " + temp.get(i).getOfferings().get(j)
						.printDays() + "\n";
			}
		}*/
		
		CurrentCourseList.setText(courseList);
		CurrentCourseList.setOpaque(true);
		CurrentCourseList.setBounds(225, 200, 300, 300);
		CurrentCourseList.setEditable(false);
		
		// Add button
		JButton Add = new JButton("Add");
		Add.setBounds(200, 550, 140, 40);

		// Add label which will show event after button clicked
		JLabel AddLabel = new JLabel();
		AddLabel.setBounds(10, 500, 100, 100);

		// Save button
		JButton Save = new JButton("Save");
		Save.setBounds(400, 550, 140, 40);

		// Save label which will show event after button clicked
		JLabel SaveLabel = new JLabel();
		SaveLabel.setBounds(10, 550, 300, 100);

		// Display button
		JButton Display = new JButton("Display");
		Display.setBounds(300, 600, 140, 40);

		// Display label which will show event after button clicked
		JLabel DisplayLabel = new JLabel();
		DisplayLabel.setBounds(10, 650, 300, 100);

		// Main add to frame
		f.add(ClassInfo);
		f.add(AddLabel);
		f.add(Add);
		f.add(SaveLabel);
		f.add(Save);
		f.add(DisplayLabel);
		f.add(Display);
		f.add(CurrentCourseList);
		f.setSize(800, 800);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Add Button listener
		Add.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				AddLabel.setText("Add Schedule");
				
				try {
					JFrame AddFrame = new JFrame("AddFrame");
					AddFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					AddFrame.getContentPane().add(AddFrame, new AddInterface());
					AddFrame.setSize(800, 800);
					AddFrame.pack();
					AddFrame.setVisible(true);
				} catch(Exception IllegalArgumentException) {
					
				}

			}
		});

		// Save Button Listener
		Save.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				SaveLabel.setText("File Saved");
				
				// Prints the File in the Eclipse Project Directory
				PrintWriter pw = null;
				try {
					pw = new PrintWriter(new File("Class List.txt"));
					ArrayList<course> temp = DraftInterface.getCourseList();
					for(int i = 0; i < temp.size(); i++) {
						pw.println(temp.get(i).getDepartment() + temp.get(i).getLevel() + "     " 
								+ temp.get(i).getCreditAmount() + "     IsPriority:  " + temp.get(i).getPriority() + "\n");
						for(int j = 0; j < temp.get(i).getOfferings().size(); j++) {
							pw.println("    From: " + temp.get(i).getOffering(j)
									.getStartTime() + " to " + temp.get(i).getOffering(j)
									.getEndTime() + " on " + temp.get(i).getOffering(j).printDays() +  "  " + temp.get(i).getOffering(j).getType() +"\n");
						}
					}
				} catch (IOException ex) {
					ex.printStackTrace();
				} finally {
					pw.close();
				}
			}
		});

		// Display Button listener
		Display.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				DisplayLabel.setText("Display Schedule");
				
				try {
					JFrame DisplayFrame = new JFrame("DisplayFrame");
					DisplayFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					DisplayFrame.getContentPane().add(DisplayFrame, new DisplayInterface());
					DisplayFrame.setSize(1500, 1500);
					DisplayFrame.pack();
					DisplayFrame.setVisible(true);
				} catch(Exception IllegalArgumentException) {
					
				}
				
			}
		});

	}

	public static void main(String[] args) {
		new LoadFrame();
	}
}