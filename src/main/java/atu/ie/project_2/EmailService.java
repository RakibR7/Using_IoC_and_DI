package atu.ie.project_2;

import org.springframework.stereotype.Service;

@Service
public class EmailService {
    public void sendEmail(String to, String message) {
        //String mMessage = "Thank you " + to + " for nothing";
        System.out.println(message);
    }
}
