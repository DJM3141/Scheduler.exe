import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

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
		f.setContentPane(new JLabel(new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Background3.jpg")))));
		ImageIcon img = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("dog1.png.png")));
		f.setIconImage(img.getImage());

		// Application info Text
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
		New.setBounds(325, 450, 140, 40);

		// Main add to frame
		f.add(AppInfo);
		f.add(AppInfo2);
		f.add(AppInfo3);
		f.add(AppInfo4);
		f.add(AppInfo5);
		f.add(AppInfo6);
		f.add(AppInfo7);
		f.add(New);
		f.setSize(800, 800);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// New Button listener
		New.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
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

	}

	public static void main(String[] args) {
		new DraftInterface();
	}
}
