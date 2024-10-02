package com.example.journalApp.Controller;

import com.example.journalApp.Entity.User;
import com.example.journalApp.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("public")
public class PublicController {

    @Autowired
    private UserService userService;

    @GetMapping("/health-check")
    public String healthCheck() {
        return "Ok";
    }

    @PostMapping("/create-user")
    public void createUser(@RequestBody User user) {
        userService.saveEntry(user);
    }

}
