package com.example.demo;

import com.example.demo.entity.Person;
import com.example.demo.service.PersonService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoAppWithJavaConfig {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        PersonService personService = context.getBean(PersonService.class);

        personService.addPerson(new Person(1,"John", 30));
        personService.addPerson(new Person(2,"Bill", 35));
        personService.addPerson(new Person(3,"Robert", 27));

        System.out.println(personService.findAll());

    }
}
