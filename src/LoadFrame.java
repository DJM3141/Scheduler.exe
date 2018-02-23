import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class LoadFrame {
	LoadFrame() {
		JFrame f = new JFrame("LoadFrame");

		// Classes already added Text
		// May Need multiple for all info
		JLabel ClassInfo = new JLabel();
		ClassInfo.setText("CS3141");
		ClassInfo.setBounds(350, 50, 500, 200);

		// Display to show the current courses entered in this instance of the app
		JTextArea CurrentCourseList = new JTextArea();
		ArrayList<course> temp = DraftInterface.getCourseList();
		String courseList = "";
		for(int i = 0; i < temp.size(); i++) {
			courseList = courseList + temp.get(i).getDepartment() + temp.get(i).getLevel() + "     " 
					+ temp.get(i).getCreditAmount() + "     IsPriority:  " + temp.get(i).getPriority() + "\n";
		}
		CurrentCourseList.setText(courseList);
		CurrentCourseList.setBounds(100, 200, 300, 300);
		CurrentCourseList.setEditable(false);
		
		// Add button
		JButton Add = new JButton("Add");
		Add.setBounds(200, 650, 140, 40);

		// Add label which will show event after button clicked
		JLabel AddLabel = new JLabel();
		AddLabel.setBounds(10, 500, 100, 100);

		// Save button
		JButton Save = new JButton("Save");
		Save.setBounds(400, 650, 140, 40);

		// Save label which will show event after button clicked
		JLabel SaveLabel = new JLabel();
		SaveLabel.setBounds(10, 550, 300, 100);

		// Display button
		JButton Display = new JButton("Display");
		Display.setBounds(300, 700, 140, 40);

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
				System.out.println("Add Clicked");
				JFrame AddFrame = new JFrame("AddFrame");
				AddFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				AddFrame.getContentPane().add(AddFrame, new AddInterface());
				AddFrame.setSize(800, 800);
				AddFrame.pack();
				AddFrame.setVisible(true);

			}
		});

		// Save Button Listener
		Save.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				SaveLabel.setText("Saving... Please Wait");
				System.out.println("Save Clicked");
				/*
				 * JFrame SaveFrame = new JFrame ("SaveFrame");
				 * SaveFrame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
				 * SaveFrame.getContentPane().add (SaveFrame, new SaveInterface());
				 * SaveFrame.setSize(1500, 1500); SaveFrame.pack(); SaveFrame.setVisible (true);
				 */
			}
		});

		// Display Button listener
		Display.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				DisplayLabel.setText("Display Schedule");
				System.out.println("Display Clicked");

				JFrame DisplayFrame = new JFrame("DisplayFrame");
				DisplayFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				DisplayFrame.getContentPane().add(DisplayFrame, new DisplayInterface());
				DisplayFrame.setSize(1500, 1500);
				DisplayFrame.pack();
				DisplayFrame.setVisible(true);

			}
		});

	}

	public static void main(String[] args) {
		new LoadFrame();
	}
}