import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.JCheckBox;

public class AddInterface {

	AddInterface() {
		JFrame f = new JFrame("Add a Course");
		f.setContentPane(new JLabel(new ImageIcon("Background3.jpg")));
		ImageIcon img = new ImageIcon("dog1.png.png");
		f.setIconImage(img.getImage());
		
		// Class
		JLabel Class = new JLabel();
		Class.setText("New Class");
		Class.setBounds(10, 10, 200, 100);

		JTextField DeptLB = new JTextField();
		DeptLB.setBounds(60, 90, 80, 30);
		JLabel DeptL = new JLabel();
		DeptL.setText("Dept :");
		DeptL.setBounds(10, 50, 200, 100);
		// Dept Example Label
		JLabel DeptEx = new JLabel();
		DeptEx.setText("Example: CS");
		DeptEx.setBounds(170, 50, 200, 100);

		JTextField LevelLB = new JTextField();
		LevelLB.setBounds(60, 140, 80, 30);
		JLabel LevelL = new JLabel();
		LevelL.setText("Level :");
		LevelL.setBounds(10, 100, 200, 100);
		// Level Example Label
		JLabel LevelEx = new JLabel();
		LevelEx.setText("Example: 3141");
		LevelEx.setBounds(170, 100, 200, 100);

		JTextField CreditHoursLB = new JTextField();
		CreditHoursLB.setBounds(60, 190, 80, 30);
		JLabel CreditHoursL = new JLabel();
		CreditHoursL.setText("Credits:");
		CreditHoursL.setBounds(10, 150, 200, 100);
		// Credit Example Label
		JLabel CreditEx = new JLabel();
		CreditEx.setText("Example: 3");
		CreditEx.setBounds(170, 150, 200, 100);

		// class add to frame
		f.add(Class);
		f.add(DeptLB);
		f.add(DeptEx);
		f.add(DeptL);
		f.add(LevelLB);
		f.add(LevelEx);
		f.add(LevelL);
		f.add(CreditHoursLB);
		f.add(CreditEx);
		f.add(CreditHoursL);

		// Submit button
		JButton Submit = new JButton("Submit");
		Submit.setBounds(10, 350, 160, 40);

		// Goes to the Load Page
		JButton CurrentListing = new JButton("See Current Classes");
		CurrentListing.setBounds(10, 400, 160, 40);

		// Submit label which will show event after button clicked
		JLabel SubmitLabel = new JLabel();
		SubmitLabel.setBounds(10, 350, 300, 100);

		// Checkbox
		JCheckBox PriorityCheck = new JCheckBox("Priority?");
		PriorityCheck.setOpaque(false);
		PriorityCheck.setBounds(10, 220, 100, 30);

		// Main add to frame
		f.add(SubmitLabel);
		f.add(Submit);
		f.add(PriorityCheck);
		f.add(CurrentListing);
		f.setSize(800, 800);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

		// Priority Check listener
		PriorityCheck.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		
		// Submit listener
		Submit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				// Adds a new course to the list of added courses
				int convertedCreditNumber = Integer.parseInt(CreditHoursLB.getText());
				course temp = new course(DeptLB.getText(), LevelLB.getText(), convertedCreditNumber,
						PriorityCheck.isSelected());
				DraftInterface.getCourseList().add(temp);
				
				DeptLB.setText("");
				LevelLB.setText("");
				CreditHoursLB.setText("");
				PriorityCheck.setSelected(false);
				
				try {
					JFrame OfferingsFrame = new JFrame("OfferingsFrame");
					OfferingsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					OfferingsFrame.getContentPane().add(OfferingsFrame, new OfferingsInterface());
					OfferingsFrame.setSize(800, 800);
					OfferingsFrame.pack();
					OfferingsFrame.setVisible(true);
				} catch(Exception IllegalArgumentException) {
					
				}
				
			}
		});
		
		// CurrentListing listener
		CurrentListing.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					JFrame AddFrame = new JFrame("LoadFrame");
					AddFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					AddFrame.getContentPane().add(AddFrame, new LoadFrame());
					AddFrame.setSize(800, 800);
					AddFrame.pack();
					AddFrame.setVisible(true);
				} catch(Exception IllegalArgumentException) {
					
				}
			}
		});

	}

	public static void main(String[] args) {
		new AddInterface();
	}
}