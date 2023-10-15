package atu.ie.project_2;

import org.springframework.stereotype.Service;

@Service
public class EmailService {
    public void sendEmail(String to, String message) {
        //message = "Thank you " + to + " for nothing";
        String mMessage = "Thank you " + to + " for nothing";
    }
}
