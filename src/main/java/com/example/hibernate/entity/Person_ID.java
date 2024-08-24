package com.example.hibernate.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class Person_ID {
    private String name;
    private String surname;
    private int age;
}
