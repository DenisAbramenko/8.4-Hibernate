package com.example.hibernate.controller;

import com.example.hibernate.entity.Persons;
import com.example.hibernate.service.PersonsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
public class PersonsController {
    private final PersonsService personsService;

    @GetMapping("/persons/by-city")
    public List<Persons> getPersonsByCity(@RequestParam("city") String city) {
        return personsService.getPersonsByCity(city);
    }

    @GetMapping("/persons/age-less-than")
    public List<Persons> getPersonByAgeLessThanOrderBy(int age) {
        return personsService.getPersonsByAgeLessThanOrderBy(age);
    }

    @GetMapping("/persons/by-name-and-surname")
    public Optional<Persons> getPersonByNameAndSurname(String name, String surname) {
        return personsService.getPersonByNameAndSurname(name, surname);
    }

    @PostMapping("/persons/save")
    public Persons save(Persons person) {
        return personsService.save(person);
    }

    @GetMapping("/persons/count")
    public Long count() {
        return personsService.count();
    }

    @PostMapping("/persons/delete-list")
    public void deleteAllPersons(List<Persons> personList) {
        personsService.deleteAllPersons(personList);
    }
}
