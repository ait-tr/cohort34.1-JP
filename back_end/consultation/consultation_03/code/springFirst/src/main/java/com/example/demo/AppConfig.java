package com.example.demo;

import com.example.demo.repository.PersonRepository;
import com.example.demo.repository.PersonRepositoryImpl;
import com.example.demo.service.PersonService;
import org.springframework.context.annotation.Bean;

public class AppConfig {

    @Bean
    public PersonRepository personRepository() {
        return new PersonRepositoryImpl();
    }

    @Bean
    public PersonService personService(PersonRepository personRepository) {
        return new PersonService(personRepository);
    }

}
