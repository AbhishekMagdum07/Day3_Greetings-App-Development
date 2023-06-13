package com.bridgelabz.greeting.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Greetings")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Greeting {

    @Id
    private long id;
    private String message;
}
