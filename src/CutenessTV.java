import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	JButton duck = new JButton("Duck");
	 JButton frog = new JButton("Frog");
	 JButton fluffy = new JButton("FluffyUnicorns");
 public static void main(String[] args) {
	 new CutenessTV().makeButtons();
	 
}
 
 public void makeButtons() {
	 
	 JFrame frame = new JFrame();
	 JPanel panel = new JPanel();

	 frame.setVisible(true);
	 frame.setSize(200, 150);
	 frame.add(panel);
	 
	 panel.add(duck); 
	 panel.add(frog);
	 panel.add(fluffy);
	 frame.pack();
	 
	 duck.addActionListener(this);
	 frog.addActionListener(this);
	 fluffy.addActionListener(this);
 }
 
 
 
 void showDucks() {
		playVideo("Drirjl5K9Yk");
	}

	void showFrog() {
		playVideo("1WgeW7gy4xo");
	}
	
	void showFluffyUnicorns() {
		playVideo("ky3Ordfqn88");
	}

	void playVideo(String videoID) {
		System.out.println("https://www.youtube.com/v/" + videoID + "?autoplay=1");
		try {
	URI uri = new URI("https://www.youtube.com/watch?v=" + videoID + "?autoplay=1");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(duck==e.getSource()) {
			showDucks();
		}else if(frog==e.getSource()) {
			showFrog();
		}else if(fluffy==e.getSource()) {
			showFluffyUnicorns();
		}
		
		
	}


}
