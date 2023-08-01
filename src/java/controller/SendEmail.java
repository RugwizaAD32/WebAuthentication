/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author HP
 */
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author yves
 */
public class SendEmail {
    private String username;
    private String password;

    public SendEmail(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public void sendingEmail(String userEmail, String subject, String body) throws MessagingException{
        Properties props = new Properties();
        props.put("mail.smtp.host","smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", true);
        props.put("mail.smtp.starttls.enable", true);
        
        Session session = Session.getDefaultInstance(props, new Authenticator(){
           @Override
           protected PasswordAuthentication getPasswordAuthentication(){
               return new PasswordAuthentication(username, password);
           }
        });
        
        Message message  = new MimeMessage(session);
        message.setFrom(new InternetAddress(username));
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(userEmail));
        message.setSubject(subject);
        message.setText(body);
        Transport.send(message);
    }

    void sendEmail(String recipientEmail, String subject, String text) {
        
    }
}

