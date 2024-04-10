package org.secondspringapp.repository;

import org.secondspringapp.entity.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class PersonRepositoryImpl implements PersonRepository{

    List<Person> persons = new ArrayList<>();


    @Override
    public boolean addPerson(Person person) {
        return persons.add(person);
    }

    @Override
    public List<Person> findAll() {
        return persons;
    }
}
