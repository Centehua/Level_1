import java.awt.Component;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;



public class Photo 

{
	
	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);
		

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
		String image = "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f1/2ChocolateChipCookies.jpg/1200px-2ChocolateChipCookies.jpg";
		// 2. create a variable of type "Component" that will hold your image

		Component image2;
		// 3. use the "createImage()" method below to initialize your Component
		image2 = createImage(image);
		image2.addMouseListener(null);
		
		
		// 4. add the image to the quiz window
		quizWindow.add(image2);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String question = JOptionPane.showInputDialog("What is your favorite type of cookie");
		// 7. print "CORRECT" if the user gave the right answer
		if(question.equalsIgnoreCase("chocolate chip")) {
			
		System.out.println("Correct");
		System.out.println("1 Point");

		}
		// 8. print "INCORRECT" if the answer is wrong
		else{
			System.out.println("Incorrect");
		}
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
		quizWindow.remove(image2);
		// 10. find another image and create it (might take more than one line of code)
		String url = ("http://food.fnr.sndimg.com/content/dam/images/food/fullset/2015/9/15/1/FNK_Chewy-Sugar-Cookies_s4x3.jpg.rend.hgtvcom.616.462.suffix/1442375395564.jpeg");
		Component image3 = createImage(url);
				
		// 11. add the second image to the quiz window
		quizWindow.add(image3);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		
		String question2 = JOptionPane.showInputDialog("Do you like sugar cookies?");
		// 14+ check answer, say if correct or incorrect, etc.
		if(question2.equalsIgnoreCase("No")) {
			
			System.out.println("Correct");	
			System.out.println("1 Point");
		
		}else {
		System.out.println("Incorrect");	
		}  
		
	
		
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	

	

	/* OPTIONAL */
	// *14. add scoring to your quiz
	
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 

}
