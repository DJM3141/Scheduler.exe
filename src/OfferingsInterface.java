
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.JCheckBox;

public class OfferingsInterface {
	OfferingsInterface() {
		JFrame f = new JFrame("AddFrame");
		f.setContentPane(new JLabel(new ImageIcon("Background3.jpg")));

		// Class
		JLabel OfferingsL = new JLabel();
		OfferingsL.setText("Offerings");
		OfferingsL.setBounds(10, 10, 200, 100);

		JTextField CRNLB = new JTextField();
		CRNLB.setBounds(75, 90, 80, 30);
		JLabel CRNL = new JLabel();
		CRNL.setText("CRN :");
		CRNL.setBounds(10, 50, 200, 100);
		// CRN Example Label
		JLabel CRNEx = new JLabel();
		CRNEx.setText("Example: 27364");
		CRNEx.setBounds(170, 55, 200, 100);

		/*
		 * JTextField DaysLB = new JTextField(); DaysLB.setBounds(75, 140, 80,
		 * 30); JLabel DaysL = new JLabel(); DaysL.setText("Days :");
		 * DaysL.setBounds(10, 100, 200, 100); // Days Example Label JLabel
		 * DaysEx = new JLabel(); DaysEx.setText("Example: 1,3,5");
		 * DaysEx.setBounds(170, 105, 200, 100);
		 * 
		 * // Days Explain Label JLabel DaysEp = new JLabel(); DaysEp.
		 * setText("Example: Sunday: 0, Monday: 1, Tuesday: 2... Saturday: 6");
		 * DaysEp.setBounds(270, 105, 350, 100);
		 * 
		 */

		// Sunday Checkbox
		JCheckBox SundayCheck = new JCheckBox("Sunday");
		SundayCheck.setBounds(10, 130, 100, 30);
		SundayCheck.setOpaque(false);

		// Monday Checkbox
		JCheckBox MondayCheck = new JCheckBox("Monday");
		MondayCheck.setBounds(110, 130, 100, 30);
		MondayCheck.setOpaque(false);

		// Tuesday Checkbox
		JCheckBox TuesdayCheck = new JCheckBox("Tuesday");
		TuesdayCheck.setBounds(210, 130, 100, 30);
		TuesdayCheck.setOpaque(false);

		// Wednesday Checkbox
		JCheckBox WednesdayCheck = new JCheckBox("Wednesday");
		WednesdayCheck.setBounds(310, 130, 100, 30);
		WednesdayCheck.setOpaque(false);

		// Thursday Checkbox
		JCheckBox ThursdayCheck = new JCheckBox("Thursday");
		ThursdayCheck.setBounds(410, 130, 100, 30);
		ThursdayCheck.setOpaque(false);

		// Friday Checkbox
		JCheckBox FridayCheck = new JCheckBox("Friday");
		FridayCheck.setBounds(510, 130, 100, 30);
		FridayCheck.setOpaque(false);

		// Saturday Checkbox
		JCheckBox SaturdayCheck = new JCheckBox("Saturday");
		SaturdayCheck.setBounds(610, 130, 100, 30);
		SaturdayCheck.setOpaque(false);

		JTextField StartTimeLB = new JTextField();
		StartTimeLB.setBounds(75, 180, 80, 30);
		JLabel StartTimeL = new JLabel();
		StartTimeL.setText("Start Time:");
		StartTimeL.setBounds(10, 140, 200, 100);
		// Start Example Label
		JLabel StartEx = new JLabel();
		StartEx.setText("Example: 1305");
		StartEx.setBounds(170, 145, 200, 100);

		JTextField EndTimeLB = new JTextField();
		EndTimeLB.setBounds(75, 220, 80, 30);
		JLabel EndTimeL = new JLabel();
		EndTimeL.setText("End Time:");
		EndTimeL.setBounds(10, 180, 200, 100);
		// End Example Label
		JLabel EndEx = new JLabel();
		EndEx.setText("Example: 1355");
		EndEx.setBounds(170, 185, 200, 100);

		// class add to frame
		f.add(OfferingsL);
		f.add(CRNLB);
		f.add(CRNEx);
		f.add(CRNL);
		// f.add(DaysLB);
		// f.add(DaysEx);
		// f.add(DaysEp);
		// f.add(DaysL);
		f.add(SundayCheck);
		f.add(MondayCheck);
		f.add(TuesdayCheck);
		f.add(WednesdayCheck);
		f.add(ThursdayCheck);
		f.add(FridayCheck);
		f.add(SaturdayCheck);
		f.add(StartTimeLB);
		f.add(StartEx);
		f.add(StartTimeL);
		f.add(EndTimeLB);
		f.add(EndEx);
		f.add(EndTimeL);

		// Offerings button
		JButton Offerings = new JButton("More Offerings");
		Offerings.setBounds(335, 600, 140, 40);

		// Offerings label which will show event after button clicked
		JLabel OfferingsLabel = new JLabel();
		OfferingsLabel.setBounds(10, 650, 300, 100);

		// Submit button
		JButton Submit = new JButton("Submit");
		Submit.setBounds(335, 650, 140, 40);

		// Submit label which will show event after button clicked
		JLabel SubmitLabel = new JLabel();
		SubmitLabel.setBounds(300, 600, 300, 100);

		/*
		 * // Checkbox JCheckBox FullBox = new JCheckBox("Full?");
		 * FullBox.setBounds(10, 250, 100, 30);
		 * 
		 * // Checkbox JCheckBox TrackABox = new JCheckBox("Track A?");
		 * TrackABox.setBounds(110, 250, 100, 30);
		 * 
		 * // Checkbox JCheckBox TrackBBox = new JCheckBox("Track B?");
		 * TrackBBox.setBounds(210, 250, 100, 30);
		 * 
		 */
		// Radio Buttons
		JRadioButton Full = new JRadioButton("Full?");
		Full.setOpaque(false);
		JRadioButton TrackA = new JRadioButton("Track A?");
		TrackA.setOpaque(false);
		JRadioButton TrackB = new JRadioButton("Track B?");
		TrackB.setOpaque(false);
		Full.setBounds(10, 250, 100, 30);
		TrackA.setBounds(110, 250, 100, 30);
		TrackB.setBounds(210, 250, 100, 30);
		ButtonGroup bg = new ButtonGroup();
		bg.add(Full);
		bg.add(TrackA);
		bg.add(TrackB);
		f.add(Full);
		f.add(TrackA);
		f.add(TrackB);

		// Main add to frame
		f.add(OfferingsLabel);
		f.add(Offerings);
		f.add(SubmitLabel);
		f.add(Submit);


		f.setSize(800, 800);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Submit listener
		Submit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Submit selected");
				JFrame AddFrame = new JFrame("AddFrame");
				AddFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				AddFrame.getContentPane().add(AddFrame, new AddInterface());
				AddFrame.setSize(800, 800);
				AddFrame.pack();
				AddFrame.setVisible(true);

			}
		});
		// Sunday listener
		SundayCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Sunday selected");

			}
		});
		// Monday listener
		MondayCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Monday selected");

			}
		});
		// Tuesday listener
		TuesdayCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Tuesday selected");

			}
		});
		// Wednesday listener
		WednesdayCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Wednesday selected");

			}
		});
		// Thursday listener
		ThursdayCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Thursday selected");

			}
		});
		// Friday listener
		FridayCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Friday selected");

			}
		});
		// Saturday listener
		SaturdayCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Saturday selected");

			}
		});
		// Full listener
		Full.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Full selected");

			}
		});
		// Track A listener
		TrackA.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Track A selected");

			}
		});
		// Track B listener
		TrackB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Track B selected");

			}
		});
		// Submit listener
		Offerings.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Offerings selected");
				JFrame OfferingsFrame = new JFrame("OfferingsFrame");
				OfferingsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				OfferingsFrame.getContentPane().add(OfferingsFrame, new OfferingsInterface());
				OfferingsFrame.setSize(800, 800);
				OfferingsFrame.pack();
				OfferingsFrame.setVisible(true);

			}
		});

	}

	public static void main(String[] args) {
		new OfferingsInterface();

	}
}