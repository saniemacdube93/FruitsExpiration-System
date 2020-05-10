/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nust.systems.workingcrud;

import java.time.LocalDate;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import nust.systems.workingcrud.emails.EmailSender;

/**
 *
 * @author NoNO
 */
public class Email {
    
    static Properties mailServerProperties;
    static Session getMailSession;
    static MimeMessage generateMailMessage;
    
    
    
    public static void main(String args[]){
     Email ab = new Email();
     ab.sendtoapplicant("mumuemunemo@gmail.com", "n0124u5u4", "Munemo", "Munashe");
        
    
    }
    
      public void sendtoapplicant(String email, String applicantNo, String surname, String name) {
        try {
            LocalDate currentDate = LocalDate.now();
            int y = currentDate.getYear();
            System.out.println("this is the year" + y);
            //Code to replace first char with N

            String year = Integer.toString(y);
            // Step1
            Properties mailServerProperties = System.getProperties();
            mailServerProperties.put("mail.smtp.port", "587");
            mailServerProperties.put("mail.smtp.host", "smtp.gmail.com");
            mailServerProperties.put("mail.smtp.auth", "true");
            mailServerProperties.put("mail.smtp.starttls.enable", "true");
            // Step2
            Session getMailSession = Session.getDefaultInstance(mailServerProperties, null);
            MimeMessage generateMailMessage = new MimeMessage(getMailSession);
            generateMailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress("saniemacdube93@gmail.com"));
         //   generateMailMessage.addRecipient(Message.RecipientType.CC, new InternetAddress("zibusiso.ndlovu@nust.ac.zw"));
            generateMailMessage.setSubject("Fresh Supplies ::Goods on Sale ");
            //String emailBody = "The applicant number'"+stud_id+"' has just paid an amount of '"+amount+"'. This email is to confirm payment. Your reference number is '"+reference+"'. Thank you";
            generateMailMessage.setContent("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n"
                    + "<html xmlns=\"http://www.w3.org/1999/xhtml\">\n"
                    + "<head>\n"
                    + "<meta name=\"viewport\" content=\"width=device-width\" />\n"
                    + "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n"
                    + "<title>NUST Online Application</title>\n"
                    + "</head>\n"
                    + "<body style=\"margin:0px; background: #f8f8f8; \">\n"
                    + "<div width=\"100%\" style=\"background: #f8f8f8; padding: 0px 0px; font-family:arial; line-height:28px; height:100%; width: 100%; color: #514d6a;\">\n"
                    + "<div style=\"max-width: 700px; padding:0px 0; margin: 0px auto; font-size: 14px\">\n"
                    + "<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"width: 100%; margin-bottom: 20px\">\n"
                    + "<tbody>\n"
                    + "<tr>\n"
                    + "<td style=\"width:900px;height:165px;vertical-align: top; padding-bottom:5px;\" align=\"center\"><a href=\"#\" target=\"_blank\"><img src=\"\" alt=\"\" style=\"border:none\"><br/>\n"
                    + "<img src=\"https://images.unsplash.com/photo-1519897831810-a9a01aceccd1?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=889&q=80\" alt=\"Providing you with fresh supplies\" style=\"border:none\"></a> </td>\n"
                    + "</tr>\n"
                    + "</tbody>\n"
                    + "</table>\n"
                    + "<div style=\"padding: 40px; background: #fff;\">\n"
                    + "<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"width: 100%;\">\n"
                    + "<tbody>\n"
                    + "<tr>\n"
                    + "<td><b>Dear " + name + " " + surname + "   :</b>\n"
                    + "<p>Thank you for shopping with us in the year 2020</p>\n"
                    + "<p></p>\n"
                    + "<p</p>\n"
                    + "<p>\n"
                    + "This email serves to notify you that there are fresh supplies available on sale at 20% off.</p>\n"
                    + "Kindly login on to our platform to view goods on sale .</p>\n"
                    + "<p>If you have a question or would like to share your feedback, please contact us on the following Email : freshsupplies@gmail.com</p>\n"
                    + "                        <b>- Thank You (FreshSupplies Team)</b> </td>\n"
                    + "                </tr>\n"
                    + "                </tbody>\n"
                    + "            </table>\n"
                    + "        </div>\n"
                    + "        <div style=\"text-align: center; font-size: 12px; color: #b2b2b5; margin-top: 20px\">\n"
                    + "            <p> Powered by Fresh Team<br>\n"
                    + "                <a href=\"javascript: void(0);\" style=\"color: #b2b2b5; text-decoration: underline;\"></a> </p>\n"
                    + "        </div>\n"
                    + "    </div>\n"
                    + "</div>\n"
                    + "</body>\n"
                    + "</html>", "text/html");

            System.out.println("Mail Session has been created successfully******************");
            // Step3

            Transport transport = null;
            transport = getMailSession.getTransport("smtp");
            // Enter your correct gmail UserID and Password
            // if you have 2FA enabled then provide App Specific Password
           transport.connect("smtp.gmail.com", "freshsuppliess@gmail.com", "January2019January2019");//relay.nust.ac.zw


            System.out.println(":Transport connection established****************Attempting to send email*******");

            transport.sendMessage(generateMailMessage, generateMailMessage.getAllRecipients());

        } catch (Exception ex) {
            Logger.getLogger(EmailSender.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
