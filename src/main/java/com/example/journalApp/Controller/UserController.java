package com.example.journalApp.Controller;

import com.example.journalApp.Entity.User;
import com.example.journalApp.Repository.UserRepository;
import com.example.journalApp.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;
//    @Autowired
//    private WeatherService weatherService;

//    @GetMapping
//    public List<User> getAllUsers() {
//        return userService.getAll();
//    }

    @PutMapping
    public ResponseEntity<?> updateUser(@RequestBody User user) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String userName = authentication.getName();
        User userInDb = userService.findByUserName(userName);
        userInDb.setUserName(user.getUserName());
        userInDb.setPassword(user.getPassword());
        userService.saveNewUser((userInDb));
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping
    public ResponseEntity<?> deleteByUsername() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        userRepository.deleteByUserName(authentication.getName());
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

//    @GetMapping
//    public ResponseEntity<?> greeting() {
//        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//        WeatherResponse weatherResponse = weatherService.getWeather("Mumbai");
//        String greeting = "";
//        if (weatherResponse != null) {
//            greeting = ", Weather feels like " + weatherResponse.getCurrent().getFeelslike();
//        }
//        return new ResponseEntity<>("Hi " + authentication.getName() + greeting, HttpStatus.OK);
//    }

}
