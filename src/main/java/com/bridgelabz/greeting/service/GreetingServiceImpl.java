package com.bridgelabz.greeting.service;

import com.bridgelabz.greeting.entity.Greeting;
import com.bridgelabz.greeting.entity.User;
import com.bridgelabz.greeting.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingServiceImpl implements GreetingService {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    @Autowired
    private GreetingRepository greetingRepository;
    @Override
    public Greeting addGreeting(User user) {
        String message = String.format(template, (user.toString().isEmpty()) ? "Hello World" : user.getFirstName()+" "+user.getLastName());
        return greetingRepository.save(new Greeting(counter.incrementAndGet(),message));
    }


}
