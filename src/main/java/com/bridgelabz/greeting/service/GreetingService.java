package com.bridgelabz.greeting.service;

import com.bridgelabz.greeting.entity.Greeting;
import com.bridgelabz.greeting.entity.User;

import java.util.List;

public interface GreetingService {

    Greeting addGreeting(User user);
    Greeting fetchGreetingById(Long id);
    List<Greeting> getAllList();
}
