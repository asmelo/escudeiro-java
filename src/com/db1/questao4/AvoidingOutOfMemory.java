package com.db1.questao4;

import com.db1.questao4.model.Person;
import com.db1.questao4.service.PersonService;

import java.util.List;

public class AvoidingOutOfMemory {

    //Uma forma de evitar consultar de dados e carregar em memória é criar um esquema de paginação, onda
    //a cada requisição é passado como parâmetro uma página e o tamanho da página, evitando assim carregar
    //todos os dados de uma só vez.
    public static void main(String[] args) {
        PersonService personService = new PersonService();
        List<Person> page1 = personService.findAll(0, 5);

        for (Person person : page1) {
            System.out.println(String.join(", ", person.getName(), person.getAge().toString()));
        }

        List<Person> page2 = personService.findAll(1, 5);

        for (Person person : page2) {
            System.out.println(String.join(", ", person.getName(), person.getAge().toString()));
        }
    }

}
