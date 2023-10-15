package atu.ie.project_2;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    //@PostMapping("/registerUser/{name}/{email}")
    @PostMapping("/registerUser")
    @ResponseStatus(HttpStatus.CREATED)
    public String registerUser(@RequestBody UserDetails userDetails){     //we want a post request
        // Pass the extracted name and email to the UserService
        //System.out.println("User ID: "+user.getUserName());
        //System.out.println("User ID: "+user.getEmail());

        userService.registerUser(userDetails);
        //return "User registered! " + name + " " + email;
        return "User registered! Name: " + userDetails.getName() + ", Email: " + userDetails.getEmail();
    }
}

