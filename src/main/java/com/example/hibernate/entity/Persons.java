package com.example.hibernate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "PERSONS")
public class Persons {
    @EmbeddedId
    private Person_ID personId;
    @Column(name = "phone_number")
    private String phone_number;
    @Column(name = "city_of_living")
    private String city_of_living;
}
