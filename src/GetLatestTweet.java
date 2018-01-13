import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GetLatestTweet implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton button;
	JTextField text;
       
	
 public static void main(String[] args) {
	 new GetLatestTweet().newUI();
}

private void newUI() {
    // frame is visible 
	frame = new JFrame();
        frame.setSize(500,400);
        frame.setVisible(true);
        
      //button and text added to panel 
        panel = new JPanel();
        button = new JButton();
        text= new JTextField(20);
        panel.add(button);
        panel.add(text);
         
        button.addActionListener(this);
     
        //panel added to frame 
       frame.add(panel);
        
       //frame pack and exit 
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
	
}

    @Override
    public void actionPerformed(ActionEvent e) {
            Object a = e.getSource();
         if(button==a)    {
         System.out.println("a");
         }    
    }
}
