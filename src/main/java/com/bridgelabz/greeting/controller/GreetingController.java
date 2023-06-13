package com.bridgelabz.greeting.controller;

import com.bridgelabz.greeting.entity.Greeting;
import com.bridgelabz.greeting.entity.User;
import com.bridgelabz.greeting.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {
    @Autowired
    private GreetingService greetingService;

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(defaultValue = "World") String firstName, String lastName) {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        return greetingService.addGreeting(user);
    }
    @GetMapping("/get/{id}")
    public Greeting fetchGreetingById(@PathVariable Long id) {
        return greetingService.fetchGreetingById(id);
    }
}

