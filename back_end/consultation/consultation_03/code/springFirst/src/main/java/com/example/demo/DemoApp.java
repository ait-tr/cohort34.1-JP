package com.example.demo;

import com.example.demo.entity.Person;
import com.example.demo.repository.PersonRepository;
import com.example.demo.repository.PersonRepositoryImpl;
import com.example.demo.service.PersonService;

public class DemoApp {
    public static void main(String[] args) {

        PersonRepository personRepository = new PersonRepositoryImpl();
        PersonService personService = new PersonService(personRepository);

        personService.addPerson(new Person(1,"John", 30));
        personService.addPerson(new Person(2,"Bill", 35));
        personService.addPerson(new Person(3,"Robert", 27));

        System.out.println(personService.findAll());

    }
}
