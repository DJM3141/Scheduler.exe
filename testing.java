
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

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

		// Class 1
		JLabel Class1 = new JLabel();
		Class1.setText("Class 1 :");
		Class1.setBounds(10, 10, 200, 100);

		JTextField Dept1LB = new JTextField();
		Dept1LB.setBounds(150, 50, 70, 30);
		JLabel Dept1L = new JLabel();
		Dept1L.setText("Dept :");
		Dept1L.setBounds(110, 10, 200, 100);

		JTextField Level1LB = new JTextField();
		Level1LB.setBounds(300, 50, 70, 30);
		JLabel Level1L = new JLabel();
		Level1L.setText("Level :");
		Level1L.setBounds(260, 10, 200, 100);

		JTextField Crn1LB = new JTextField();
		Crn1LB.setBounds(450, 50, 70, 30);
		JLabel Crn1L = new JLabel();
		Crn1L.setText("CRN :");
		Crn1L.setBounds(410, 10, 200, 100);

		JTextField Days1LB = new JTextField();
		Days1LB.setBounds(600, 50, 70, 30);
		JLabel Days1L = new JLabel();
		Days1L.setText("Days :");
		Days1L.setBounds(560, 10, 200, 100);

		JTextField StartTime1LB = new JTextField();
		StartTime1LB.setBounds(760, 50, 70, 30);
		JLabel StartTime1L = new JLabel();
		StartTime1L.setText("Start Time :");
		StartTime1L.setBounds(690, 10, 200, 100);

		JTextField EndTime1LB = new JTextField();
		EndTime1LB.setBounds(900, 50, 70, 30);
		JLabel EndTime1L = new JLabel();
		EndTime1L.setText("EndTime :");
		EndTime1L.setBounds(840, 10, 200, 100);

		JTextField CreditHours1LB = new JTextField();
		CreditHours1LB.setBounds(1075, 50, 70, 30);
		JLabel CreditHours1L = new JLabel();
		CreditHours1L.setText("Credit Hours :");
		CreditHours1L.setBounds(990, 10, 200, 100);

		JTextField Priority1LB = new JTextField();
		Priority1LB.setBounds(1225, 50, 70, 30);
		JLabel Priority1L = new JLabel();
		Priority1L.setText("Priority? :");
		Priority1L.setBounds(1160, 10, 200, 100);

		// class 1 add to frame
		f.add(Class1);
		f.add(Dept1LB);
		f.add(Dept1L);
		f.add(Level1LB);
		f.add(Level1L);
		f.add(Crn1LB);
		f.add(Crn1L);
		f.add(Days1LB);
		f.add(Days1L);
		f.add(StartTime1LB);
		f.add(StartTime1L);
		f.add(EndTime1LB);
		f.add(EndTime1L);
		f.add(CreditHours1LB);
		f.add(CreditHours1L);
		f.add(Priority1LB);
		f.add(Priority1L);

		// Class 2
		JLabel Class2 = new JLabel();
		Class2.setText("Class 2 :");
		Class2.setBounds(10, 50, 200, 100);

		JTextField Dept2LB = new JTextField();
		Dept2LB.setBounds(150, 90, 70, 30);
		JLabel Dept2L = new JLabel();
		Dept2L.setText("Dept :");
		Dept2L.setBounds(110, 50, 200, 100);

		JTextField Level2LB = new JTextField();
		Level2LB.setBounds(300, 90, 70, 30);
		JLabel Level2L = new JLabel();
		Level2L.setText("Level :");
		Level2L.setBounds(260, 50, 200, 100);

		JTextField Crn2LB = new JTextField();
		Crn2LB.setBounds(450, 90, 70, 30);
		JLabel Crn2L = new JLabel();
		Crn2L.setText("CRN :");
		Crn2L.setBounds(410, 50, 200, 100);

		JTextField Days2LB = new JTextField();
		Days2LB.setBounds(600, 90, 70, 30);
		JLabel Days2L = new JLabel();
		Days2L.setText("Days :");
		Days2L.setBounds(560, 50, 200, 100);

		JTextField StartTime2LB = new JTextField();
		StartTime2LB.setBounds(760, 90, 70, 30);
		JLabel StartTime2L = new JLabel();
		StartTime2L.setText("Start Time :");
		StartTime2L.setBounds(690, 50, 200, 100);

		JTextField EndTime2LB = new JTextField();
		EndTime2LB.setBounds(900, 90, 70, 30);
		JLabel EndTime2L = new JLabel();
		EndTime2L.setText("EndTime :");
		EndTime2L.setBounds(840, 50, 200, 100);

		JTextField CreditHours2LB = new JTextField();
		CreditHours2LB.setBounds(1075, 90, 70, 30);
		JLabel CreditHours2L = new JLabel();
		CreditHours2L.setText("Credit Hours :");
		CreditHours2L.setBounds(990, 50, 200, 100);

		JTextField Priority2LB = new JTextField();
		Priority2LB.setBounds(1225, 90, 70, 30);
		JLabel Priority2L = new JLabel();
		Priority2L.setText("Priority? :");
		Priority2L.setBounds(1160, 50, 200, 100);

		// class 2 add to frame
		f.add(Class2);
		f.add(Dept2LB);
		f.add(Dept2L);
		f.add(Level2LB);
		f.add(Level2L);
		f.add(Crn2LB);
		f.add(Crn2L);
		f.add(Days2LB);
		f.add(Days2L);
		f.add(StartTime2LB);
		f.add(StartTime2L);
		f.add(EndTime2LB);
		f.add(EndTime2L);
		f.add(CreditHours2LB);
		f.add(CreditHours2L);
		f.add(Priority2LB);
		f.add(Priority2L);

		// Class 3
		JLabel Class3 = new JLabel();
		Class3.setText("Class 3 :");
		Class3.setBounds(10, 90, 200, 100);

		JTextField Dept3LB = new JTextField();
		Dept3LB.setBounds(150, 130, 70, 30);
		JLabel Dept3L = new JLabel();
		Dept3L.setText("Dept :");
		Dept3L.setBounds(110, 90, 200, 100);

		JTextField Level3LB = new JTextField();
		Level3LB.setBounds(300, 130, 70, 30);
		JLabel Level3L = new JLabel();
		Level3L.setText("Level :");
		Level3L.setBounds(260, 90, 200, 100);

		JTextField Crn3LB = new JTextField();
		Crn3LB.setBounds(450, 130, 70, 30);
		JLabel Crn3L = new JLabel();
		Crn3L.setText("CRN :");
		Crn3L.setBounds(410, 90, 200, 100);

		JTextField Days3LB = new JTextField();
		Days3LB.setBounds(600, 130, 70, 30);
		JLabel Days3L = new JLabel();
		Days3L.setText("Days :");
		Days3L.setBounds(560, 90, 200, 100);

		JTextField StartTime3LB = new JTextField();
		StartTime3LB.setBounds(760, 130, 70, 30);
		JLabel StartTime3L = new JLabel();
		StartTime3L.setText("Start Time :");
		StartTime3L.setBounds(690, 90, 200, 100);

		JTextField EndTime3LB = new JTextField();
		EndTime3LB.setBounds(900, 130, 70, 30);
		JLabel EndTime3L = new JLabel();
		EndTime3L.setText("EndTime :");
		EndTime3L.setBounds(840, 90, 200, 100);

		JTextField CreditHours3LB = new JTextField();
		CreditHours3LB.setBounds(1075, 130, 70, 30);
		JLabel CreditHours3L = new JLabel();
		CreditHours3L.setText("Credit Hours :");
		CreditHours3L.setBounds(990, 90, 200, 100);

		JTextField Priority3LB = new JTextField();
		Priority3LB.setBounds(1225, 130, 70, 30);
		JLabel Priority3L = new JLabel();
		Priority3L.setText("Priority? :");
		Priority3L.setBounds(1160, 90, 200, 100);

		// class 3 add to frame
		f.add(Class3);
		f.add(Dept3LB);
		f.add(Dept3L);
		f.add(Level3LB);
		f.add(Level3L);
		f.add(Crn3LB);
		f.add(Crn3L);
		f.add(Days3LB);
		f.add(Days3L);
		f.add(StartTime3LB);
		f.add(StartTime3L);
		f.add(EndTime3LB);
		f.add(EndTime3L);
		f.add(CreditHours3LB);
		f.add(CreditHours3L);
		f.add(Priority3LB);
		f.add(Priority3L);

		// Class 4
		JLabel Class4 = new JLabel();
		Class4.setText("Class 4 :");
		Class4.setBounds(10, 130, 200, 100);

		JTextField Dept4LB = new JTextField();
		Dept4LB.setBounds(150, 170, 70, 30);
		JLabel Dept4L = new JLabel();
		Dept4L.setText("Dept :");
		Dept4L.setBounds(110, 130, 200, 100);

		JTextField Level4LB = new JTextField();
		Level4LB.setBounds(300, 170, 70, 30);
		JLabel Level4L = new JLabel();
		Level4L.setText("Level :");
		Level4L.setBounds(260, 130, 200, 100);

		JTextField Crn4LB = new JTextField();
		Crn4LB.setBounds(450, 170, 70, 30);
		JLabel Crn4L = new JLabel();
		Crn4L.setText("CRN :");
		Crn4L.setBounds(410, 130, 200, 100);

		JTextField Days4LB = new JTextField();
		Days4LB.setBounds(600, 170, 70, 30);
		JLabel Days4L = new JLabel();
		Days4L.setText("Days :");
		Days4L.setBounds(560, 130, 200, 100);

		JTextField StartTime4LB = new JTextField();
		StartTime4LB.setBounds(760, 170, 70, 30);
		JLabel StartTime4L = new JLabel();
		StartTime4L.setText("Start Time :");
		StartTime4L.setBounds(690, 130, 200, 100);

		JTextField EndTime4LB = new JTextField();
		EndTime4LB.setBounds(900, 170, 70, 30);
		JLabel EndTime4L = new JLabel();
		EndTime4L.setText("EndTime :");
		EndTime4L.setBounds(840, 130, 200, 100);

		JTextField CreditHours4LB = new JTextField();
		CreditHours4LB.setBounds(1075, 170, 70, 30);
		JLabel CreditHours4L = new JLabel();
		CreditHours4L.setText("Credit Hours :");
		CreditHours4L.setBounds(990, 130, 200, 100);

		JTextField Priority4LB = new JTextField();
		Priority4LB.setBounds(1225, 170, 70, 30);
		JLabel Priority4L = new JLabel();
		Priority4L.setText("Priority? :");
		Priority4L.setBounds(1160, 130, 200, 100);

		// class 4 add to frame
		f.add(Class4);
		f.add(Dept4LB);
		f.add(Dept4L);
		f.add(Level4LB);
		f.add(Level4L);
		f.add(Crn4LB);
		f.add(Crn4L);
		f.add(Days4LB);
		f.add(Days4L);
		f.add(StartTime4LB);
		f.add(StartTime4L);
		f.add(EndTime4LB);
		f.add(EndTime4L);
		f.add(CreditHours4LB);
		f.add(CreditHours4L);
		f.add(Priority4LB);
		f.add(Priority4L);

		// Class 5
		JLabel Class5 = new JLabel();
		Class5.setText("Class 5 :");
		Class5.setBounds(10, 170, 200, 100);

		JTextField Dept5LB = new JTextField();
		Dept5LB.setBounds(150, 210, 70, 30);
		JLabel Dept5L = new JLabel();
		Dept5L.setText("Dept :");
		Dept5L.setBounds(110, 170, 200, 100);

		JTextField Level5LB = new JTextField();
		Level5LB.setBounds(300, 210, 70, 30);
		JLabel Level5L = new JLabel();
		Level5L.setText("Level :");
		Level5L.setBounds(260, 170, 200, 100);

		JTextField Crn5LB = new JTextField();
		Crn5LB.setBounds(450, 210, 70, 30);
		JLabel Crn5L = new JLabel();
		Crn5L.setText("CRN :");
		Crn5L.setBounds(410, 170, 200, 100);

		JTextField Days5LB = new JTextField();
		Days5LB.setBounds(600, 210, 70, 30);
		JLabel Days5L = new JLabel();
		Days5L.setText("Days :");
		Days5L.setBounds(560, 170, 200, 100);

		JTextField StartTime5LB = new JTextField();
		StartTime5LB.setBounds(760, 210, 70, 30);
		JLabel StartTime5L = new JLabel();
		StartTime5L.setText("Start Time :");
		StartTime5L.setBounds(690, 170, 200, 100);

		JTextField EndTime5LB = new JTextField();
		EndTime5LB.setBounds(900, 210, 70, 30);
		JLabel EndTime5L = new JLabel();
		EndTime5L.setText("EndTime :");
		EndTime5L.setBounds(840, 170, 200, 100);

		JTextField CreditHours5LB = new JTextField();
		CreditHours5LB.setBounds(1075, 210, 70, 30);
		JLabel CreditHours5L = new JLabel();
		CreditHours5L.setText("Credit Hours :");
		CreditHours5L.setBounds(990, 170, 200, 100);

		JTextField Priority5LB = new JTextField();
		Priority5LB.setBounds(1225, 210, 70, 30);
		JLabel Priority5L = new JLabel();
		Priority5L.setText("Priority? :");
		Priority5L.setBounds(1160, 170, 200, 100);

		// class 5 add to frame
		f.add(Class5);
		f.add(Dept5LB);
		f.add(Dept5L);
		f.add(Level5LB);
		f.add(Level5L);
		f.add(Crn5LB);
		f.add(Crn5L);
		f.add(Days5LB);
		f.add(Days5L);
		f.add(StartTime5LB);
		f.add(StartTime5L);
		f.add(EndTime5LB);
		f.add(EndTime5L);
		f.add(CreditHours5LB);
		f.add(CreditHours5L);
		f.add(Priority5LB);
		f.add(Priority5L);

		// Class 6
		JLabel Class6 = new JLabel();
		Class6.setText("Class 6 :");
		Class6.setBounds(10, 210, 200, 100);

		JTextField Dept6LB = new JTextField();
		Dept6LB.setBounds(150, 250, 70, 30);
		JLabel Dept6L = new JLabel();
		Dept6L.setText("Dept :");
		Dept6L.setBounds(110, 210, 200, 100);

		JTextField Level6LB = new JTextField();
		Level6LB.setBounds(300, 250, 70, 30);
		JLabel Level6L = new JLabel();
		Level6L.setText("Level :");
		Level6L.setBounds(260, 210, 200, 100);

		JTextField Crn6LB = new JTextField();
		Crn6LB.setBounds(450, 250, 70, 30);
		JLabel Crn6L = new JLabel();
		Crn6L.setText("CRN :");
		Crn6L.setBounds(410, 210, 200, 100);

		JTextField Days6LB = new JTextField();
		Days6LB.setBounds(600, 250, 70, 30);
		JLabel Days6L = new JLabel();
		Days6L.setText("Days :");
		Days6L.setBounds(560, 210, 200, 100);

		JTextField StartTime6LB = new JTextField();
		StartTime6LB.setBounds(760, 250, 70, 30);
		JLabel StartTime6L = new JLabel();
		StartTime6L.setText("Start Time :");
		StartTime6L.setBounds(690, 210, 200, 100);

		JTextField EndTime6LB = new JTextField();
		EndTime6LB.setBounds(900, 250, 70, 30);
		JLabel EndTime6L = new JLabel();
		EndTime6L.setText("EndTime :");
		EndTime6L.setBounds(840, 210, 200, 100);

		JTextField CreditHours6LB = new JTextField();
		CreditHours6LB.setBounds(1075, 250, 70, 30);
		JLabel CreditHours6L = new JLabel();
		CreditHours6L.setText("Credit Hours :");
		CreditHours6L.setBounds(990, 210, 200, 100);

		JTextField Priority6LB = new JTextField();
		Priority6LB.setBounds(1225, 250, 70, 30);
		JLabel Priority6L = new JLabel();
		Priority6L.setText("Priority? :");
		Priority6L.setBounds(1160, 210, 200, 100);

		// class 6 add to frame
		f.add(Class6);
		f.add(Dept6LB);
		f.add(Dept6L);
		f.add(Level6LB);
		f.add(Level6L);
		f.add(Crn6LB);
		f.add(Crn6L);
		f.add(Days6LB);
		f.add(Days6L);
		f.add(StartTime6LB);
		f.add(StartTime6L);
		f.add(EndTime6LB);
		f.add(EndTime6L);
		f.add(CreditHours6LB);
		f.add(CreditHours6L);
		f.add(Priority6LB);
		f.add(Priority6L);

		// Class 7
		JLabel Class7 = new JLabel();
		Class7.setText("Class 7 :");
		Class7.setBounds(10, 250, 200, 100);

		JTextField Dept7LB = new JTextField();
		Dept7LB.setBounds(150, 290, 70, 30);
		JLabel Dept7L = new JLabel();
		Dept7L.setText("Dept :");
		Dept7L.setBounds(110, 250, 200, 100);

		JTextField Level7LB = new JTextField();
		Level7LB.setBounds(300, 290, 70, 30);
		JLabel Level7L = new JLabel();
		Level7L.setText("Level :");
		Level7L.setBounds(260, 250, 200, 100);

		JTextField Crn7LB = new JTextField();
		Crn7LB.setBounds(450, 290, 70, 30);
		JLabel Crn7L = new JLabel();
		Crn7L.setText("CRN :");
		Crn7L.setBounds(410, 250, 200, 100);

		JTextField Days7LB = new JTextField();
		Days7LB.setBounds(600, 290, 70, 30);
		JLabel Days7L = new JLabel();
		Days7L.setText("Days :");
		Days7L.setBounds(560, 250, 200, 100);

		JTextField StartTime7LB = new JTextField();
		StartTime7LB.setBounds(760, 290, 70, 30);
		JLabel StartTime7L = new JLabel();
		StartTime7L.setText("Start Time :");
		StartTime7L.setBounds(690, 250, 200, 100);

		JTextField EndTime7LB = new JTextField();
		EndTime7LB.setBounds(900, 290, 70, 30);
		JLabel EndTime7L = new JLabel();
		EndTime7L.setText("EndTime :");
		EndTime7L.setBounds(840, 250, 200, 100);

		JTextField CreditHours7LB = new JTextField();
		CreditHours7LB.setBounds(1075, 290, 70, 30);
		JLabel CreditHours7L = new JLabel();
		CreditHours7L.setText("Credit Hours :");
		CreditHours7L.setBounds(990, 250, 200, 100);

		JTextField Priority7LB = new JTextField();
		Priority7LB.setBounds(1225, 290, 70, 30);
		JLabel Priority7L = new JLabel();
		Priority7L.setText("Priority? :");
		Priority7L.setBounds(1160, 250, 200, 100);

		// class 7 add to frame
		f.add(Class7);
		f.add(Dept7LB);
		f.add(Dept7L);
		f.add(Level7LB);
		f.add(Level7L);
		f.add(Crn7LB);
		f.add(Crn7L);
		f.add(Days7LB);
		f.add(Days7L);
		f.add(StartTime7LB);
		f.add(StartTime7L);
		f.add(EndTime7LB);
		f.add(EndTime7L);
		f.add(CreditHours7LB);
		f.add(CreditHours7L);
		f.add(Priority7LB);
		f.add(Priority7L);

		// Class 8
		JLabel Class8 = new JLabel();
		Class8.setText("Class 8 :");
		Class8.setBounds(10, 290, 200, 100);

		JTextField Dept8LB = new JTextField();
		Dept8LB.setBounds(150, 330, 70, 30);
		JLabel Dept8L = new JLabel();
		Dept8L.setText("Dept :");
		Dept8L.setBounds(110, 290, 200, 100);

		JTextField Level8LB = new JTextField();
		Level8LB.setBounds(300, 330, 70, 30);
		JLabel Level8L = new JLabel();
		Level8L.setText("Level :");
		Level8L.setBounds(260, 290, 200, 100);

		JTextField Crn8LB = new JTextField();
		Crn8LB.setBounds(450, 330, 70, 30);
		JLabel Crn8L = new JLabel();
		Crn8L.setText("CRN :");
		Crn8L.setBounds(410, 290, 200, 100);

		JTextField Days8LB = new JTextField();
		Days8LB.setBounds(600, 330, 70, 30);
		JLabel Days8L = new JLabel();
		Days8L.setText("Days :");
		Days8L.setBounds(560, 290, 200, 100);

		JTextField StartTime8LB = new JTextField();
		StartTime8LB.setBounds(760, 330, 70, 30);
		JLabel StartTime8L = new JLabel();
		StartTime8L.setText("Start Time :");
		StartTime8L.setBounds(690, 290, 200, 100);

		JTextField EndTime8LB = new JTextField();
		EndTime8LB.setBounds(900, 330, 70, 30);
		JLabel EndTime8L = new JLabel();
		EndTime8L.setText("EndTime :");
		EndTime8L.setBounds(840, 290, 200, 100);

		JTextField CreditHours8LB = new JTextField();
		CreditHours8LB.setBounds(1075, 330, 70, 30);
		JLabel CreditHours8L = new JLabel();
		CreditHours8L.setText("Credit Hours :");
		CreditHours8L.setBounds(990, 290, 200, 100);

		JTextField Priority8LB = new JTextField();
		Priority8LB.setBounds(1225, 330, 70, 30);
		JLabel Priority8L = new JLabel();
		Priority8L.setText("Priority? :");
		Priority8L.setBounds(1160, 290, 200, 100);

		// class 8 add to frame
		f.add(Class8);
		f.add(Dept8LB);
		f.add(Dept8L);
		f.add(Level8LB);
		f.add(Level8L);
		f.add(Crn8LB);
		f.add(Crn8L);
		f.add(Days8LB);
		f.add(Days8L);
		f.add(StartTime8LB);
		f.add(StartTime8L);
		f.add(EndTime8LB);
		f.add(EndTime8L);
		f.add(CreditHours8LB);
		f.add(CreditHours8L);
		f.add(Priority8LB);
		f.add(Priority8L);

		// Class 9
		JLabel Class9 = new JLabel();
		Class9.setText("Class 9 :");
		Class9.setBounds(10, 330, 200, 100);

		JTextField Dept9LB = new JTextField();
		Dept9LB.setBounds(150, 370, 70, 30);
		JLabel Dept9L = new JLabel();
		Dept9L.setText("Dept :");
		Dept9L.setBounds(110, 330, 200, 100);

		JTextField Level9LB = new JTextField();
		Level9LB.setBounds(300, 370, 70, 30);
		JLabel Level9L = new JLabel();
		Level9L.setText("Level :");
		Level9L.setBounds(260, 330, 200, 100);

		JTextField Crn9LB = new JTextField();
		Crn9LB.setBounds(450, 370, 70, 30);
		JLabel Crn9L = new JLabel();
		Crn9L.setText("CRN :");
		Crn9L.setBounds(410, 330, 200, 100);

		JTextField Days9LB = new JTextField();
		Days9LB.setBounds(600, 370, 70, 30);
		JLabel Days9L = new JLabel();
		Days9L.setText("Days :");
		Days9L.setBounds(560, 330, 200, 100);

		JTextField StartTime9LB = new JTextField();
		StartTime9LB.setBounds(760, 370, 70, 30);
		JLabel StartTime9L = new JLabel();
		StartTime9L.setText("Start Time :");
		StartTime9L.setBounds(690, 330, 200, 100);

		JTextField EndTime9LB = new JTextField();
		EndTime9LB.setBounds(900, 370, 70, 30);
		JLabel EndTime9L = new JLabel();
		EndTime9L.setText("EndTime :");
		EndTime9L.setBounds(840, 330, 200, 100);

		JTextField CreditHours9LB = new JTextField();
		CreditHours9LB.setBounds(1075, 370, 70, 30);
		JLabel CreditHours9L = new JLabel();
		CreditHours9L.setText("Credit Hours :");
		CreditHours9L.setBounds(990, 330, 200, 100);

		JTextField Priority9LB = new JTextField();
		Priority9LB.setBounds(1225, 370, 70, 30);
		JLabel Priority9L = new JLabel();
		Priority9L.setText("Priority? :");
		Priority9L.setBounds(1160, 330, 200, 100);

		// class 9 add to frame
		f.add(Class9);
		f.add(Dept9LB);
		f.add(Dept9L);
		f.add(Level9LB);
		f.add(Level9L);
		f.add(Crn9LB);
		f.add(Crn9L);
		f.add(Days9LB);
		f.add(Days9L);
		f.add(StartTime9LB);
		f.add(StartTime9L);
		f.add(EndTime9LB);
		f.add(EndTime9L);
		f.add(CreditHours9LB);
		f.add(CreditHours9L);
		f.add(Priority9LB);
		f.add(Priority9L);

		// Class 10
		JLabel Class10 = new JLabel();
		Class10.setText("Class 10 :");
		Class10.setBounds(10, 370, 200, 100);

		JTextField Dept10LB = new JTextField();
		Dept10LB.setBounds(150, 410, 70, 30);
		JLabel Dept10L = new JLabel();
		Dept10L.setText("Dept :");
		Dept10L.setBounds(110, 370, 200, 100);

		JTextField Level10LB = new JTextField();
		Level10LB.setBounds(300, 410, 70, 30);
		JLabel Level10L = new JLabel();
		Level10L.setText("Level :");
		Level10L.setBounds(260, 370, 200, 100);

		JTextField Crn10LB = new JTextField();
		Crn10LB.setBounds(450, 410, 70, 30);
		JLabel Crn10L = new JLabel();
		Crn10L.setText("CRN :");
		Crn10L.setBounds(410, 370, 200, 100);

		JTextField Days10LB = new JTextField();
		Days10LB.setBounds(600, 410, 70, 30);
		JLabel Days10L = new JLabel();
		Days10L.setText("Days :");
		Days10L.setBounds(560, 370, 200, 100);

		JTextField StartTime10LB = new JTextField();
		StartTime10LB.setBounds(760, 410, 70, 30);
		JLabel StartTime10L = new JLabel();
		StartTime10L.setText("Start Time :");
		StartTime10L.setBounds(690, 370, 200, 100);

		JTextField EndTime10LB = new JTextField();
		EndTime10LB.setBounds(900, 410, 70, 30);
		JLabel EndTime10L = new JLabel();
		EndTime10L.setText("EndTime :");
		EndTime10L.setBounds(840, 370, 200, 100);

		JTextField CreditHours10LB = new JTextField();
		CreditHours10LB.setBounds(1075, 410, 70, 30);
		JLabel CreditHours10L = new JLabel();
		CreditHours10L.setText("Credit Hours :");
		CreditHours10L.setBounds(990, 370, 200, 100);

		JTextField Priority10LB = new JTextField();
		Priority10LB.setBounds(1225, 410, 70, 30);
		JLabel Priority10L = new JLabel();
		Priority10L.setText("Priority? :");
		Priority10L.setBounds(1160, 370, 200, 100);

		// class 10 add to frame
		f.add(Class10);
		f.add(Dept10LB);
		f.add(Dept10L);
		f.add(Level10LB);
		f.add(Level10L);
		f.add(Crn10LB);
		f.add(Crn10L);
		f.add(Days10LB);
		f.add(Days10L);
		f.add(StartTime10LB);
		f.add(StartTime10L);
		f.add(EndTime10LB);
		f.add(EndTime10L);
		f.add(CreditHours10LB);
		f.add(CreditHours10L);
		f.add(Priority10LB);
		f.add(Priority10L);

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
		StartTimeELE.setText("12:00");
		StartTimeELE.setBounds(760, 750, 200, 100);

		JLabel EndTimeEL = new JLabel();
		EndTimeEL.setText("EndTime :");
		EndTimeEL.setBounds(840, 750, 200, 100);
		JLabel EndTimeELE = new JLabel();
		EndTimeELE.setText("13:00");
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

			}
		});

	}

	public static void main(String[] args) {
		new testing();
	}
}
