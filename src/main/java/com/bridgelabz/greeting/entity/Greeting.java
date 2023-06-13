package com.bridgelabz.greeting.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@Entity
@Data
public class Greeting {

    @Id
    private Long id;
    private String message;
}
