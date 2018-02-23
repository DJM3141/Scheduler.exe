import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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
	
	DraftInterface() {
		JFrame f = new JFrame("Scheduler.exe");

		// Application info Text
		// May Need multiple for all info
		JLabel AppInfo = new JLabel();
		AppInfo.setText("App Info because I wanted to see what it will look like");
		AppInfo.setBounds(350, 50, 500, 200);

		// New button
		JButton New = new JButton("New");
		New.setBounds(200, 650, 140, 40);

		// New label which will show event after button clicked
		JLabel NewLabel = new JLabel();
		NewLabel.setBounds(10, 500, 100, 100);

		// Load button
		JButton Load = new JButton("Load");
		Load.setBounds(400, 650, 140, 40);

		// Load label which will show event after button clicked
		JLabel LoadLabel = new JLabel();
		LoadLabel.setBounds(10, 550, 300, 100);

		// Main add to frame
		f.add(AppInfo);
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
