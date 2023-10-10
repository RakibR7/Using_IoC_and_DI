package atu.ie.project_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class UserController {
    private final UserController emailService;

    @Autowired
    public UserController(UserController emailService) {
        this.emailService = emailService;
    }

    @GetMapping ("registerUser/{name}/{email}")
    public String UserDetails(@PathVariable String name, @PathVariable String email) {
        return UserDetails(name, email);
    }

    public void registerUser(String username, String email){
        emailService.registerUser(email, "Welcome to our platform");
    }
}


