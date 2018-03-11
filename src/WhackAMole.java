import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class WhackAMole implements ActionListener {
int rNum;
JFrame frame;
JPanel panel;
JButton b1;

public static void main(String[] args) {
	WhackAMole w1 = new WhackAMole ();
	Random R1 = new Random();
	int  rNum =R1.nextInt(25);
	w1.drawButton(rNum);
	
	
}
	
	public void drawButton(int rNum) {
		frame = new JFrame("Whack a Button for Fame and Glory");
		panel = new JPanel();
		
		
		
		frame.add(panel);
		
		for (int i = 0; i < 24; i++) {
		b1 = new JButton();	
		b1.addActionListener(this);
		panel.add(b1);
		
			
			if(i==rNum) {
				b1.setText("mole!");		
				
			} 
			
		}
		
		
		frame.setSize(300,320);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
	}
	void speak(String words) {
		try {
		Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
		e.printStackTrace();
		}
		}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		
	}

	
}
