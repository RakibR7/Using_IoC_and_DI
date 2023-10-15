package atu.ie.project_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final EmailService emailService;

    @Autowired
    public UserService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void registerUser(String name, String email) {

        //String username = userDetails.getName();
        //String email = userDetails.getEmail();
        emailService.sendEmail(email , "Welcome to out platform");
    }
}

