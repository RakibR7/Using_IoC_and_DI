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
    @PostMapping("/users")
    @ResponseStatus(HttpStatus.CREATED)
    public UserDetails registerUser(@RequestBody UserDetails userDetails) {
        //userService.registerUser(userDetails);
        //"User registered! Name: " + userDetails.getName() + ", Email: " + userDetails.getEmail()
        System.out.println("User ID: "+userDetails.getName() );
        System.out.println("User ID: "+userDetails.getEmail() );
        return userDetails;
    }
}

