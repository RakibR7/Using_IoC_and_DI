package atu.ie.project_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private EmailService emailService;

    @Autowired
    public UserService() {
        this.emailService = new EmailService();
    }
    public void registerUser(String name, String email){
        emailService.sendEmail("Welcome to our platform ", name +"/n "+ email);
    }
}