import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class SpamAlot implements ActionListener{
static final String FAKE_USERNAME = "cookieicecream2342@gmail.com";
static final String FAKE_PASSWORD = "mycookieisbetter";

	
	JFrame frame;
	JPanel panel;
	JButton b1;
	JButton b2; 
	JTextField field;
	String text;
	String text2;
	String text3;
	
	public static void main(String[] args) {
	 new SpamAlot().UI();
	 
	}

	public void UI() {
		frame = new JFrame();
		panel = new JPanel();
		b1 = new JButton("BAD");
		b2= new JButton("GOOD");
		field = new JTextField(15);
		
		frame.setVisible(true);
		
		panel.add(field);
		panel.add(b1);
		panel.add(b2);
		frame.add(panel);
		b1.addActionListener(this);
		b2.addActionListener(this);
		frame.pack();
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//bad button
	if(b1== e.getSource()) {
	text= field.getText();
	
	Boolean a=	sendSpam(text,"Food from New York","Give me food you bitch");
	if(a==true) {
	field.setBackground(Color.GREEN);//if send
	}else {
		field.setBackground(Color.RED);//if fail 
	}
	//good button
	}else if(b2==e.getSource()) {
		text= field.getText();
		Boolean b =sendSpam(text,"Hello from New York","Hello lil Pleb");
		if(b==true) {
		field.setBackground(Color.GREEN);//if send
		}else {
			field.setBackground(Color.RED);//if fail 
		}
	} 
	}
	private boolean sendSpam(String recipient, String subject, String content) {

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
				return new javax.mail.PasswordAuthentication(FAKE_USERNAME, FAKE_PASSWORD);
			}
		});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(FAKE_USERNAME));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
			message.setSubject(subject);
			message.setText(content);
			Transport.send(message);
			return true;

		} catch (MessagingException e) {
e.printStackTrace();
return false;
		}
	}
	String sendTextMessage(String phoneNumber, String message){
		if(sendSpam(phoneNumber + "@tmomail.net", "", message)) return "T-Mobile"; 
		if(sendSpam(phoneNumber + "@vmobl.com", "", message)) return "Virgin Mobile"; 
		if(sendSpam(phoneNumber + "@cingularme.com", "", message)) return "Cingular"; 
		if(sendSpam(phoneNumber + "@messaging.sprintpcs.com", "", message)) return "Sprint"; 
		if(sendSpam(phoneNumber + "@vtext.com", "", message)) return "Verizon"; 
		if(sendSpam(phoneNumber + "@messaging.nextel.com", "", message)) return "Nextel"; 
		return "FAIL!";
	}



	
	
}
