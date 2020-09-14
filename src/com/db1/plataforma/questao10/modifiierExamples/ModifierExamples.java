package com.db1.plataforma.questao10.modifiierExamples;

import com.db1.plataforma.questao10.modifiierExamples.service.Person;

public class ModifierExamples {

    public static void main(String[] args) {
        Person paulo = new Person("Paulo", 45, "Desenvolvedor");
        System.out.println("Os dados de Paulo são: " + paulo);

        //Como a variável name possui o modificador protected ela não pode ser acessada diretamente por esta classe pois
        //não pertence ao mesmo pacote, por isso acessamos o name através do método getName.
        //O atributo species possui o modificador public portanto é possível acessá-la diretamente
        System.out.println(String.format("A espécie de %s é %s ", paulo.getName(), paulo.species));

        //A manipulação das variáveis encapsuladas na classe Person é feita pela própria classe. Externamente executamos apenas
        //seus métodos públicos
        paulo.didBithday();
        paulo.gotNewJob("Advogado");

        System.out.println("Após fazer aniversário e trocar de trabalho os dados de Paulo são: " + paulo);
    }

}
