package com.db1.plataforma.questao9;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LinkedHashMapExample {

    public static void main(String[] args) {

        /*
        Diferente do HashMap o LinkedHashMap implementa a interface Map utilizando uma tabela hash e uma "linked list" que irá conter a ordem de inserção dos elementos.
        Por utilizar uma tabela hash o LinkedHashMap também oferece uma performance constante (O(1)) na execução dos métodos add, remove, contains, contudo sua performance
        é inferior ao HashMap por conta do controle da ordenação dos elementos. Em relação ao TreeMap o LinkedHashMap possui uma performance muito maior na manipulação dos seus elementos.
        Assim como o HashMap a implementação do LinkedHashMap também não é sincronizada.

        Portanto devemos usar o LinkedHashMap quando a ordem de inserção dos elementos for importante e quando uma alta performace na
        manipulação dos elementos seja importante.
         */

        //Exemplo de uso do TreeMap

        Map<Integer, String> summary = new LinkedHashMap<>();

        summary.put(1, "Introdução");
        summary.put(7, "Profissionalismo");
        summary.put(8, "Assumindo Responsabilidade");
        summary.put(11, "Primeiro, não cause danos");
        summary.put(16, "Ética de Trabalho");
        summary.put(22, "Bibliografia");
        summary.put(23, "Dizendo não");

        //Ao listar os mapeamentos podemos verificar que a ordem de inserção dos mapeamentos foi preservada
        System.out.println("Sumário do Clean Coder: ");
        summary.entrySet().forEach(System.out::println);

    }

}
