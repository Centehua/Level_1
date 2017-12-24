import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	JFrame frame;
	JPanel panel;
	JTextField one;
	JTextField two;
	JButton button;
		public static void main(String[] args) {
		new BinaryConverter().createUI();
	}
 public void createUI(){
	 frame = new JFrame("Give me a binary number.");
	 frame.setSize(1000, 400);
	 
	 
	 panel= new JPanel();
	 frame.add(panel);
	 
	 one = new JTextField(20);
	 two = new JTextField(20);
	 
	 
	 
	 panel.add(one);
	

	 button = new JButton("convert");
	 button.addActionListener(this);
	 
	 panel.add(button); panel.add(two);
	 frame.setVisible(true);
	 frame.pack();
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	 
 } 	
 String convert(String binary) {
   	 int asciiValue = Integer.parseInt(binary, 2);
   	 char theLetter = (char) asciiValue;
   	 return "" + asciiValue;
    }
@Override
public void actionPerformed(ActionEvent e) {
	if(button==e.getSource()) {
		String fnum = one.getText();
		String ans= convert(fnum);
		two.setText(ans);
	}
	
}

	
}
