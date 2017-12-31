import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

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
        button = new JButton("Search the Twitterverse");
        text= new JTextField(20);
        panel.add(text);
        panel.add(button);
        button.addActionListener(this);
     
       
		
        
        frame.add(panel);
        
       //frame pack and exit 
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
	
}

   
    public void actionPerformed(ActionEvent e) {
        if(button==e.getSource()) {
        	System.out.println("tweet tweet");
        	String tweet= text.getText();
       String tweetText =getLatestTweet(tweet);
       
	System.out.println(tweetText);
        	
  
        }
    }
    private String getLatestTweet(String searchingFor) {

		Twitter twitter = new TwitterFactory().getInstance();
		AccessToken accessToken = new AccessToken(
				"2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
				"vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");
		twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN",
				"6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");
		twitter.setOAuthAccessToken(accessToken);

		Query query = new Query(searchingFor);
		try {
			QueryResult result = twitter.search(query);
			return result.getTweets().get(0).getText();
		} catch (Exception e) {
			System.err.print(e.getMessage());
			return "What the heck is that?";
		}
	}


    
}
