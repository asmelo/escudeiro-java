package com.db1.plataforma.questao8;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

    public static void main(String[] args) {

        //Diferente do HashSet o LinkedHashSet implementa a interface Set utilizando uma tabela hash e uma "linked list" que irá conter a ordem de inserção dos elementos.
        //Por utilizar uma tabela hash o LinkedHashSet também oferece uma performance constante (O(1)) na execução dos métodos add, remove, contains e size, contudo sua performance
        //é inferior ao HasSet por conta do controle da ordenação dos elementos. Em relação ao TreeSet o LinkedHashSet possui uma performance muito maior na manipulação dos seus elementos.
        //Assim como o hashSet a implementação do LinkedHashSet também não é sincronizada.

        //Portanto devemos usar o LinkedHashSet quando não puder existir elementos duplicados, quando a ordem de inserção dos elementos for importante e quando uma alta performace na
        //manipulação dos elementos seja importante.

        Set<String> soccerTeams = new LinkedHashSet<>();

        //Times inseridos em ordem alfabética
        soccerTeams.add("Flamengo");
        soccerTeams.add("Palmeiras");
        soccerTeams.add("São Paulo");
        soccerTeams.add("Vasco");

        //Elementos sendo inseridos pela segunda vez
        soccerTeams.add("Flamengo");
        soccerTeams.add("Vasco");

        //Ao listar os elementos do "Set" percebemos que eles não foram duplicados
        //Percebemos também que foi preservada a ordem que os elementos foram inseridos
        System.out.println("Elementos do conjuto de times de futebol: " + soccerTeams);

    }

}
