package com.bridgelabz.greeting.service;

import com.bridgelabz.greeting.entity.Greeting;
import com.bridgelabz.greeting.entity.User;

public interface GreetingService {

    Greeting addGreeting(User user);
    Greeting fetchGreetingById(Long id);
}
