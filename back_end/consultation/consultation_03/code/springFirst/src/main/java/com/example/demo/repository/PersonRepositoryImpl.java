package com.example.demo.repository;

import com.example.demo.entity.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonRepositoryImpl implements PersonRepository{
//
//    ArrayList ; - использует массив
//
//    LinkedList; - связанный список
//
//    HashMap; - ключ - значение
//
//    HashSet;  - уникальные элементы, использует hashMap где в качестве ключа выступает hashcode() нашего объекта
//
//    TreeSet; - наши объекты обязательно должны иметь "правила сравнения" - Comparator / Comparable
//

    private List<Person> persons = new ArrayList<>();

    @Override
    public void addPerson(Person person) {
        persons.add(person);
    }

    @Override
    public List<Person> findAll() {
        return persons;
    }
}
