package com.example.hibernate.controller;

import com.example.hibernate.entity.Persons;
import com.example.hibernate.repository.PersonsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PersonsController {
    private final PersonsRepository personsRepository;

    @GetMapping("/persons/by-city")
    public List<Persons> getPersonsByCity(@RequestParam("city") String city) {
        return personsRepository.getPersonsByCity(city);
    }
}
