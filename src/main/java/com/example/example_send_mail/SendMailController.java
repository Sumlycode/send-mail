package com.example.example_send_mail;

import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendMailController {
    @Autowired
    private SendMailService mailService;

    @GetMapping("/send-email")
    public String sendEmail() {
        try {
            mailService.sendEmail("xp55220012@gmail.com", "Subject of the email", "Body of the email");
            return "Email sent successfully!";
        } catch (MessagingException e) {
            return "Failed to send email: " + e.getMessage();
        }
    }
}
