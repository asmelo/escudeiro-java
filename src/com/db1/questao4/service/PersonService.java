package com.db1.questao4.service;

import com.db1.questao4.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class PersonService {

    public PersonService() {
    }

    public List<Person> findAll() {
        List<Person> persons = new ArrayList<>();
        Long totalPerson = Runtime.getRuntime().maxMemory();

        for (int i = 0; i < totalPerson; i++) {
            persons.add(new Person("Name " + i, i));
        }

        return persons;
    }

    public List<Person> findAll(int page, int size) {
        List<Person> persons = new ArrayList<>();
        int firstPerson = page * size;
        int lastPerson = firstPerson + size;

        for (int i = firstPerson; i < lastPerson; i++) {
            persons.add(new Person("Name " + i, i));
        }

        return persons;
    }

}
