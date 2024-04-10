package org.secondspringapp.controller;


import lombok.RequiredArgsConstructor;
import org.secondspringapp.entity.Person;
import org.secondspringapp.service.AddPersonService;
import org.secondspringapp.service.FindPersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
@RequiredArgsConstructor
public class PersonController {

    private final AddPersonService addPersonService;
    private final FindPersonService findPersonService;

    @GetMapping // /localhost:8080/persons/all
    public List<Person> findAllPersons() {
        return findPersonService.findAll();
    }

    @PostMapping("/add")// /localhost:8080/persons/add
    public boolean addPerson(@RequestBody Person person) {
        return addPersonService.addNewPerson(person);
    }

}
