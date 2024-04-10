package org.secondspringapp.service;


import org.secondspringapp.entity.Person;
import org.secondspringapp.repository.PersonRepository;
import org.springframework.stereotype.Service;

@Service
public class AddPersonService {

    private final PersonRepository personRepository;

    public AddPersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public boolean addNewPerson(Person person) {
        return personRepository.addPerson(person);
    }
}
