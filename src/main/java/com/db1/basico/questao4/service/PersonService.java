package com.db1.basico.questao4.service;

import com.db1.basico.questao4.model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonService {

    public PersonService() {
    }

    public List<Person> findAll() {
        List<Person> people = new ArrayList<>();
        Long totalPerson = Runtime.getRuntime().maxMemory();

        for (int i = 0; i < totalPerson; i++) {
            people.add(new Person("Name " + i, i));
        }

        return people;
    }

    public List<Person> findAll(int page, int size) {
        List<Person> people = new ArrayList<>();
        int firstPerson = page * size;
        int lastPerson = firstPerson + size;

        for (int i = firstPerson; i < lastPerson; i++) {
            people.add(new Person("Name " + i, i));
        }

        return people;
    }

}
