package atu.ie.project_2;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/users")
    @ResponseStatus(HttpStatus.CREATED)
    public String registerUser(@RequestBody UserDetails person) {
        //"User registered! Name: " + userDetails.getName() + ", Email: " + userDetails.getEmail()
        //System.out.println("User ID: "+userDetails.getName());
        //System.out.println("User ID: "+userDetails.getEmail());
        userService.registerUser(person.getName(), person.getEmail());
        return "nice2";
    }
}

