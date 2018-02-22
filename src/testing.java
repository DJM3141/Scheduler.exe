
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class testing {
	testing(){    
		JFrame f=new JFrame("Scheduler.exe"); 
		
					//submit button
		JButton Start=new JButton("Generate");    
		Start.setBounds(100,700,140, 40);   
					//semester label
		JLabel semesterlabel = new JLabel();		
		semesterlabel.setText("Semester:");
		semesterlabel.setBounds(680, 10, 85, 30);
					//empty label which will show event after button clicked
		JLabel StrtLabel = new JLabel();
		StrtLabel.setBounds(10, 810, 100, 100);
					//textfield to enter name
		JTextField Semester= new JTextField();
		Semester.setBounds(750, 10, 85, 30);
	
		
			// Class 1
	JLabel Class1 = new JLabel();		
	Class1.setText("Class 1 :");
	Class1.setBounds(10, 10, 200, 100);
	
		JTextField Dept1LB= new JTextField();
		Dept1LB.setBounds(150, 50, 70, 30);
		JLabel Dept1L = new JLabel();		
		Dept1L.setText("Dept :");
		Dept1L.setBounds(110, 10, 200, 100);
		
		JTextField Level1LB= new JTextField();
		Level1LB.setBounds(300, 50, 70, 30);
		JLabel Level1L = new JLabel();		
		Level1L.setText("Level :");
		Level1L.setBounds(260, 10, 200, 100);
		
		JTextField Crn1LB= new JTextField();
		Crn1LB.setBounds(450, 50, 70, 30);
		JLabel Crn1L = new JLabel();		
		Crn1L.setText("CRN :");
		Crn1L.setBounds(410, 10, 200, 100);
		
		JTextField Days1LB= new JTextField();
		Days1LB.setBounds(600, 50, 70, 30);
		JLabel Days1L = new JLabel();		
		Days1L.setText("Days :");
		Days1L.setBounds(560, 10, 200, 100);
		
		JTextField StartTime1LB= new JTextField();
		StartTime1LB.setBounds(760, 50, 70, 30);
		JLabel StartTime1L = new JLabel();		
		StartTime1L.setText("Start Time :");
		StartTime1L.setBounds(690, 10, 200, 100);
		
		JTextField EndTime1LB= new JTextField();
		EndTime1LB.setBounds(900, 50, 70, 30);
		JLabel EndTime1L = new JLabel();		
		EndTime1L.setText("EndTime :");
		EndTime1L.setBounds(840, 10, 200, 100);
		
		JTextField CreditHours1LB= new JTextField();
		CreditHours1LB.setBounds(1075, 50, 70, 30);
		JLabel CreditHours1L = new JLabel();		
		CreditHours1L.setText("Credit Hours :");
		CreditHours1L.setBounds(990, 10, 200, 100);
		
				//class 1 add to frame
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

		// Class 2
	JLabel Class2 = new JLabel();		
	Class2.setText("Class 2 :");
	Class2.setBounds(10, 50, 200, 100);
	
		JTextField Dept2LB= new JTextField();
		Dept2LB.setBounds(150, 90, 70, 30);
		JLabel Dept2L = new JLabel();		
		Dept2L.setText("Dept :");
		Dept2L.setBounds(110, 50, 200, 100);
		
		JTextField Level2LB= new JTextField();
		Level2LB.setBounds(300, 90, 70, 30);
		JLabel Level2L = new JLabel();		
		Level2L.setText("Level :");
		Level2L.setBounds(260, 50, 200, 100);
		
		JTextField Crn2LB= new JTextField();
		Crn2LB.setBounds(450, 90, 70, 30);
		JLabel Crn2L = new JLabel();		
		Crn2L.setText("CRN :");
		Crn2L.setBounds(410, 50, 200, 100);
		
		JTextField Days2LB= new JTextField();
		Days2LB.setBounds(600, 90, 70, 30);
		JLabel Days2L = new JLabel();		
		Days2L.setText("Days :");
		Days2L.setBounds(560, 50, 200, 100);
		
		JTextField StartTime2LB= new JTextField();
		StartTime2LB.setBounds(760, 90, 70, 30);
		JLabel StartTime2L = new JLabel();		
		StartTime2L.setText("Start Time :");
		StartTime2L.setBounds(690, 50, 200, 100);
		
		JTextField EndTime2LB= new JTextField();
		EndTime2LB.setBounds(900, 90, 70, 30);
		JLabel EndTime2L = new JLabel();		
		EndTime2L.setText("EndTime :");
		EndTime2L.setBounds(840, 50, 200, 100);
		
		JTextField CreditHours2LB= new JTextField();
		CreditHours2LB.setBounds(1075, 90, 70, 30);
		JLabel CreditHours2L = new JLabel();		
		CreditHours2L.setText("Credit Hours :");
		CreditHours2L.setBounds(990, 50, 200, 100);
		
				//class 2 add to frame
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
		
					//add to frame
		f.add(StrtLabel);
		f.add(Semester);
		f.add(semesterlabel);
		f.add(Start);
		f.setSize(1500,1500);    
		f.setLayout(null);    
		f.setVisible(true);    
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
		
							//action listener
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
