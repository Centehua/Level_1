import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GetLatestTweet {
	JFrame frame;
	JPanel panel;
	JButton button;
	JTextField text;
	
 public static void main(String[] args) {
	 new GetLatestTweet().newUI();
}

private void newUI() {
	frame = new JFrame();
	frame.setVisible(true);
	frame.add(panel);
	
}
}
