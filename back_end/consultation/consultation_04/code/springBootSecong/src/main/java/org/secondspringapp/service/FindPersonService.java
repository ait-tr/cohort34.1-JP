package org.secondspringapp.service;

import org.secondspringapp.entity.Person;
import org.secondspringapp.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindPersonService {
    private final PersonRepository personRepository;

    public FindPersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> findAll(){
        return personRepository.findAll();
    }
}
