import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.JCheckBox;

public class AddInterface {
	
	AddInterface() {
		JFrame f = new JFrame("AddFrame");

		// Class
		JLabel Class = new JLabel();
		Class.setText("New Class");
		Class.setBounds(10, 10, 200, 100);

		JTextField DeptLB = new JTextField();
		DeptLB.setBounds(60, 90, 80, 30);
		JLabel DeptL = new JLabel();
		DeptL.setText("Dept :");
		DeptL.setBounds(10, 50, 200, 100);

		JTextField LevelLB = new JTextField();
		LevelLB.setBounds(60, 140, 80, 30);
		JLabel LevelL = new JLabel();
		LevelL.setText("Level :");
		LevelL.setBounds(10, 100, 200, 100);

		JTextField CreditHoursLB = new JTextField();
		CreditHoursLB.setBounds(60, 190, 80, 30);
		JLabel CreditHoursL = new JLabel();
		CreditHoursL.setText("Credits:");
		CreditHoursL.setBounds(10, 150, 200, 100);

		// class add to frame
		f.add(Class);
		f.add(DeptLB);
		f.add(DeptL);
		f.add(LevelLB);
		f.add(LevelL);
		f.add(CreditHoursLB);
		f.add(CreditHoursL);

		// Add Another button
		JButton Add = new JButton("Add Another");
		Add.setBounds(10, 650, 140, 40);

		// Add label which will show event after button clicked
		JLabel AddLabel = new JLabel();
		AddLabel.setBounds(10, 500, 100, 100);

		// Display button
		JButton Display = new JButton("Display");
		Display.setBounds(10, 700, 140, 40);

		// Display label which will show event after button clicked
		JLabel DisplayLabel = new JLabel();
		DisplayLabel.setBounds(10, 650, 300, 100);

		// Offerings button
		JButton Offerings = new JButton("Offerings");
		Offerings.setBounds(10, 300, 140, 40);

		// Offerings label which will show event after button clicked
		JLabel OfferingsLabel = new JLabel();
		OfferingsLabel.setBounds(10, 650, 300, 100);

		// Submit button
		JButton Submit = new JButton("Submit");
		Submit.setBounds(10, 350, 140, 40);
		
		// Goes to the Load PAge
		JButton CurrentListing = new JButton("See Current Classes");
		CurrentListing.setBounds(10, 400, 140, 40);

		// Submit label which will show event after button clicked
		JLabel SubmitLabel = new JLabel();
		SubmitLabel.setBounds(10, 350, 300, 100);

		// Checkbox
		JCheckBox PriorityCheck = new JCheckBox("Priority?");
		PriorityCheck.setBounds(10, 220, 100, 30);

		// Main add to frame
		f.add(AddLabel);
		f.add(Add);
		f.add(DisplayLabel);
		f.add(Display);
		f.add(OfferingsLabel);
		f.add(Offerings);
		f.add(SubmitLabel);
		f.add(Submit);
		f.add(PriorityCheck);
		f.add(CurrentListing);
		f.setSize(800, 800);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Add Button listener
		Add.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				AddLabel.setText("Add Another Schedule");
				System.out.println("Add Another Clicked");
				JFrame AddFrame = new JFrame("AddFrame");
				AddFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				AddFrame.getContentPane().add(AddFrame, new AddInterface());
				AddFrame.setSize(800, 800);
				AddFrame.pack();
				AddFrame.setVisible(true);

			}
		});
		
		// Offerings Button listener
		Offerings.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				JFrame OfferingsFrame = new JFrame("OfferingsFrame");
				OfferingsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				OfferingsFrame.getContentPane().add(OfferingsFrame, new OfferingsInterface());
				OfferingsFrame.setSize(800, 800);
				OfferingsFrame.pack();
				OfferingsFrame.setVisible(true);

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
		// Priority Check listener
		PriorityCheck.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Priority Checked");

			}
		});
		// Submit listener
		Submit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				// Adds a new course to the list of added courses
				int convertedCreditNumber = Integer.parseInt(CreditHoursLB.getText());
				course temp = new course(DeptLB.getText(), LevelLB.getText(), convertedCreditNumber, PriorityCheck.isSelected(), null );
				DraftInterface.getCourseList().add(temp);

			}
		});
		// CurrentListing listener
		CurrentListing.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				JFrame AddFrame = new JFrame("LoadFrame");
				AddFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				AddFrame.getContentPane().add(AddFrame, new LoadFrame());
				AddFrame.setSize(800, 800);
				AddFrame.pack();
				AddFrame.setVisible(true);

			}
		});

	}

	public static void main(String[] args) {
		new AddInterface();
	}
}