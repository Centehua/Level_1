import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.*;

public class WhackAMole implements ActionListener {
int rNum;
JFrame frame;
JPanel panel;
JButton b1;
JButton b2;


int MoleCount;
int MissCount;
static Date timeAtStart;

public static void main(String[] args) {
	
	timeAtStart = new Date();
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
//				b1.setText("mole!");		
				b2= new JButton();
			
				
				b2.addActionListener(this);
				
				b2=b1;
				
				
			} 
			
		}
		
		
		frame.setSize(300,320);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
//		frame.dispose();
		
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
//	timeAtStart=;
	
	if(b2==e.getSource()) {
		b2.setText("Mole!");
		playSound("moo.wav");
		MoleCount+=1;
		if(MoleCount==10) {
	endGame(timeAtStart,10);
	
		}
	}else {
		speak("Dork");
		MissCount+=1;
		if(MissCount==2) {
			System.out.println("aa");
			speak("idiot");
		} else if(MissCount==3) {
			System.out.println("ss");
			speak("moron");
		} else if(MissCount == 5) {
			System.out.println("bb");
			speak("complete waste of atoms");
		} 
	}
	
		
		
		} 
	
	
	
	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	
		
	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
		+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");

}
	
}
