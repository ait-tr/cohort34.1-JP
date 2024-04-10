package org.secondspringapp.repository;


import org.secondspringapp.entity.Person;

import java.util.List;

public interface PersonRepository {

    public boolean addPerson(Person person);

    public List<Person> findAll();

}
