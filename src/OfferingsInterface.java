
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.JCheckBox;

public class OfferingsInterface {
	OfferingsInterface() {
		JFrame f = new JFrame("AddFrame");

		// Class
		JLabel OfferingsL = new JLabel();
		OfferingsL.setText("Offerings");
		OfferingsL.setBounds(10, 10, 200, 100);

		JTextField CRNLB = new JTextField();
		CRNLB.setBounds(75, 90, 80, 30);
		JLabel CRNL = new JLabel();
		CRNL.setText("CRN :");
		CRNL.setBounds(10, 50, 200, 100);

		JTextField DaysLB = new JTextField();
		DaysLB.setBounds(75, 140, 80, 30);
		JLabel DaysL = new JLabel();
		DaysL.setText("Days :");
		DaysL.setBounds(10, 100, 200, 100);

		JTextField StartTimeLB = new JTextField();
		StartTimeLB.setBounds(75, 180, 80, 30);
		JLabel StartTimeL = new JLabel();
		StartTimeL.setText("StartTime :");
		StartTimeL.setBounds(10, 140, 200, 100);

		JTextField EndTimeLB = new JTextField();
		EndTimeLB.setBounds(75, 220, 80, 30);
		JLabel EndTimeL = new JLabel();
		EndTimeL.setText("EndTime :");
		EndTimeL.setBounds(10, 180, 200, 100);

		// class add to frame
		f.add(OfferingsL);
		f.add(CRNLB);
		f.add(CRNL);
		f.add(DaysLB);
		f.add(DaysL);
		f.add(StartTimeLB);
		f.add(StartTimeL);
		f.add(EndTimeLB);
		f.add(EndTimeL);


		// Offerings button
		JButton Offerings = new JButton("More Offerings");
		Offerings.setBounds(10, 300, 140, 40);

		// Offerings label which will show event after button clicked
		JLabel OfferingsLabel = new JLabel();
		OfferingsLabel.setBounds(10, 650, 300, 100);

		// Submit button
		JButton Submit = new JButton("Submit");
		Submit.setBounds(10, 350, 140, 40);

		// Submit label which will show event after button clicked
		JLabel SubmitLabel = new JLabel();
		SubmitLabel.setBounds(10, 350, 300, 100);

		// Checkbox
		JCheckBox FullBox = new JCheckBox("Full?");
		FullBox.setBounds(10, 250, 100, 30);

		// Checkbox
		JCheckBox TrackABox = new JCheckBox("Track A?");
		TrackABox.setBounds(110, 250, 100, 30);

		// Checkbox
		JCheckBox TrackBBox = new JCheckBox("Track B?");
		TrackBBox.setBounds(210, 250, 100, 30);

		// Main add to frame
		f.add(OfferingsLabel);
		f.add(Offerings);
		f.add(SubmitLabel);
		f.add(Submit);
		f.add(FullBox);
		f.add(TrackABox);
		f.add(TrackBBox);
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