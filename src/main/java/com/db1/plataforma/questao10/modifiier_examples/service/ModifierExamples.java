package com.db1.plataforma.questao10.modifiier_examples.service;

public class ModifierExamples {

    public static void main(String[] args) {
        Person paulo = new Person("Paulo", 45, "Desenvolvedor");

        //Como a variável name possui o modificador default (ou package) é possível acessá-la diretamente por esta classe pois pertence ao mesmo pacote
        System.out.println(String.format("O nome da pessoa é " + paulo.name));
    }

}
