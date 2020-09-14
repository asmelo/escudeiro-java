package com.db1.plataforma.questao10.modifiierExamples.service;

public class Person {

    //Os atributos relacionadas às pessoas são encapsulados na classe Person

    //Modificador Public possiblita que a variável seja acessada por qualquer outra classe
    public final String species = "Homo sapiens";

    //O Modificador padrão protected permite que o atributo seja acessado apenas pelas classes do mesmo pacote
    String name;

    //O Modificador private permite que o atributo seja acessado apenas dentro do escopo em que se encontra, neste caso a clase Person
    private int age;
    private String employment;

    public Person(String name, int age, String employment) {
        this.name = name;
        this.age = age;
        this.employment = employment;
    }

    public void didBithday() {
        age++;
    }

    public void gotNewJob(String employment) {
        this.employment = employment;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", employment='" + employment + '\'' +
                ", species='" + species + '\'' +
                '}';
    }
}
