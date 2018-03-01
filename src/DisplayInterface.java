import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class DisplayInterface {
	DisplayInterface() {
		JFrame f = new JFrame("DisplayInterface");

		// Credit max Text
		JLabel CreditMax = new JLabel();
		CreditMax.setText("Enter desired Max credits");
		CreditMax.setBounds(300, 50, 500, 200);

		// Credit Box
		JTextField MaxCreditLB = new JTextField();
		MaxCreditLB.setBounds(325, 180, 80, 30);
		JLabel MaxCreditL = new JLabel();

		// Continue button
		JButton Continue = new JButton("Continue");
		Continue.setBounds(300, 250, 140, 40);

		// Continue label which will show event after button clicked
		JLabel ContinueLabel = new JLabel();
		ContinueLabel.setBounds(150, 150, 100, 100);

		// Main add to frame
		f.add(CreditMax);
		f.add(MaxCreditLB);
		f.add(ContinueLabel);
		f.add(Continue);
		f.setSize(800, 800);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// New Button listener
		Continue.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				System.out.println("Print Clicked");

				JFrame PrintFrame = new JFrame("PrintFrame");
				PrintFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				PrintFrame.getContentPane().add(PrintFrame, new PrintInterface());
				PrintFrame.setSize(800, 800);
				PrintFrame.pack();
				PrintFrame.setVisible(true);

			}
		});

	}

	public static void main(String[] args) {
		new DisplayInterface();
	}
}
