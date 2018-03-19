
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class PrintInterface {
	PrintInterface() {
		JFrame f = new JFrame("DisplayInterface");
		f.setContentPane(new JLabel(new ImageIcon("Background3.jpg")));


		// Main add to frame
		f.setSize(800, 800);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	public static void main(String[] args) {
		new PrintInterface();
	}
}