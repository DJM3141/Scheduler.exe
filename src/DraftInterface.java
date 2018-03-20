import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class DraftInterface {
	
	// One instance of the courses that have been added during the user session
	public static ArrayList<course> currentCourses = new ArrayList<course>();
	
	public static ArrayList<course> getCourseList() {
		return currentCourses;
	}
	
	public static void setCourseList(ArrayList<course> temp) {
		currentCourses = temp;
	}
	
	DraftInterface() {
		JFrame f = new JFrame("Scheduler.exe");
		f.setContentPane(new JLabel(new ImageIcon("Background3.jpg")));

		// Application info Text
		// May Need multiple for all info
		JLabel AppInfo = new JLabel();
		AppInfo.setText("Scheduler.exe");
		AppInfo.setBounds(370, 50, 500, 200);
		
		JLabel AppInfo2 = new JLabel();
		AppInfo2.setText("This application takes in all course data");
		AppInfo2.setBounds(300, 75, 500, 200);
		
		JLabel AppInfo3 = new JLabel();
		AppInfo3.setText("and creates several unique schedules");
		AppInfo3.setBounds(300, 100, 500, 200);
		
		JLabel AppInfo4 = new JLabel();
		AppInfo4.setText("Developed by:");
		AppInfo4.setBounds(370, 125, 500, 200);
		
		JLabel AppInfo5 = new JLabel();
		AppInfo5.setText("Matt L.");
		AppInfo5.setBounds(385, 150, 500, 200);
		
		JLabel AppInfo6 = new JLabel();
		AppInfo6.setText("Joell E.");
		AppInfo6.setBounds(385, 175, 500, 200);
		
		JLabel AppInfo7 = new JLabel();
		AppInfo7.setText("Dan R.");
		AppInfo7.setBounds(385, 200, 500, 200);

		// New button
		JButton New = new JButton("New");
		New.setBounds(250, 450, 140, 40);

		// New label which will show event after button clicked
		JLabel NewLabel = new JLabel();
		NewLabel.setBounds(10, 500, 100, 100);

		// Load button
		JButton Load = new JButton("Load");
		Load.setBounds(450, 450, 140, 40);

		// Load label which will show event after button clicked
		JLabel LoadLabel = new JLabel();
		LoadLabel.setBounds(10, 550, 300, 100);

		// Main add to frame
		f.add(AppInfo);
		f.add(AppInfo2);
		f.add(AppInfo3);
		f.add(AppInfo4);
		f.add(AppInfo5);
		f.add(AppInfo6);
		f.add(AppInfo7);
		f.add(NewLabel);
		f.add(New);
		f.add(LoadLabel);
		f.add(Load);
		f.setSize(800, 800);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// New Button listener
		New.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				NewLabel.setText("New Schedule");
				System.out.println("New Clicked");
				JFrame AddFrame = new JFrame("AddFrame");
				AddFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				AddFrame.getContentPane().add(AddFrame, new AddInterface());
				AddFrame.setSize(800, 800);
				AddFrame.pack();
				AddFrame.setVisible(true);

			}
		});

		// Load Button Listener
		Load.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				LoadLabel.setText("Loading... Please Wait");
				System.out.println("Load Clicked");
				JFrame LoadFrame = new JFrame("LoadFrame");
				LoadFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				LoadFrame.getContentPane().add(LoadFrame, new LoadFrame());
				LoadFrame.setSize(1500, 1500);
				LoadFrame.pack();
				LoadFrame.setVisible(true);

			}
		});

	}

	public static void main(String[] args) {
		new DraftInterface();
	}
}
