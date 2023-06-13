package com.bridgelabz.greeting.repository;

import com.bridgelabz.greeting.entity.Greeting;
import com.bridgelabz.greeting.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GreetingRepository extends JpaRepository<Greeting,Long> {


}
