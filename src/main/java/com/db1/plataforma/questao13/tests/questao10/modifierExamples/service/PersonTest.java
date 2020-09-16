package com.db1.plataforma.questao13.tests.questao10.modifierExamples.service;

import com.db1.plataforma.questao10.modifiier_examples.service.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person person = new Person("Carla", 25, "Dentista");

    @Test
    public void should_increment_age_correctly() {
        person.didBithday();
        assertEquals(26, person.getAge());
    }

    @Test
    public void should_get_new_job_correctly() {
        String newJob = "Desenvolvedor";
        person.gotNewJob(newJob);
        assertEquals(newJob, person.getEmployment());
    }

    @Test
    public void should_convert_to_string_correctly() {
        String expected = "Person{name='Carla', age=25, employment='Dentista', species='Homo sapiens'}";
        String personStr = person.toString();
        assertEquals(expected, personStr);
    }

}