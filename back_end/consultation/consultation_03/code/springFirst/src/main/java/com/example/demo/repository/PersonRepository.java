package com.example.demo.repository;

import com.example.demo.entity.Person;

import java.util.List;

public interface PersonRepository {

    public void addPerson(Person person);

    public List<Person> findAll();

}
