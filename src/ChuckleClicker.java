import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	
	JButton firstButton = new JButton("joke");
		JButton secondButton = new JButton("punchline");
	public static void main(String[] args) {
		
		new ChuckleClicker().makeButtons();
		
	}
	
	public void makeButtons() {
		
		JFrame frame = new JFrame();
		
		
		frame.setVisible(true);
		frame.setSize(200,50);
		
		JPanel panel = new JPanel();
		
		panel.add(firstButton);
		panel.add(secondButton);
		frame.add(panel);
		
		firstButton.addActionListener(this);
		secondButton.addActionListener(this);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==firstButton) {
			JOptionPane.showMessageDialog(null, "Hi Why are teddy bears never hungry?");
		
		} else if(e.getSource()==secondButton) {
			JOptionPane.showMessageDialog(null, "Hi Because they are always stuffed!");
		}
		
	}
	
}
