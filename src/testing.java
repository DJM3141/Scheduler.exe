
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class testing {
	testing() {
		JFrame f = new JFrame("Scheduler.exe");

		// submit button
		JButton Start = new JButton("Generate");
		Start.setBounds(100, 450, 140, 40);
		// semester label
		JLabel semesterlabel = new JLabel();
		semesterlabel.setText("Semester:");
		semesterlabel.setBounds(680, 10, 85, 30);
		// empty label which will show event after button clicked
		JLabel StrtLabel = new JLabel();
		StrtLabel.setBounds(10, 500, 100, 100);
		// textfield to enter name
		JTextField Semester = new JTextField();
		Semester.setBounds(750, 10, 85, 30);
		/*
		 * // Class 1 JLabel Class1 = new JLabel(); Class1.setText("Class 1 :");
		 * Class1.setBounds(10, 10, 200, 100);
		 * 
		 * JTextField Dept1LB = new JTextField(); Dept1LB.setBounds(150, 50, 70, 30);
		 * JLabel Dept1L = new JLabel(); Dept1L.setText("Dept :"); Dept1L.setBounds(110,
		 * 10, 200, 100);
		 * 
		 * JTextField Level1LB = new JTextField(); Level1LB.setBounds(300, 50, 70, 30);
		 * JLabel Level1L = new JLabel(); Level1L.setText("Level :");
		 * Level1L.setBounds(260, 10, 200, 100);
		 * 
		 * JTextField Crn1LB = new JTextField(); Crn1LB.setBounds(450, 50, 70, 30);
		 * JLabel Crn1L = new JLabel(); Crn1L.setText("CRN :"); Crn1L.setBounds(410, 10,
		 * 200, 100);
		 * 
		 * JTextField Days1LB = new JTextField(); Days1LB.setBounds(600, 50, 70, 30);
		 * JLabel Days1L = new JLabel(); Days1L.setText("Days :"); Days1L.setBounds(560,
		 * 10, 200, 100);
		 * 
		 * JTextField StartTime1LB = new JTextField(); StartTime1LB.setBounds(760, 50,
		 * 70, 30); JLabel StartTime1L = new JLabel();
		 * StartTime1L.setText("Start Time :"); StartTime1L.setBounds(690, 10, 200,
		 * 100);
		 * 
		 * JTextField EndTime1LB = new JTextField(); EndTime1LB.setBounds(900, 50, 70,
		 * 30); JLabel EndTime1L = new JLabel(); EndTime1L.setText("EndTime :");
		 * EndTime1L.setBounds(840, 10, 200, 100);
		 * 
		 * JTextField CreditHours1LB = new JTextField(); CreditHours1LB.setBounds(1075,
		 * 50, 70, 30); JLabel CreditHours1L = new JLabel();
		 * CreditHours1L.setText("Credit Hours :"); CreditHours1L.setBounds(990, 10,
		 * 200, 100);
		 * 
		 * JTextField Priority1LB = new JTextField(); Priority1LB.setBounds(1225, 50,
		 * 70, 30); JLabel Priority1L = new JLabel(); Priority1L.setText("Priority? :");
		 * Priority1L.setBounds(1160, 10, 200, 100);
		 * 
		 * // class 1 add to frame f.add(Class1); f.add(Dept1LB); f.add(Dept1L);
		 * f.add(Level1LB); f.add(Level1L); f.add(Crn1LB); f.add(Crn1L); f.add(Days1LB);
		 * f.add(Days1L); f.add(StartTime1LB); f.add(StartTime1L); f.add(EndTime1LB);
		 * f.add(EndTime1L); f.add(CreditHours1LB); f.add(CreditHours1L);
		 * f.add(Priority1LB); f.add(Priority1L);
		 */
		// Example inputs
		JLabel ClassE = new JLabel();
		ClassE.setText("Class Example :");
		ClassE.setBounds(10, 750, 200, 100);

		JLabel DeptEL = new JLabel();
		DeptEL.setText("Dept :");
		DeptEL.setBounds(110, 750, 200, 100);
		JLabel DeptELE = new JLabel();
		DeptELE.setText("CS");
		DeptELE.setBounds(150, 750, 200, 100);

		JLabel LevelEL = new JLabel();
		LevelEL.setText("Level :");
		LevelEL.setBounds(260, 750, 200, 100);
		JLabel LevelELE = new JLabel();
		LevelELE.setText("3141");
		LevelELE.setBounds(300, 750, 200, 100);

		JLabel CrnEL = new JLabel();
		CrnEL.setText("CRN :");
		CrnEL.setBounds(410, 750, 200, 100);
		JLabel CrnELE = new JLabel();
		CrnELE.setText("12345");
		CrnELE.setBounds(440, 750, 200, 100);

		JLabel DaysEL = new JLabel();
		DaysEL.setText("Days :");
		DaysEL.setBounds(560, 750, 200, 100);
		JLabel DaysELE = new JLabel();
		DaysELE.setText("MWF");
		DaysELE.setBounds(600, 750, 200, 100);

		JLabel StartTimeEL = new JLabel();
		StartTimeEL.setText("Start Time :");
		StartTimeEL.setBounds(690, 750, 200, 100);
		JLabel StartTimeELE = new JLabel();
		StartTimeELE.setText("1305");
		StartTimeELE.setBounds(760, 750, 200, 100);

		JLabel EndTimeEL = new JLabel();
		EndTimeEL.setText("EndTime :");
		EndTimeEL.setBounds(840, 750, 200, 100);
		JLabel EndTimeELE = new JLabel();
		EndTimeELE.setText("1355");
		EndTimeELE.setBounds(900, 750, 200, 100);

		JLabel CreditHoursEL = new JLabel();
		CreditHoursEL.setText("Credit Hours :");
		CreditHoursEL.setBounds(990, 750, 200, 100);
		JLabel CreditHoursELE = new JLabel();
		CreditHoursELE.setText("3");
		CreditHoursELE.setBounds(1070, 750, 200, 100);

		JLabel PriorityEL = new JLabel();
		PriorityEL.setText("Priority? :");
		PriorityEL.setBounds(1160, 750, 200, 100);
		JLabel PriorityELE = new JLabel();
		PriorityELE.setText("Y");
		PriorityELE.setBounds(1220, 750, 200, 100);

		// class Example add to frame
		f.add(ClassE);

		f.add(DeptEL);
		f.add(DeptELE);
		f.add(LevelEL);
		f.add(LevelELE);
		f.add(CrnEL);
		f.add(CrnELE);
		f.add(DaysEL);
		f.add(DaysELE);
		f.add(StartTimeEL);
		f.add(StartTimeELE);
		f.add(EndTimeEL);
		f.add(EndTimeELE);
		f.add(CreditHoursEL);
		f.add(CreditHoursELE);
		f.add(PriorityEL);
		f.add(PriorityELE);

		// Main add to frame
		f.add(StrtLabel);
		f.add(Semester);
		f.add(semesterlabel);
		f.add(Start);
		f.setSize(1500, 1500);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// action listener
		Start.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				StrtLabel.setText("Eat a dick");
				String semester = Semester.getText();
				System.out.println(semester);
				/*
				 * //Class 1 inputs String Dept1 = Dept1LB.getText(); String Level1 =
				 * Level1LB.getText(); String Crn1 = Crn1LB.getText(); String Days1 =
				 * Days1LB.getText(); String StTime1 = StartTime1LB.getText(); String EnTime1 =
				 * EndTime1LB.getText(); String CreditHours1 = CreditHours1LB.getText(); String
				 * Priority1 = Priority1LB.getText();
				 * 
				 * // Verify outputs System.out.println(Dept1); System.out.println(Level1);
				 * System.out.println(Crn1); System.out.println(Days1);
				 * System.out.println(StTime1); System.out.println(EnTime1);
				 * System.out.println(CreditHours1); System.out.println(Priority1);
				 */
			}
		});

	}

	public static void main(String[] args) {
		new testing();
	}
}
