package com.example.demo.service;

import com.example.demo.entity.Person;
import com.example.demo.repository.PersonRepository;

import java.util.List;

public class PersonService {

    private PersonRepository repository;

    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }

    public void addPerson(Person person) {
        // - проверить корректность данных
        // - дополнительная бизнес-логика
        // - наш метод будет получать не полные данные, а только те которые нам может передать пользователь
        repository.addPerson(person);
    }

    public List<Person> findAll() {
        return repository.findAll();
    }

}
