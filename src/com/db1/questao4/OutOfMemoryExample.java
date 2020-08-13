package com.db1.questao4;

import com.db1.questao4.model.Person;
import com.db1.questao4.service.PersonService;

import java.util.List;
import java.util.StringJoiner;

public class OutOfMemoryExample {

    //É preciso ter cuidado ao consultar de dados e carregar em memória. Caso Seja uma quantidade muito grande pode
    //gerar OutOfMemoryError
    public static void main(String[] args) {
        PersonService personService = new PersonService();
        List<Person> personList = personService.findAll();

        for (Person person : personList) {
            System.out.println(String.join(person.getName(), ", ", person.getAge().toString()));
        }
    }

}
