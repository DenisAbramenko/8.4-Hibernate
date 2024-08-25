package com.example.hibernate.service;

import com.example.hibernate.entity.Persons;
import com.example.hibernate.repository.PersonsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonsService {
    private final PersonsRepository repository;

    public PersonsService(PersonsRepository repository) {
        this.repository = repository;
    }

    public List<Persons> getPersonsByCity(String city) {
        return repository.findByCityOfLiving(city);
    }

    public List<Persons> getPersonsByAgeLessThanOrderBy(int age) {
        return repository.findByAgeLessThanOrderByAge(age);
    }

    public Optional<Persons> getPersonByNameAndSurname(String name, String surname) {
        return repository.findByNameAndSurname(name, surname);
    }

    public Persons save(Persons person) {
        return repository.save(person);
    }

    public Long count() {
        return repository.count();
    }

    public void deleteAllPersons(List<Persons> personList) {
        repository.deleteAll(personList);
    }
}
